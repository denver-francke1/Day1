public class Main {
    public static void main(String[] args) {
           // Top part of the diamond
        for (int stars = 1; stars < 10; stars += 2) { // number of * printed in a row
            for (int spaces = 0; spaces < 9 - stars / 2; spaces++) {
                System.out.print(" ");
            }

            for (int count = 0; count < stars; count++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
          // bottom part of the diamond
        for (int stars = 7; stars > 0; stars -= 2) {
            for (int spaces = 0; spaces < 9 - stars / 2; spaces++) {
                System.out.print(" ");
            }

            for (int count = 0; stars < stars; count++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}