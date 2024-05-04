import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate

        HashSet<String> uniqueNames = new HashSet<>(names); // Add all elements to a HashSet (stores unique values only)

        if (uniqueNames.size() < names.size()) {
            System.out.println("Duplicate elements found!");
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
