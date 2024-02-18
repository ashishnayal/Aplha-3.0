// Program to print the Transpose matrix of the given matrix
/*public class Assignment4 {
        public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 7}, {5, 6, 7} };
        // Display original matrix
        printMatrix(matrix);
        // Transpose the matrix
        int[][] transpose = new int[column][row];
            for(int i = 0; i<row; i++) {
                 for (int j = 0; j<column; j++) {
                    transpose[j][i] = matrix[i][j];
                }   
            }
        // print the transposed matrix
        printMatrix(transpose);
        }
        public static void printMatrix(int[][] matrix) {
            System.out.println("The matrix is: ");
            for(int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            System.out.println();
            } 
         } 
}*/
import java.util.Scanner;
class Assignment4{
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array Element:");
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Array looks like this:");
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Transpose array is looks like this:");
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}

    
