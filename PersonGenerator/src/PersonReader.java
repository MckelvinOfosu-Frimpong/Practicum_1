import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;
import javax.swing.JFileChooser;


public class PersonReader {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String rec = "";

        try {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                System.out.printf("%-15s%-20s%-20s%-20s%-20s", "ID#", "firstName", "lastName", "Title", "YOB");
                System.out.println("\n===============================================================================");
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputStream in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));
                while (reader.ready()) {
                    rec = reader.readLine();
                    String[] splitValue = rec.split(", ");
                    System.out.printf("\n%-15s%-20s%-20s%-20s%-20s", splitValue[0], splitValue[1], splitValue[2], splitValue[3], splitValue[4]);
                }
                reader.close();
                System.out.println("\n\nData file read!");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
