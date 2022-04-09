import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        boolean YN;

        do {
            totalPrice += SafeInput.getRangedDouble(in, "Enter your item price", .50, 10.00);
            YN = SafeInput.getYNConfirm(in, "Do you have more items?");

        }while(YN);
        System.out.printf("The total cost: $" + totalPrice);



    }

    }
