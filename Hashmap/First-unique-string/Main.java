import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word:");
        String word = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // First pass: Count the frequency of each character
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Second pass: Find the first character that appears only once
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (map.get(ch) == 1) {
                System.out.println("The first unique character is '" + ch + "' at index " + i);
                return;
            }
        }

        // If no unique character is found
        System.out.println("No unique character found.");
    }
}


