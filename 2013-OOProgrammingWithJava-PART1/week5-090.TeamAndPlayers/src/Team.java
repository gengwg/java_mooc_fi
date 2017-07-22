/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wg
 */
import java.util.*;

public class Team {

    final private String name;
    private int size = 0;
    private int maxSize = 16;
    final private ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.size < this.maxSize) {
            this.players.add(player);
            this.size++;
        }

    }

    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.size;
    }
    
    public int goals() {
        int team_goals = 0;
        for (Player player : this.players) {
            team_goals += player.goals();
        }
        return team_goals;
    }
}
