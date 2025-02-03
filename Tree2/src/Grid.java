class Grid {
    private int rowCount, colCount;
    private String[][] grid;

    // Constructor: Initializes the grid
    public Grid(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.grid = new String[rowCount][colCount];  // Initialize grid
    }
    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }
    // Method to fill the grid with a specific character
    public void fillGrid(char symbol) {
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            for (int colIndex = 0; colIndex < colCount; colIndex++) {
                grid[rowIndex][colIndex] = String.valueOf(symbol);
            }
        }

    }


    public void setObject(int row, int col, String symbol) {
        if (row >= 0 && row < rowCount && col >= 0 && col < colCount) {
            grid[row][col] = symbol;
        }
    }


    // Method to print the grid
    public void printGrid() {
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            for (int colIndex = 0; colIndex < colCount; colIndex++) {
                System.out.printf("%3s ", grid[rowIndex][colIndex]); // Formatting for alignment
            }
            System.out.println();
        }
    }
}