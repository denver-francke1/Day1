
class Tree {


    public void assembleTree() {
        Grid treeGrid = new Grid(50, 25);
        System.out.println("Tree Grid:");
        treeGrid.fillGrid(' ');          // Fill with spaces for now
        //treeGrid.printGrid();

        Ground ground = new Ground();
        ground.placeGround(treeGrid);    // Place ground at the bottom

        Trunk trunk = new Trunk();
        trunk.createTrunk(treeGrid);


        int trunkTop = 24; // Adjust based on trunk height
        int trunkCenter = treeGrid.getColCount() / 2;

        // Create Branch objects and attach them to the trunk
        Branch smallBranch = new Branch();
        smallBranch.createBranch(treeGrid, trunkTop +9, trunkCenter, 5, true);  // Small branch
        smallBranch.createBranch(treeGrid, trunkTop +12, trunkCenter, 5, false);

        Branch mediumBranch = new Branch();
        mediumBranch.createBranch(treeGrid, trunkTop +7, trunkCenter, 7, true);  // Medium branch
        mediumBranch.createBranch(treeGrid, trunkTop +2, trunkCenter+4, 7, true);

        Branch largeBranch = new Branch();
        largeBranch.createBranch(treeGrid, trunkTop +7, trunkCenter , 9, false);  // Large branch
        //  largeBranch.createBranch(treeGrid, trunkTop - 9, trunkCenter, 9, false);

        treeGrid.printGrid();
    }
}