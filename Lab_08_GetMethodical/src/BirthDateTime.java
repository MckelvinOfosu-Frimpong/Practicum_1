import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year;
        int month;
        int dayOfMonth;
        boolean isLeapYear = false;
        int day;
        int hours;
        int minute;

        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2010);
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
            isLeapYear = true;
        }
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        switch (month) {
            case 2:
                dayOfMonth = 28;
                if (isLeapYear) {
                    dayOfMonth = 29;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
            default:
                dayOfMonth = 31;
                break;
        }

        day = SafeInput.getRangedInt(in, "Enter your birth day", 1, dayOfMonth);
        hours = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter your birth minutes", 1, 59);

        System.out.println("You were born on " + month + "/" + day + "/" + year + " at " + hours + ":" + minute);

    }

}

