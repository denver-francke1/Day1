public class Main {
    public static void main(String[] args) {

        int count=5;

        for(int rows= count; rows >= 0; rows--){
            for(int stars = 0 ; stars <= rows; stars++){
                System.out.print("#");
            }

            System.out.println();
        }


    }
}