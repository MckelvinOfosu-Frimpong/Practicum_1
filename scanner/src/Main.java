import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String trash;
        double salary = 0;

        System.out.print("enter username: ");
        String userName = console.nextLine();
        System.out.println("Username is " +userName);

        System.out.print("Enter your Age: ");
        if(console.hasNextInt())
        {
            int age = console.nextInt();
            console.nextLine();
            System.out.println("Age is: " + age);
        }
        else // dont have a number
        {
            trash = console.nextLine();
            System.out.println("Illegal number: " + trash);
            System.out.println("exiting.... run the program again!");
            System.exit(0);
        }
        System.out.print("enter salary: ");
        if(console.hasNextDouble())
        {
            salary = console.nextDouble();
            console.nextLine();
        }
       else // dont have a number
       {
           trash = console.nextLine();
           System.out.println("Illegal number: " + trash);
           System.out.println("exiting.... run the program again!");
           System.exit(0);
       }
        // formatted print
        System.out.printf("%10.2f",salary);
    }

}
