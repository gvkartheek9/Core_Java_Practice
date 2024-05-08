import java.util.Scanner;

public class CircleCircumference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }
}
