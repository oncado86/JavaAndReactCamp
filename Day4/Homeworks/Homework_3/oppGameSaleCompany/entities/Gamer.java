package Homeworks.Homework_3.oppGameSaleCompany.entities;

import java.util.ArrayList;

public class Gamer extends User {

    private ArrayList<Game> games;

    public Gamer() {
    }

    public Gamer(String firstName, String lastName, String userName, String password, String yearOfBirth,
            String nationalIdentity) {
        super(firstName, lastName, userName, password, yearOfBirth, nationalIdentity);
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(Game... games) {
        ArrayList<Game> getGames = new ArrayList<>();
        for (Game g : games) {
            getGames.add(g);
        }
        this.games = getGames;
    }
}
