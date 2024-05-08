public class ExpressionEvaluation {

    public static void main(String[] args) {
        int a = 20; // Predefined value for a
        int b = 10; // Predefined value for b

        // 1. int b = a-- - --a;
        System.out.print("a-- - --a is: ");
        int temp1 = a--;  // Post-decrement: b gets the original value of a (20)
        b = temp1 - (--a); // Pre-decrement: a becomes 18, then subtracted from temp1 (20)

        System.out.println(b);  // Output: 2

        // 2. int c = a--;
        System.out.print("a-- is: ");
        int c = a--;  // Post-decrement: c gets the original value of a (18)
        System.out.println(c);  // Output: 18

        // 3. int d = a>>2;
        System.out.print("a>>2 is: ");
        int d = a >> 2; // Right shift by 2 bits (18 divided by 2^2)
        System.out.println(d);  // Output: 4

        // 4. int e = a&b;
        System.out.print("a&b is: ");
        int e = a & b; // Bitwise AND of a (18) and b (10)
        System.out.println(e);  // Output: 0 (no common 1 bits)
    }
}
