import java.util.Scanner;

public class Main {

    public static String fullMove(String move) {
        if (move.equalsIgnoreCase("R")) {
         return "Rock";
        } else if (move.equalsIgnoreCase("P")) {
            return "Paper";
        } else if (move.equalsIgnoreCase("S")) {
            return "Scissors";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args)
    {
        Scanner game = new Scanner(System.in);
        boolean done = false;
        boolean TF = false;
        String YN = "";

        System.out.println("Time to play Rock, Paper, Scissors!");
        do {

            System.out.print("Player 1, Rock, Paper, or Scissors? [R/P/S]: ");
            String player1 = game.nextLine();
            while (!(player1.equalsIgnoreCase("R") || player1.equalsIgnoreCase("P") || player1.equalsIgnoreCase("S")))
            {
                System.out.print("Not a valid input. Please input R, P or S: ");
                player1 = game.nextLine();
            }

            System.out.print("Player 2, Rock, Paper, or Scissors? [R/P/S]: ");
            String player2 = game.nextLine();
            while (!(player2.equalsIgnoreCase("R") || player2.equalsIgnoreCase("P") || player2.equalsIgnoreCase("S")))
            {
                System.out.print("Not a valid input. Please input R, P or S: ");
                player2 = game.nextLine();
            }

            if (player1.equalsIgnoreCase("R") && player2.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers rock, Player 2 is the winner!");
            }
            else if (player1.equalsIgnoreCase("R") && player2.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks scissors, Player 1 wins!");
            }
            else if (player1.equalsIgnoreCase("P") && player2.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers rock, Player 1 wins!");
            }
            else if (player1.equalsIgnoreCase("P") && player2.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors cut paper, Player 2 wins!");
            }
            else if (player1.equalsIgnoreCase("S") && player2.equalsIgnoreCase("R"))
            {
                System.out.println("Rock breaks scissors, Player 2 wins!");
            }
            else if (player1.equalsIgnoreCase("S") && player2.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cut paper, Player 1 wins!");
            }
            else
            {
                String fullMove1 = fullMove(player1);
                String fullMove2 = fullMove(player2);
                System.out.printf("%s vs %s, Tie game!\n", fullMove1, fullMove2);
            }
                do {
                    System.out.print("Do you wanna play again? [Y/N]: ");

                    if (game.hasNext())
                    {
                        YN = game.nextLine();
                        if (YN.equalsIgnoreCase("Y") | (YN.equalsIgnoreCase("N")))
                        {
                            done = true;
                        }
                        else
                        {
                            done = false;
                            System.out.println("\nYou must enter Y or N not: " + YN);
                        }

                    }

                }while(!done);
                if (YN.equalsIgnoreCase("Y"))
                {
                    TF = true;
                }

        }while(TF);
        if (YN.equalsIgnoreCase("N"))
        {
            System.out.println("Thanks for playing! See you later!");
        }

    }
}
