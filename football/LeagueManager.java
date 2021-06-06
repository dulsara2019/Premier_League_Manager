package football;

import java.io.IOException;

public interface LeagueManager {

    public void addClub(FootballClub addFootballClub);
    public void deleteClub(String clubName);
    public void point();
    public void displayClub(String clubName);
    public void displayTable();
    public void addMatch(Date matchDate, String matchClub1, String matchClub2 , int goal1, int goal2);
    public void saveFile() throws IOException;
    public void saveMatch() throws IOException;

}
