package model;
import java.io.Serializable;

public class Assignment implements Serializable {
    private static final long serialVersionUID = 1L;
    private Player player;
    private Position position;
    private int matches;

    public Assignment(Player player, Position position, int matches) {
        this.player = player;
        this.position = position;
        this.matches = matches;
    }

    public Player getPlayer() { return player; }
    public Position getPosition() { return position; }
    public int getMatches() { return matches; }

    @Override
    public String toString() {
        return player.getName() + " - " + position.getName() + " - matches=" + matches;
    }
}
