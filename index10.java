public class index10 {
    public static void main(String[] args) {
        int height = 5; // You can adjust the height as needed

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height * 2 - 1; j++) {
                if (j == height - i || j == height + i || (i == height / 2 && j >= height / 2 && j <= height + height / 2)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
