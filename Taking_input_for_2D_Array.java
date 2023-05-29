import java.lang.reflect.Array;
import java.util.Scanner;
public class Taking_input_for_2D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = in.nextInt();
        System.out.println("Enter number of columns");
        int cols = in.nextInt();

        int [][] array_2d = new int [rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.println("Enter value for array(" + i + ", " + j + ")index." );
                array_2d [i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(array_2d[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array_2d[i][j] + " ");
            }
            System.out.println();
        }


    }

}
