public class NumberPattern {
    public static void main(String[] args) {
        int totalRows = 7; // Total number of rows to print
        int width = 3; // Width of each number for alignment

        // Outer loop for each row
        for (int currentRow = 1; currentRow <= totalRows; currentRow++) {
            // Calculate leading spaces (before) and trailing spaces (after) based on the row number
            int spacesBefore = (totalRows - currentRow) * 2;
            int spacesAfter = (currentRow - 1) * 2;

            // Print the leading spaces before numbers
            for (int i = 0; i < spacesBefore; i++) {
                System.out.print(" ");
            }

            // Print the increasing powers of 2
            for (int power = 0; power < currentRow; power++) {
                // Format the number to ensure consistent width
                System.out.print(String.format("%-" + width + "d", (int) Math.pow(2, power)) + " ");
            }

            // Print the decreasing powers of 2 (skip the peak, which was already printed)
            for (int power = currentRow - 2; power >= 0; power--) {
                // Format the number to ensure consistent width
                System.out.print(String.format("%-" + width + "d", (int) Math.pow(2, power)) + " ");
            }

            // Print the trailing spaces after the numbers
            for (int i = 0; i < spacesAfter; i++) {
                System.out.print(" ");
            }

            // Move to the next line after printing the current row
            System.out.println("@");
        }
    }

 
    
}
