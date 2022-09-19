import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator
{
    public static void main(String[] args)
    {
        ArrayList<String> persons = new ArrayList<>();
        Scanner in =new Scanner(System.in);
        String IDNum;
        String FName;
        String Lname;
        String Title;
        int YOB;
        boolean done = false;
        boolean doneYN;
        String person;

        //Get the data and user Input by using an arraylist to collect the data
        do
        {
            IDNum = SafeInput.getNonZeroLenString(in, "Enter your ID number");
            FName = SafeInput.getNonZeroLenString(in, "Enter your First Name");
            Lname = SafeInput.getNonZeroLenString(in, "Enter your Last Name");
            Title = SafeInput.getNonZeroLenString(in, "Enter your Title");
            YOB = SafeInput.getInt(in, "Enter your Year of birth");

            person = IDNum + ", " + FName + ", " + Lname + ", " + Title + ", " + YOB;

            persons.add(person);


            doneYN = SafeInput.getYNConfirm(in, "Are you done?");
            if (doneYN)
            {
                done = true;
            }

        } while (!done);
        System.out.println(persons);

        try
        {
            //Go through the data and save it to a text file
            //TODO Add code to prompt user for base name add .txt extension on
            File workingDirectory = new File(System.getProperty("user.dir"));
            Path file = Paths.get(workingDirectory.getPath() + "/src/PersonTestData.txt");
            System.out.println("file name is " + file);

            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));


            for (String p:persons)
            {
                //write p to disk
                writer.write(p, 0, p.length());
                writer.newLine();  // adds the new line
            }
            writer.close(); // must close the file to seal it and flush buffer
            System.out.println("Data file written!");

        }
           catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
