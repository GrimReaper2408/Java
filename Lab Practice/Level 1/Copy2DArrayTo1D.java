import java.util.Scanner;
class Copy2DArrayTo1D 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[] array = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                array[index++] = matrix[i][j];
            }
        }
        System.out.print("The elements of the 1D array are: ");
        for (int i = 0; i < index; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

