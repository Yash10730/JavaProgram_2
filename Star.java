public class Star {
    public static void main(String[] args) {
        // Outer loop for number of rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars in a row
            System.out.println();
        }
    }
}
