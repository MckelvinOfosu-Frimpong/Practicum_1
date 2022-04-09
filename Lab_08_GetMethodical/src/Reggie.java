import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans = "";
        boolean run = true;


        String socialSecurityNum = SafeInput.getRegExString(in, "Enter your social security number", "^[0-9]{3}-[0-9]{2}-[0-9]{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number", "(M|m)\\d{5}");
        String menuChoice = SafeInput.getRegExString(in, "Select a menu choice [O=Open | S=Save | V=View | Q=Quit]", "(O|o|S|s|V|v|Q|q)");
    }

}
