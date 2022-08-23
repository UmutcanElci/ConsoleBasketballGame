package Game;
import java.awt.desktop.SystemEventListener;
import java.lang.String;
import java.util.Scanner;

public class BasketballField {
    Scanner input = new Scanner(System.in);
    public int row = 10;
    public int col = 32;
   public String field[][] = new String[row][col];



    public void printBasketballField(){

        for(int i = 0; i<row; i++){
            for (int j = 0 ; j<col;j++){
                if(i == 0 || i == 9 || j == 0 || j == 31){
                    field[i][j] = " T";
                }
                else {
                    field[i][j] = " O";
                }
            }
        }

        int moveRow,moveCol,choice;
        /*
        System.out.println("What row you want to start default 5");
        moveRow = input.nextInt();
        System.out.println("What col you want to start default 8");
        moveCol = input.nextInt();

         */
        while (true){
            System.out.println("Enter the row : ");
            moveRow = input.nextInt();
            System.out.println("Enter the col : ");
            moveCol = input.nextInt();
            field[moveRow][moveCol] = " P";
            break;
            /*
            choice = input.nextInt();
            if (choice == 1){
                field[moveRow][moveCol-1] = " P" ;
                break;
            }
            else if(choice == 2){
                field[moveRow][moveCol+1] = " P" ;
                break;
            } else if (choice == 3) {
                field[moveRow+1][moveCol] = " P" ;
                break;
            } else if (choice == 4) {
                field[moveRow-1][moveCol] = " P" ;
                break;
            }
            else {
                System.out.println("Wrong input");
            }

             */
        }

        for(int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void printFieldRule(){
        for(int i = 0; i<10; i++){
            for (int j = 0 ; j<32;j++){
                if((j > 0 && j < 7 && i > 0 && i < 9) || (j > 24 && j < 31 && i > 0 && i < 9)){
                    field[i][j] = " 2";
                }
                else if(i == 0 || i == 9 || j == 0 || j == 31){
                    field[i][j] = " T";
                }
        else {
                    field[i][j] = " 3";
                }
            }
        }
        for(int i = 0; i<10; i++){
            for (int j = 0; j<32; j++){
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }
        
    }


        /*
        while (true){
            if (a == 1){
                field[row][col+1] = "P";
            } else if (a == 2) {

            } else if (a == 3) {

            } else if (a == 4) {

            }
            else {
                System.out.println("Wrong Input!");
            }
        }

         */
    }

    /*public void printField(){

        for (int i = 0; i < row+1; i++) {
            for (int j = 0; j < col+1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

     */



