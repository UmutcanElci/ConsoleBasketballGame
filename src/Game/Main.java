package Game;
import Game.Players.BasketballPlayer;
import Game.Players.Position.PointGuard;
import java.util.Scanner;
import java.lang.String;
import java.util.Random;
public class Main {
   public static BasketballPlayer player1 = new PointGuard("Stephen","Curry",33,6.1,6.1,99.9,62.1);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        BasketballField field = new BasketballField();
        System.out.println("Welcome to the Console Basketball Game!");
        System.out.println("To start with you have 3 choice move shoot and timeout");
        System.out.println("If you want to end the game type 5");
        System.out.println("You can see this field map to which zone is 2 points or 3 points");
        field.printFieldRule();

        while (true){
            System.out.println("1-Move\n2-Shoot \n3-Timeout\n4-Field Rule\n5-Exit");
            choice = input.nextInt();

                if (choice > 5 || choice < 1) {
                    System.out.println("Wrong input\nEnter again");
                }
                else if(choice == 1){
                    //System.out.println("Which way you want to move?");
                    //System.out.println("To left 1\nTo right 2\nTo up 3\nTo down 4");
                    field.printBasketballField();

                }
                else if(choice == 2){
                    isItIn();
                }
                else if(choice == 3){
                    System.out.println("Timeout");

                }
                else if(choice == 4){
                    System.out.println("Field Rule");
                    field.printFieldRule();

                }
                else {
                    System.out.println("By!");
                    break;
                }
        }
    }
    public static void isItIn(){
         Random random = new Random();
       int value = (int) player1.shootingChance(99.9);
       int randNum = random.nextInt(100);
       randNum = randNum +1;
       if(randNum<=value){
           System.out.println("It's in!\n");
       }
       else {
           System.out.println("Missed!\n");
       }
    }

}