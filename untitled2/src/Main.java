import java.util.Scanner;

public class RPS {

    public static String fullChoice(String choice) {
        if (choice.equalsIgnoreCase("R")) {
            return "Rock";
        } else if (choice.equalsIgnoreCase("P")) {
            return "Paper";
        } else if (choice.equalsIgnoreCase("S")) {
            return "Scissors";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        boolean done = false;
        boolean TF = false;
        String YN = " ";

        System.out.println("Welcome to Rock, Paper, Scissors!");
        do {



            System.out.print("Player A, Rock, Paper or Scissors? (R/P/S) ");
            String pAChoice = in.nextLine();
            while (!(pAChoice.equalsIgnoreCase("R") || pAChoice.equalsIgnoreCase("P") || pAChoice.equalsIgnoreCase("S"))) {
                System.out.print("Not a valid input. Please input R, P or S: ");
                pAChoice = in.nextLine();
            }

            System.out.print("Player B, Rock, Paper or Scissors? [R/P/S] ");
            String pBChoice = in.nextLine();
            while (!(pBChoice.equalsIgnoreCase("R") || pBChoice.equalsIgnoreCase("P") || pBChoice.equalsIgnoreCase("S"))) {
                System.out.print("Not a valid input. Please input R, P or S: ");
                pBChoice = in.nextLine();
            }

            if (pAChoice.equalsIgnoreCase("R") && pBChoice.equalsIgnoreCase("P")) {
                System.out.println("Paper covers rock, Player B wins!");
            } else if (pAChoice.equalsIgnoreCase("R") && pBChoice.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks scissors, Player A wins!");
            } else if (pAChoice.equalsIgnoreCase("P") && pBChoice.equalsIgnoreCase("R")) {
                System.out.println("Paper covers rock, Player A wins!");
            } else if (pAChoice.equalsIgnoreCase("P") && pBChoice.equalsIgnoreCase("S")) {
                System.out.println("Scissors cut paper, Player B wins!");
            } else if (pAChoice.equalsIgnoreCase("S") && pBChoice.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks scissors, Player B wins!");
            } else if (pAChoice.equalsIgnoreCase("S") && pBChoice.equalsIgnoreCase("P")) {
                System.out.println("Scissors cut paper, Player A wins!");
            } else
            {
                String fullChoiceA = fullChoice(pAChoice);
                String fullChoiceB = fullChoice(pBChoice);
                System.out.printf("%s vs %s, Tie game!\n", fullChoiceA, fullChoiceB);
            }

            do {
                System.out.println("Would you like to play again? [Y/N]: ");


                if (in.hasNext())
                {
                    YN = in.nextLine();
                    if (YN.equals("Y") | YN.equals("N") | YN.equals("y") | YN.equals("n"))
                    {
                        done = true;
                    }
                    else
                    {
                        done = false;
                        System.out.println("\nMust enter 'Y' or 'N' not: " + YN);
                    }


                }

            }while(!done);
            if (YN.equalsIgnoreCase("Y"))
            {
                TF = false;
            }





        }while(TF);

        System.out.println("Thank you for Playing!");

    }
}
