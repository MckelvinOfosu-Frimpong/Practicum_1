import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age =0;
        String trash = "";
        Boolean doneAge =false;

        do
        {
            System.out.print("Enter your Age 18-69: ");
            if(in.hasNextInt())
            {
                age = in.nextInt();
                in.nextLine();
                if (age >=18 && age<=69)
                {
                    System.out.println("Your age is " + age);
                    doneAge = true;
                }
                else
                {
                    System.out.println("You must enter a number between 18-69!");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " Try again!");

            }
        } while(!doneAge);


        Random rnd = new Random();

        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(10) + 1;

        while (die1 != die2);
        {
             die1 = rnd.nextInt(6) + 1;
             die2 = rnd.nextInt(6) + 1;
            System.out.printf("You rolled %3d %3d\n", die1, die2);
        }

        for (int row = 0; row <=12; row ++)
        {

            for (int col = 0; col <= 12; col++)
            {
                System.out.printf("%5d", row * col);
            }
        }


    }
}
