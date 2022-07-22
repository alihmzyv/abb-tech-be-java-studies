package july2222.HakcerRank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RankingApp {
    public static void main(String[] args) {
    }
    //Algorithms preparation

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        int[] rankings = new int[ranked.size()];
        int[] playerRankings = new int[player.size()];
        int[] rankedArr = ranked.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        int[] playerArr = player.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        //give rankings according to scoreboard
        int lastRank = 1;
        for (int i = 0; i < rankedArr.length; i++) {
            if (i == 0 || rankedArr[i] == rankedArr[i-1]) {
                rankings[i] = lastRank;
            }
            else {
                rankings[i] = ++lastRank;
            }
        }

        //give rankings according to each score of player
        for (int i = 0; i < playerArr.length; i++) {
            if (i!=0 && playerArr[i] == playerArr[i-1]) {
                playerRankings[i] = playerRankings[i-1];
                continue;
            }
            for (int j = 0; j < rankedArr.length; j++) {
                if (playerArr[i] >= rankedArr[j]) {
                    playerRankings[i] = rankings[j];
                    break;
                }
            }

            if (playerRankings[i] == 0) {
                playerRankings[i] = rankings[rankings.length - 1] + 1;
            }
        }

        return Arrays.stream(playerRankings).boxed().collect(Collectors.toList());
    }

}
