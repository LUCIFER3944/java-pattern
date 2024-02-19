
public class index13 {
    public static void main(String[] args) {
        int height = 5; // You can adjust the height as needed
        for (int i = height - 1; i >= 0; i--) {
            for (int j = 0; j <= 2 * height - 1; j++) {
                if (j >= height - i && j <= height + i) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= 2 * height - 1; j++) {
                if (j >= height - i && j <= height + i) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
