import java.util.Scanner;
//
public class Main {

  //  Logger logger =  Logger.getLogger(Main.class.getName());

    class Traingle { //Pattern a


        public Traingle(int count){
            for (int rows =0; rows<= count ; rows++){



                for(int column =0; column <= rows; column++){
                    System.out.print(" #");
                    // logger.info("#");
                }
                System.out.println();
                //logger.info("\n");
        }

        }
    }


    class UpsideDownTraingle { // Pattern b



        public UpsideDownTraingle(int count){

            for (int rows = count; rows >= 0; rows--){
                for (int column = 0; column< rows; column++){
                    System.out.print("#");
                    //logger.info("#");
                }
                System.out.println();
                //logger.info("\n");
            }
        }
    }


    class UpsideDownRightTraingle { //Pattern c

        public UpsideDownRightTraingle(int count){

            for(int rows = 1; rows <= count; rows++){

                for (int spaces = count - rows; spaces >0 ; spaces--){
                    System.out.print(" ");
                }

                for (int column= 1; column <= rows; column++){
                    System.out.print("#");
                    //logger.info("#");
                }
                System.out.println();
                //logger.info("\n");
            }

        }
    }


    class StairwayTraingle{ //Pattern d



        public StairwayTraingle(int count){

            for (int rows = 1; rows <= count; rows++){

                for (int spaces= count-rows; spaces >= 0; spaces-- ){
                    System.out.print(" ");

                }

                for (int colums=1; colums <= rows; colums++){
                    System.out.print("#");
                }

                System.out.println();
            }
        }
    }


    class BoxOutline{ //Pattern e



        public BoxOutline(int count){
            for(int rows = 1; rows <= count; rows++){
                for (int column = 1; column <= count; column++){
                    if ( column ==1 || rows==1|| column==count|| rows == count ){
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.println();

            }
        }
    }

    class ZPattern { // Pattern f



        public ZPattern(int count){
            for (int rows =1; rows <= count; rows++){
                for(int column =1 ; column <= count; column++){
                    if (rows == 1|| rows == count){
                        System.out.print("#");
                    }else if(column == (count-rows+1)){
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    class ReverseZPattern{ //Pattern g

        public ReverseZPattern(int count){
            for(int rows = 1; rows <= count; rows++){
                for(int column = 1; column <= count; column++){
                    if (rows==1||rows==count){
                        System.out.print("#");
                    }else if(column == rows){
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }

    class XPattern{ //Pattern h

        public XPattern(int count){
            for (int rows=1; rows<=count; rows++){
                for(int colunm =1; colunm<=count; colunm++){
                    if(rows==1|| rows == count){
                        System.out.print("#");
                    }else if(colunm==rows){
                        System.out.print("#");

                    }else if(colunm == (count-rows+1)){
                        System.out.print("#");

                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }

    class XPatternBox{ //Pattern i

        public XPatternBox(int count){
            for (int row =1; row <= count;row++ ){
                for (int colunm = 1; colunm <= count; colunm++){
                    if (row==1||row==count||colunm==1||colunm==count){
                        System.out.print("#");
                    } else if( colunm == row){
                        System.out.print("#");
                    }else if(colunm== (count-row+1)){
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.println();

            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();



        System.out.println("Enter a letter to select a pattern (a-i)");
        char pattern = scanner.next().charAt(0);

        System.out.print("Enter the number of rows (count): ");
        int count = scanner.nextInt();




            switch (pattern) {
                case 'a':
                     main.new Traingle(count);
                    break;
                case 'b':
                    main.new UpsideDownTraingle(count);
                    break;
                case 'c':
                    main.new UpsideDownRightTraingle(count);
                    break;
                case 'd':
                    main.new StairwayTraingle(count);
                    break;
                case 'e':
                    main.new BoxOutline(count);
                    break;
                case 'f':
                    main.new ZPattern(count);
                    break;
                case 'g':
                    main.new ReverseZPattern(count);
                    break;
                case 'h':
                    main.new XPattern(count);
                    break;
                case 'i':
                    main.new XPatternBox(count);
                    break;
                default:
                    System.out.println("Invalid input. Please enter a letter between a-i.");


            }

            scanner.close();


    }
}