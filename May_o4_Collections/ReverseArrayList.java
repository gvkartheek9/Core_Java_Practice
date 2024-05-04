import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Method 1: Using a loop (manual reversal)
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(numbers.size() - 1 - i));
            numbers.set(numbers.size() - 1 - i, temp);
        }

        System.out.println("Reversed (manual): " + numbers);

        // Method 2: Using Collections.reverse()
        Collections.reverse(numbers);
        System.out.println("Reversed (Collections.reverse()): " + numbers);
    }
}
