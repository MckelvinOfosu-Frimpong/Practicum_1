import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a message to print: ");
        String msg = in.nextLine();
//
        SafeInput.prettyHeader(msg);
    }
}
