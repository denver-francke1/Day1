class Ground {

    private String groundSymbol = "-";

    public void placeGround(Grid grid) {
        int lastRow = grid.getRowCount() - 1; // Get the last row index
        for (int colIndex = 0; colIndex < grid.getColCount(); colIndex++) {
            grid.setObject(lastRow, colIndex, groundSymbol);
        }
    }

}