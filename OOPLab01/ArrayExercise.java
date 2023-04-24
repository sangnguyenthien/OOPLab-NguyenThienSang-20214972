package OOPLab01;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayExercise {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array: ");
        String input = scanner.nextLine();    // get the entire line after the prompt

        String[] numbersStr = input.split(" "); // split by spaces
        int[] a = new int[numbersStr.length];

        for(int i=0; i< numbersStr.length; i++)
        {
            a[i] = Integer.parseInt(numbersStr[i]);
        }

        Arrays.sort(a);

        int sum=0;

        System.out.print("The sorted array is: ");
        for(int i : a)
        {
            System.out.print(i + " ");
            sum += i;
        }

        int avg = sum/a.length;

        System.out.println("\nSum of array elements: " + sum);
        System.out.println("Average value of array elements: " + avg);






    }
}
