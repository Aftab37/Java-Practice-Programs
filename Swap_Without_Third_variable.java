import java.util.Scanner;
public class Swap_Without_Third_variable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        SwapWithoutThirdVariable(m, n);
    }
    static void SwapWithoutThirdVariable(int a, int b){
        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("Swapping Done");
        System.out.println(a);
        System.out.println(b);
    }
}
