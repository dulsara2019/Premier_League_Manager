package football;

public class SchoolFootballClub extends FootballClub {
    private String schoolName;


    public SchoolFootballClub(String sportsClubName,String sportsClubLocation,int sportsClubMembers,String schoolName,int wins, int draws, int defeats, int goalsReceived, int goalsScored, int points, int noOfPlayedMatches){
        super(sportsClubName,sportsClubLocation,sportsClubMembers,wins, draws, defeats, goalsReceived, goalsScored, points, noOfPlayedMatches);
        this.schoolName=schoolName;
    }

    public String getSchoolName() {

        return schoolName;
    }

    public void setSchoolName(String schoolName) {

        this.schoolName = schoolName;
    }


}
