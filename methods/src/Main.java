import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
    boolean done = false;
    Scanner in = new Scanner(System.in);

    String continueYN = "";
    String trash = "";
    double rawVal = 0;
    double doubledVal =0;

    double rawcVal = 0;
    double calcFVal = 0;


	do
    {
        System.out.print("enter the raw value: ");
        if (in.hasNextDouble())
        {
            rawVal = in.nextDouble();
            in.nextLine();
            doubledVal = doubleYourFun(rawVal);
            System.out.println("The doubled val is: " + doubledVal);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Enter a valid number, not: " + trash);
        }

        System.out.print("enter the C value: ");
        if (in.hasNextDouble())
        {
            rawcVal = in.nextDouble();
            in.nextLine();
            calcFVal = CtoF(rawcVal);
            System.out.println("The doubled val is: " + calcFVal);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Enter a valid number, not: " + trash);
        }


        System.out.print("Continue [Y/N]: ");
        continueYN = in.nextLine();
        if (continueYN.equalsIgnoreCase("N"))
        {
            done = true;
        }

    }while (!done);

    }
    //Static methods go here
    private static double doubleYourFun(double val2double)
    {
      double retVal = 2 * val2double;

      return retVal;
    }

    private static double CtoF(double cVal)
    {
        //F = C * 1.8 + 32
        return cVal * 1.8 + 32;

    }

}
