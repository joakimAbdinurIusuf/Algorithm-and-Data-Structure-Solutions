package Arrays;

import java.util.*;

public class TournamentWinner {

    final int HOME_TEAM_WON = 1;
  
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
      
      HashMap<String, Integer> scores = new HashMap<>();
      String currentBestTeam = "";
      scores.put(currentBestTeam, 0);
  
      for (int i = 0; i < results.size(); i++) {
        ArrayList<String> teams = competitions.get(i);
        String homeTeam = teams.get(0);
        String awayTeam = teams.get(1);
        String winningTeam = "";
          
        int result = results.get(i);
  
        if (result == HOME_TEAM_WON) {
          winningTeam = homeTeam;
        } else {
          winningTeam = awayTeam;
        }
  
        if (!scores.containsKey(winningTeam)) {
          scores.put(winningTeam, 0);
        }
  
        int previousScore = scores.get(winningTeam);
        scores.put(winningTeam, previousScore + 3);
  
        if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
          currentBestTeam = winningTeam;
        }
      }
      
      return currentBestTeam;
    }
  }
