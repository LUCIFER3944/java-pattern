public class index14 {
    public static void main(String[] args) {
        int height = 5; // You can adjust the height as needed

        // Print the connected triangle
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" x");
            }
            System.out.println(""); // Move to the next line after each row
        }

        // Print the mirrored connected triangle
        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" x");
            }
            System.out.println(""); // Move to the next line after each row
        }
    }
}
