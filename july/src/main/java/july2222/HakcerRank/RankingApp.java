package july2222.HakcerRank;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RankingApp {
    public static void main(String[] args) {
    }
    //Algorithms preparation

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        int[] rankings = new int[ranked.toArray().length];
        int[] playerRankings = new int[player.toArray().length];


        //give rankings according to scoreboard
        int lastRank = 1;
        for (int i = 0; i < ranked.toArray().length; i++) {
            if (i == 0 || ranked.get(i).equals(ranked.get(i-1))) {
                rankings[i] = lastRank;
            }
            else {
                rankings[i] = ++lastRank;
            }
        }

        //give rankings according to each score of player
        for (int i = 0; i < player.toArray().length; i++) {
            if (i!=0 && player.get(i).equals(player.get(i-1))) {
                playerRankings[i] = playerRankings[i-1];
                continue;
            }
            for (int j = 0; j < ranked.toArray().length; j++) {
                if (player.get(i) >= ranked.get(j)) {
                    playerRankings[i] = rankings[j];
                    break;
                }
            }

            if (playerRankings[i] == 0) {
                playerRankings[i] = rankings[rankings.length - 1] + 1;
            }
        }

        return IntStream.of(playerRankings).boxed().collect(Collectors.toList());
    }

}
