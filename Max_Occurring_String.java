import java.util.Scanner;
import java.util.HashMap;

public class Max_Occurring_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char max_word = giveMaxOccurring(word);
        System.out.println(max_word);
    }

    static char giveMaxOccurring(String str) {
        HashMap<Character, Integer > map = new HashMap<>();

        int n = str.length();
        int count = 0;
        char ans = 0;

        for (int i = 0; i < n; i++){
            char curr_char = str.charAt(i);
            map.put(curr_char, map.getOrDefault(curr_char, 0) + 1 );

            if (count < map.get(curr_char)){
                ans = curr_char;
                count = map.get(curr_char);
            }

        }


        return ans;
    }
}

