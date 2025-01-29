

public class Main {

    public static void main(String[] args) {

        // Grid measurements
        int numRows = 20, numColumns = 20;

        // Position for placing the object (X)
        int squareRowPos = 4, squareColPos = 8;

        // 2D array
        String[][] grid = new String[numRows][numColumns];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {

                // Set boundaries of the grid
                if (row == 0 || row == numRows - 1 || col == 0 || col == numColumns - 1) {
                    grid[row][col] = "#"; // Grid outline
                }
                // Set the position of the square 'X'
                else if (row == numRows / squareRowPos - 1 && col == numColumns / squareColPos - 1) {
                    grid[row][col] = "X"; // Object location in the grid
                }
                // Empty space inside the grid
                else {
                    grid[row][col] = " ";
                }

                // Print grid element
                System.out.print(grid[row][col]);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

