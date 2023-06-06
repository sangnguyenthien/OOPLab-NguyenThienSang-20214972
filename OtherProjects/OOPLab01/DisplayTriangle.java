package OOPLab01;
import java.util.Scanner;
public class DisplayTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        for (int i = 1; i <= n; i++) {
            //System.out.print(" " * (n - i) + "*" * (2 * i - 1));
            for(int j = 0; j<n-i; j++) System.out.print(" ");
            for(int j=0; j<2*i-1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
