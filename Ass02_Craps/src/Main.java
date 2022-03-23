import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int roll;
        int point = 0;
        boolean finish;
        finish = false;
        String restart;
        do {

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            roll = die1 + die2;
            //
            if (roll == 2 || roll == 3 || roll == 12) {

                System.out.println("Die 1: " + die1);
                System.out.println("Die 2: " + die2);
                System.out.println("Sum: " + roll);
                System.out.println("You crapped out! You lose!");
                System.out.println("Would you like to play again? [Y/N]: ");
                restart = scan.nextLine();
                if (restart.equalsIgnoreCase("N")) {
                    finish = true;

                } else if (restart.equalsIgnoreCase("Y")){
                    finish = false;
                    point = 0;
                }
            }else {
                if (point != 0 && roll == 7) {
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + roll);
                    System.out.println("You rolled a 7! You lose!");
                    System.out.println("Would you like to play again? [Y/N]: ");
                    restart = scan.nextLine();
                    if (restart.equalsIgnoreCase("N")) {
                        finish = true;

                    } else if (restart.equalsIgnoreCase("Y")){
                        finish = false;
                        point = 0;
                    }
                } else {


                    if (roll == 7 || roll == 11) {

                        System.out.println("Die 1: " + die1);
                        System.out.println("Die 2: " + die2);
                        System.out.println("Sum: " + roll);
                        System.out.println("You rolled a natural! You Win!");
                        System.out.println("Would you like to play again? [Y/N]: ");
                        restart = scan.nextLine();
                        if (restart.equalsIgnoreCase("N")) {
                            finish = true;

                        }
                        else if (restart.equalsIgnoreCase("Y"))
                        {
                            finish = false;
                        }
                    } else {
                        if (roll == point) {
                            System.out.println("Die 1: " + die1);
                            System.out.println("Die 2: " + die2);
                            System.out.println("Sum: " + roll);
                            System.out.println("You rolled the point! You Win!");
                            System.out.println("Would you like to play again? [Y/N]: ");
                            restart = scan.nextLine();
                            if (restart.equalsIgnoreCase("N")) {
                                finish = true;

                            }
                            else if (restart.equalsIgnoreCase("Y"))
                            {
                                finish = false;
                            }
                        } else {
                            point = roll;
                            System.out.println("Die 1: " + die1);
                            System.out.println("Die 2: " + die2);
                            System.out.println("Sum: " + roll);

                            System.out.println("Your new point is " + point + ".");
                        }
                    }
                }


            }
        }


        while (finish == false);
        System.out.println("Thank you for playing!");
    }
}
