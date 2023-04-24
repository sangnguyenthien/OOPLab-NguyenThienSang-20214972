package OOPLab01;
import java.util.Scanner;
public class AddTwoMatrices {
    public static void main(String[] args)
    {
        int m, n;

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran m x n: ");
        m = in.nextInt();
        n = in.nextInt();

        int[][] matrix_1 = new int[m][n];
        int[][] matrix_2 = new int[m][n];
        int[][] result_matrix = new int[m][n];

        System.out.println("Nhap ma tran thu nhat:");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix_1[i][j] = in.nextInt();
            }
        }

        System.out.println("Nhap ma tran thu 2:");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix_2[i][j] = in.nextInt();
            }
        }

        //Calculate
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                result_matrix[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        System.out.println("Tong cua 2 ma tran: ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(result_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
