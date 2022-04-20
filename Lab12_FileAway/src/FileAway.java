import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileAway
{
    public static void main(String[] args) {
        Scanner inFile;
        JFileChooser chooser = new JFileChooser();

        String line;
        int linesNum = 0;
        int wordsNum = 0;
        int charNum = 0;

        Path target = new File(System.getProperty("user.dir")).toPath();
        target = target.resolve("src");
        chooser.setCurrentDirectory(target.toFile());

        try {
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                target = chooser.getSelectedFile().toPath();
                inFile = new Scanner(target);

                System.out.println("File: " + target.getFileName());
                while (inFile.hasNextLine())
                {
                    line = inFile.nextLine();
                    linesNum++;
                    charNum += line.length();
                    wordsNum += new StringTokenizer(line, " ,").countTokens();
                }
                inFile.close();
                System.out.printf("Lines: %d\nWords: %d\nCharacters: %d\n", linesNum, wordsNum, charNum);
            }
            else
            {
                System.out.println("You must select a file! Terminating program...");
                System.exit(0);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("IOException Error");
            e.printStackTrace();
        }
    }
}
