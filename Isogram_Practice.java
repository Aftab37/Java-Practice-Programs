import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Isogram_Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(IsIsogram(s)){
            System.out.println("This is an Isogram");
        }
        else {
            System.out.println("This not an Isogram");
        }
    }
    
    public static Boolean IsIsogram(String word) {
        Set<Character> characters = new HashSet<>();

        for (char ch : word.toCharArray()) {
            if(!characters.add(Character.toLowerCase(ch))){
                return false;
            }
        }
    return true;
    }
}
