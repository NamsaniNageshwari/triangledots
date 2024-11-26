public class Triangle{
    public static void main(String[] args) {
        int n = 5;  // You can change this value to control the size of the triangle

        // Outer loop for number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print dots in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(". ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

