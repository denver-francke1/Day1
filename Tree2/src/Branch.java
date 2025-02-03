class Branch {
    private String symbol = "/";  // Symbol used for the branch



    // Method to create a branch with a specific size
    public void createBranch(Grid grid, int startRow, int startCol, int size, boolean isLeft) {
        int n = size; // Branch size (small, medium, or large)

        // Generate the branch, placing it left or right of the trunk
        for (int i = n - 1; i >= 0; i--) {
            int row = startRow - (n - 1 + i);  // Determine row placement

            if (isLeft) {
                // Left branch
                grid.setObject(row, startCol - i, "/");
                grid.setObject(row, startCol - i - 1, "/");
            } else {
                // Right branch
                grid.setObject(row, startCol + i, "/");
                grid.setObject(row, startCol + i + 1, "/");
            }
        }
    }
}



