public class Main {
    public static void main(String[] args) {
        int rows = 4; // Number of rows

        // Initialize variables
        int i = 1;
        int j;

        // Outer loop to iterate through rows
        while (i <= rows) {
            j = 1;
            // Inner loop to print '*' based on the current row
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i++;
        }
    }
}
