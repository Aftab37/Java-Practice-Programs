import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(checkPrime(n));
    }



    public static String checkPrime(int n){
        int count = 0;

        if (n <= 1) {
            return "It is not a Prime number";
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count > 1) {
            return "It is not a prime number";
        } else {
            return "It is a prime number";
        }
    }
}

