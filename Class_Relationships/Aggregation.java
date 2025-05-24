import java.util.ArrayList;
import java.util.List;

class Player {
    String name;

    Player (String name) {
        this.name = name;
    }
}

class Team {
    String teamName;
    List<Player> players = new ArrayList<>();

    Team(String teamName) {
        this.teamName = teamName;
    }

    void addPlayer(Player player) {
        players.add(player);
    }

    void showTeam() {
        System.out.println("Team: " + teamName + " has players:");
        for (Player player : players) {
            System.out.println("- Player: " + player.name);
        }
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");

        Team team = new Team("Warriors");
        team.addPlayer(player1);
        team.addPlayer(player2);

        team.showTeam(); // Output: Team: Warriors has players: - Player: Alice - Player: Bob
    }
}