package Game;
import java.lang.String;
public class BasketballField {
   public String field[][] = new String[10][32];
    public void printBasketballField(){
/*
       for(int i = 0 ; i<10;i++){
            for(int j = 0; j<32; j++){
                if(i == 0 || j == 0 ) {
                    System.out.print(field[i][j] = "T ");

                } else if (i == 9 ||j == 31) {
                    System.out.print(field[i][j] = "S ");
                }
                else {
                    System.out.print(field[i][j] = " ");
                }

            }
            System.out.println();
        }
 */
        for(int i = 0; i<10; i++){
            for (int j = 0 ; j<32;j++){
                if(i == 0 || i == 9 || j == 0 || j == 31){
                    field[i][j] = " T";
                }
                else {
                    field[i][j] = " O";
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
}
