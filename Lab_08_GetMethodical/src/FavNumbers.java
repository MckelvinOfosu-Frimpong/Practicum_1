import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favNumber;
        double favDouble;
        favNumber = SafeInput.getInt(in, "Enter your favorite integer");
        System.out.println(" ");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("Your favorite integer is: " + favNumber + "| Your favorite double is: " + favDouble);

    }
}
