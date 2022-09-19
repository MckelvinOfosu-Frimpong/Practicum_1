import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> myArrList = new ArrayList<>();

        String ans = "";
        boolean run = true;

        do {
            ans = printMenu(in, myArrList);
            switch (ans) {
                case "A":
                    addToArrList(in, myArrList);
                    break;
                case "D":
                    deleteFromArrList(in, myArrList);
                    break;
                case "P":
                    displayArrList(myArrList);
                    break;
                case "Q":
                    if (SafeInput.getYNConfirm(in, "Are you sure? ")) {
                        run = false;
                    } else {
                        System.out.println("Returning to menu...");
                    }
                    break;
            }
        } while (run);
    }

    public static void addToArrList(Scanner in, ArrayList arrList) {
        String itemAdd = SafeInput.getNonZeroLenString(in, "What would you like to add to the array list");
        arrList.add(itemAdd);
    }

    public static void deleteFromArrList(Scanner in, ArrayList arrList) {
        int itemDelete = SafeInput.getRangedInt(in, "What item would you like to delete", 1, arrList.size());
        arrList.remove(itemDelete - 1);
    }

    public static void displayArrList(ArrayList arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
    }

    private static String printMenu(Scanner in, ArrayList arrList) {
        if (arrList.isEmpty()) {
            System.out.println("Your list is currently empty.");
        } else {
            System.out.println("Your Current List:");
            for (int i = 0; i < arrList.size(); i++) {
                System.out.printf("    %d. %s\n", i + 1, arrList.get(i));
            }
        }
        return SafeInput.getRegExString(in, "Select a menu option:\n    A: Add\n    D: Delete\n    P: Print\n    Q: Quit\n", "[AaDdPpQq]").toUpperCase();


    }
}
