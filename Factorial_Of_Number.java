import java.util.Scanner;
public class Factorial_Of_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));

    }

    public static int factorial(int a) {

        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }


        return fact;
    }
}
