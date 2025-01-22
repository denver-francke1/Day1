public class Main {


    public static void main(String[] args) {
        // Top half of the reverse diamond
        for (int stars = 9; stars > 0; stars -= 2) {
            for (int space = 0; space < 9 - stars / 2; space++) {
                System.out.print(" ");
            }

            for (int count = 0; count < stars; count++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half of the reverse diamond
        for (int stars = 3; stars <= 9; stars += 2) {
            for (int space = 0; space < 9 - stars / 2; space++) {
                System.out.print(" ");
            }

            for (int count = 0; count < stars; count++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}