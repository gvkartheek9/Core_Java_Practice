import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Double> grades = new ArrayList<Double>();

        while (true) {
            System.out.println("Enter student name (or 'quit' to exit): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("Enter grade for " + name + ": ");
            double grade = scanner.nextDouble();
            names.add(name);
            grades.add(grade);
            scanner.nextLine(); // Consume extra newline character
        }

        double total = 0;
        for (double grade : grades) {
            total += grade;
        }

        double average = total / grades.size();
        System.out.println("Average grade: " + average);

        double highestGrade = grades.get(0); // Assuming at least one student
        int highestIndex = 0;
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > highestGrade) {
                highestGrade = grades.get(i);
                highestIndex = i;
            }
        }

        System.out.println("Highest grade: " + highestGrade + " by " + names.get(highestIndex));

        scanner.close();
    }
}
