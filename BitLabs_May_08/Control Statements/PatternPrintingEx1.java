public class PatternPrintingEx1 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            int num = i % 2 == 0 ? 1 : 0; 
            
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                num = num == 1 ? 0 : 1; // Toggle between 1 and 0
            }
            
            System.out.println(); 
        }
    }
}
