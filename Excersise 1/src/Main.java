import java.util.Scanner;

class HalfHollowTraingle{ // Pattern a
    int count;
    public HalfHollowTraingle(int count){
        this.count = count;
        for (int current_row = 0; current_row < count; current_row++) {
            for (int column = 0; column <= current_row; column++) {
                // Print '*' for the outline and spaces for the hollow part
                if (column == 0 || column == current_row || current_row == count - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line
        }

    }
}

class HollowTraingle{ // Pattern b
    int count;
    public HollowTraingle(int count){
        this.count = count;
        for (int currentRow = 0; currentRow < count; currentRow++) {
            for (int spaces = 0; spaces < count - currentRow - 1; spaces++) {
                System.out.print(" ");  // Print leading spaces to center the triangle
            }

            for (int column = 0; column < 2 * currentRow + 1; column++) {

                if (column == 0 || column == 2 * currentRow || currentRow == count - 1) { // print * for the first position, last position and last row
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print spaces for the middle part
                }
            }

            System.out.println(); // Go to the next line
        }

    }
}

class Diamond{ // Pattern c
    public Diamond(int count){
        // Top part of the diamond
        for (int stars = 1; stars < 10; stars += 2) { // number of * printed in a row
            for (int spaces = 0; spaces < 9 - stars / 2; spaces++) {
                System.out.print(" ");
            }

            for (int starCount = 0; starCount < stars; starCount++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // bottom part of the diamond
        for (int stars = 7; stars > 0; stars -= 2) {
            for (int spaces = 0; spaces < 9 - stars / 2; spaces++) {
                System.out.print(" ");
            }

            for (int starCount = 0; starCount < stars; count++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

class ReverseDiamond{ // Pattern d
    public ReverseDiamond(int count){
        for (int stars = count; stars > 0; stars -= 2) {
            for (int space = 0; space < count - stars / 2; space++) {
                System.out.print(" ");
            }

            for (int starCount = 0; count < stars; count++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half of the reverse diamond
        for (int stars = 3; stars <= 9; stars += 2) {
            for (int space = 0; space < 9 - stars / 2; space++) {
                System.out.print(" ");
            }

            for (int starCount = 0; count < stars; count++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


class HalfDiamond{// Pattern e
    int count;
    public HalfDiamond(int count){
        this.count = count;



        for(int rows = 1; rows <= count; rows++ ){ // top part
            for (int column =1; column <= rows; column++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int rows = count-1; rows >= 1;rows--) {
            for (int colunm = 1; colunm <= rows; colunm++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a pattern (a, b, c, d, e): ");
        char patternChoice = scanner.next().charAt(0);

        System.out.println("Enter a number (count): ");
        int count = scanner.nextInt();
        switch(patternChoice) {
            case 'a':
                new HalfHollowTraingle(count);
                break;
            case 'b':
                new HollowTraingle(count);
                break;
            case 'c':
                new Diamond(count);
                break;
            case 'd':
                new ReverseDiamond(count);
                break;
            case 'e':
                new HalfDiamond(count);
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid pattern.");
        }

        scanner.close();


    }
}