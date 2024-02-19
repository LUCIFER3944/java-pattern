`public class index9{
    public static void main(String[] args) {
        int height = 5; // You can adjust the height as needed

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if (j == height / 2 || (i == 0 && j % (height / 2) == 0) || (i == height - 1 && j % (height / 2) == 0)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
