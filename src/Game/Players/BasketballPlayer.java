package Game.Players;

import Game.BasketballField;

public abstract class BasketballPlayer {
    String playerName;
    String playerSurName;
    int playerAge;
    String jerseyNumber;
    double height;
    double wingspan;
    double shooting;
    double blocking;
    public double shootingChance(double shooting){
        this.shooting = shooting;
        shooting = (shooting / this.height);
        return shooting;
    }

    public  double blockingChance(double blocking){
        this.blocking = blocking;
        blocking = (blocking * this.height);
        return blocking;
    }
    public BasketballPlayer(String playerName,String playerSurName,int playerAge,double height,double wingspan, double shooting, double blocking){
        this.playerName = playerName;
        this.playerSurName = playerSurName;
        this.playerAge = playerAge;
        this.height = height;
        this.wingspan = wingspan;
        this.shooting = shooting;
        this.blocking = blocking;
        System.out.println("Name : " +playerName + " SurName : " + playerSurName + " Age : " + playerAge );
        System.out.println("Height : " + height + " Wingspan : " + wingspan);

    }
}
