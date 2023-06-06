package OOPLab01;
import java.util.Scanner;

public class DisplayNumberOfDays {
    public static int getIndexOf(String[] arr, String month)
    {
        int result=-1;
        for(int i=0; i<arr.length; i++)
        {
            if (arr[i].equals(month))
            {
                result = i;
                break;
            }
        }
        return result;
    }
    public static int[] numberOfDays(int year){
        int[] calendar={-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year%4==0 && year%100 != 0) || (year%100==0 && year%400==0))
        {
            calendar[2] = 29;
        }
        return calendar;
    }

    public static void main(String[] args)
    {
        String[] MonthInLetters={"NeverMind","Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter year: ");
        String yearStr = keyboard.nextLine();
        int year = Integer.parseInt(yearStr);

        System.out.print("Enter month: ");
        String month = keyboard.nextLine();
        int length = month.length();

        int[] calendar = numberOfDays(year);

        int monthInNumber=0;
        if ((length == 4) || (length == 3))
        {
            month = month.substring(0, 3);
            monthInNumber = getIndexOf(MonthInLetters, month);
        }
        else if (length <= 2)
        {
            monthInNumber = Integer.parseInt(month);
        }

        System.out.println("Number of days: " + calendar[monthInNumber]);
    }
}

