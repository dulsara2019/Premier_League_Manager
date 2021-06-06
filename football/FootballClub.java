package football;

import java.io.Serializable;

public class FootballClub extends SportsClub implements Serializable {
    private int wins;
    private int draws;
    private int defeats;
    private int goalsReceived;
    private int goalsScored;
    private int points;
    private int noOfPlayedMatches;




    public FootballClub(String sportsClubName, String sportsClubLocation, int sportsClubMembers, int wins, int draws, int defeats, int goalsReceived, int goalsScored, int points, int noOfPlayedMatches){
        super(sportsClubName, sportsClubLocation, sportsClubMembers);
        this.wins=wins;
        this.draws=draws;
        this.defeats=defeats;
        this.goalsReceived=goalsReceived;
        this.goalsScored=goalsScored;
        this.points=points;
        this.noOfPlayedMatches=noOfPlayedMatches;
    }



    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public void setGoalsReceived(int goalsReceived) {
        this.goalsReceived = goalsReceived;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNoOfPlayedMatches() {
        return noOfPlayedMatches;
    }

    public void setNoOfPlayedMatches(int noOfPlayedMatches) {
        this.noOfPlayedMatches = noOfPlayedMatches;
    }

    @Override
    public String toString(){
        return getSportsClubName() + "|" + getSportsClubLocation() + "|" + getSportsClubMembers() +"|"+ wins + "|" + draws + "|" + defeats + "|" + goalsReceived
                + "|" + goalsScored + "|" + points + "|" + noOfPlayedMatches ;
    }
}
