import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Hashset {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputWord = in.nextLine();
        if (isIsogram(inputWord)){
            System.out.println("This is a IsoGram");
        } else {
            System.out.println("This is not a IsoGram");
        }
    }

    public static boolean isIsogram(String word){
        Set<Character> characters = new HashSet<>();
        for (char ch: word.toCharArray()){
            if (!characters.add(Character.toLowerCase(ch))){
                return false;
            }
        }
        return true;


    }


}
