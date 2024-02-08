public class index5 {
    public static void main(String[] args) {

        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Check for diagonal elements to create the specified pattern
                if (i == j || i + j == size + 1 || i == size / 2 + 1 || j == size / 2 + 1) {
                    System.out.print("x ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
