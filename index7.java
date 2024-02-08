public class index7{
    public static void main(String[] args) {
        int size = 5; // Adjust the size of the square as needed

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    // Print '*' for the border
                    System.out.print("* ");
                } else {
                    // Print space for the middle
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
