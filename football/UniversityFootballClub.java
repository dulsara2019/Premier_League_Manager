package football;

public class UniversityFootballClub extends FootballClub {
    private String universityName ;


    public UniversityFootballClub(String sportsClubName, String sportsClubLocation, int sportsClubMembers, String universityName, int wins, int draws, int defeats, int goalsReceived, int goalsScored, int points, int noOfPlayedMatches){
        super(sportsClubName,sportsClubLocation,sportsClubMembers,wins, draws, defeats, goalsReceived, goalsScored, points, noOfPlayedMatches);
        this.universityName=universityName;
    }
    public String getUniversityName(){

        return universityName;
    }
    public void setUniversityName(String universityName){
        this.universityName=universityName;
    }
}
