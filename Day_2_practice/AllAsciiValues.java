

public class AllAsciiValues {

    public static void main(String[] args) {
        for (int i = 0; i <= 127; i++) {
            char ch = (char) i;
            System.out.println("Character: " + ch + " - ASCII Value: " + i);
        }
    }
}
