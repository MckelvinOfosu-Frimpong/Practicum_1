import java.util.Scanner;

public class SafeInput {


    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";// Set this to zero length. Loop runs until it isn’t
        boolean done = false;
        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();
            if(retString.length() >= 1)
                done = true;
            else
                System.out.println("\nYou must enter at least one character!\nTry again!!!");
        }
        while(!done);
        return retString;

    }

    /**
     * gets an integer from the user
     *
     * @param pipe   scanner for input
     * @param prompt tells the user what you want
     * @return an integer value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;  // Set this to zero length. Loop runs until it isn’t
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Please enter an integer, not " + trash);
            }

        } while (!done);

        return retVal;
    }

    /**
     * @param pipe   scanner for input
     * @param prompt asks user for int
     * @param low    value for integer
     * @param high   value for integer
     * @return the integer
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: "); // show prompt add space
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Enter an integer in range, not " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Please enter an integer, not " + trash);
            }

        } while (!done);

        return retVal;


    }

    /**
     * @param pipe   Scanner for user input
     * @param prompt asks the user for string
     * @param regEx  is the pattern used for matching
     * @return
     */

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String result = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            result = pipe.nextLine();
            if (result.matches(regEx))
                done = true;
            else
                System.out.println("\nMust match the pattern: " + result);

        } while (!done);

        return result;
    }

    /**
     * @param pipe
     * @param prompt
     * @return
     */

    public static double getDouble(Scanner pipe, String prompt) {
        double result = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                done = true;

            } else {
                trash = pipe.nextLine();
                System.out.println("\nMust enter a double not: " + trash);
            }
        } while (!done);

        return result;

    }

    /**
     * @param pipe   the scanner for user input
     * @param prompt
     * @param low
     * @param high
     * @return
     */

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double result = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                pipe.nextLine(); // Clear the buffer
                if (result >= low && result <= high)
                    done = true;
                else {
                    System.out.println("\nValue must be in range [" + low + " - " + high + "]: " + result);
                    System.out.println("Try again!");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a correct double value not: " + trash);
            }

        } while (!done);
        return result;
    }

    /**
     * @param pipe
     * @param prompt
     * @return
     */


    public static boolean getYNConfirm(Scanner pipe, String prompt) {

        boolean TF = false;
        String result = "";
        boolean done = true;

        do {
            System.out.println(prompt + "[Y/N] : ");


            if (pipe.hasNext()) {
                result = pipe.nextLine();
                if (result.equals("Y") | result.equals("N") | result.equals("y") | result.equals("n")) {
                    done = false;
                } else {
                    System.out.println("\nMust enter 'Y' or 'N' not: " + result);
                }


            }

        } while (done);
        if (result.equalsIgnoreCase("Y")) {
            TF = true;
        }
        return TF;
    }

    /**
     *
     * @param msg
     */

    public static void prettyHeader(String msg) {
        if (msg.length() < 52) {
            int position = 0;
            int valSpacesAfter = 0;
            boolean isEvenLength = (msg.length() % 2 == 0);
            for (int i = 0; i < 3; i++) {
                if (i % 2 == 0) {
                    for(int j = 0; j < 60; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    position = (54 - msg.length());
                    System.out.print("***");
                    for (int k = 0; k < position / 2; k++) {
                        System.out.print(" ");
                    }
                    System.out.print(msg);
                    if (isEvenLength) {
                        valSpacesAfter = position / 2;
                    } else {
                        valSpacesAfter = position / 2 + 1;
                    }
                    for (int l = 0; l < valSpacesAfter; l++) {
                        System.out.print(" ");
                    }
                    System.out.println("***");
                }
            }
        } else {
            System.out.println("Your message is too long, please re-run program with a shorter message.");
        }
    }
}




