class Trunk {
    private String leftSymbol = "/";
    private String rightSymbol = "\\";
    private String middleSymbol = "|";

    public void createTrunk(Grid grid) {
        int startRow = grid.getRowCount() - 2; // Trunk starts from the second last row
        int centerColumn = grid.getColCount() / 2;  // Center column for placement

        // Place trunk with gradually decreasing width
        for (int rowIndex = startRow; rowIndex > startRow - 25; rowIndex--) {
            int trunkWidth = getTrunkWidth(rowIndex, startRow);
            int leftEdge = centerColumn - trunkWidth / 2;  // Calculate left edge for centering
            int rightEdge = leftEdge + trunkWidth - 1;  // Calculate right edge for centering

            // Place the left and right symbols to create a rough trunk outline
            if (rowIndex == startRow) {
                grid.setObject(rowIndex, leftEdge, leftSymbol);
                grid.setObject(rowIndex, rightEdge, rightSymbol);
            } else {
                // Fill the middle of the trunk with "|"
                for (int colIndex = leftEdge + 1; colIndex < rightEdge; colIndex++) {
                    grid.setObject(rowIndex, colIndex, middleSymbol);
                }
                // Place the left and right symbols to continue the outline
                grid.setObject(rowIndex, leftEdge, leftSymbol);
                grid.setObject(rowIndex, rightEdge, rightSymbol);
            }
        }
    }

    // Method to control the width of the trunk at different heights
    private int getTrunkWidth(int currentRow, int startRow) {
        int rowDistance = startRow - currentRow;

        if (rowDistance < 7) {
            return 14 - rowDistance * 2; // Start from 14 and decrease width
        } else if (rowDistance < 10) {
            return 12 - rowDistance; // From 10 to 7 width
        } else {
            return 4; // Constant width of 7 after the 10th row
        }
    }
}

