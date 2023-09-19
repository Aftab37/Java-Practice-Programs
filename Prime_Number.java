import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(CheckPrime(n));
    }

    public static String CheckPrime(int n){
        int Count = 0;
        String NonPrime = "It is not a Prime Number";
        String Prime = "It is a Prime Number";
        if (n < 1) {
           return NonPrime;
        }

        for(int i = 2; i <= n; i++) {
            if (n % i == 0){
                Count++;
            }
        }

        if (Count > 1){
            return NonPrime;
        } else {
            return Prime;
        }
    }
}
