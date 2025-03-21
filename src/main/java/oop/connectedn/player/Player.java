package oop.connectedn.player;

public class Player {
    private String username;
    private String playerColor;
    private int score;


    public Player(String username, String playerColor) {
        this.username = username;
        this.playerColor = playerColor;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int getScore() {
        return this.score;
    }
}
