import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductReader
{
    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String rec = "";

        try
        {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                System.out.printf("%-15s%-20s%-30s%-30s", "ID#", "Name", "Description", "Cost");
                System.out.println("\n===============================================================================");
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputStream in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));
                while (reader.ready())
                {
                    rec = reader.readLine();
                    String[] splitValues = rec.split(", ");
                    System.out.printf("\n%-15s%-20s%-30s%-30s", splitValues[0], splitValues[1], splitValues[2], splitValues[3]);
                }
                reader.close();
                System.out.println("\n\nData file read!");
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!!!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
