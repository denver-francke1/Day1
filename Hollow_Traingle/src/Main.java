import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int noOfRows = sc.nextInt();

        for (int currentRow = 0; currentRow < noOfRows; currentRow++) {
            for (int spaces = 0; spaces < noOfRows - currentRow - 1; spaces++) {
                System.out.print(" ");  // Print leading spaces to center the triangle
            }

            for (int column = 0; column < 2 * currentRow + 1; column++) {

                if (column == 0 || column == 2 * currentRow || currentRow == noOfRows - 1) { // print * for the first position, last position and last row
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print spaces for the middle part
                }
            }

            System.out.println(); // Go to the next line
        }
    }
}