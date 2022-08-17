package Game;
import java.lang.String;
public class BasketballField {
    String field[][] = new String[10][32];
    public BasketballField(){
        for(int i = 0 ; i<10;i++){
            for(int j = 0; j<32; j++){
                if(i == 0 || j == 0 ) {
                    System.out.print(field[i][j] = " T");

                } else if (i == 9 ||j == 31) {
                    System.out.print(field[i][j] = " S");
                }
                else {
                    System.out.print(field[i][j] = "");
                }

            }
            System.out.println();
        }

    }


}
