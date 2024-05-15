package Sets_may_15;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueWordUsingHashSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        String[] words = sentence.split(" ");
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        System.out.println("Unique words and their counts:");
        for (String word : uniqueWords) {
            int count = 0;
            for (String sentenceWord : words) {
                if (word.equals(sentenceWord)) {
                    count++;
                }
            }
            System.out.println(word + " : " + count);
        }

    }
}
