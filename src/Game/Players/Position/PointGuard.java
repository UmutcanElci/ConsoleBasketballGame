package Game.Players.Position;

import Game.Players.BasketballPlayer;

public class PointGuard extends BasketballPlayer {

    public PointGuard(String playerName, String playerSurName, int playerAge, double height, double wingspan, double shooting, double blocking) {
        super(playerName, playerSurName, playerAge, height, wingspan, shooting, blocking);
        System.out.println(" Position : PG");
    }
}
