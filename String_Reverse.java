import java.util.Scanner;
public class String_Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(StringReverser(str));
    }

    public static String StringReverser(String word) {

        String rev_str = "";

        System.out.println("original word");
        System.out.println(word);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            rev_str = ch + rev_str;
        }

        System.out.println("Reversed word");
        return rev_str;
    }
}
