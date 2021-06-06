package football;

import java.io.Serializable;

public class SportsClub implements Serializable {
    private String sportsClubName;
    private String sportsClubLocation;
    private int sportsClubMembers;

    public SportsClub(String sportsClubName, String sportsClubLocation, int sportsClubMembers) {
        this.sportsClubName = sportsClubName;
        this.sportsClubLocation = sportsClubLocation;
        this.sportsClubMembers = sportsClubMembers;
    }

    public String getSportsClubName() {
        return sportsClubName;
    }

    public void setSportsClubName(String sportsClubName) {
        this.sportsClubName = sportsClubName;
    }

    public String getSportsClubLocation() {
        return sportsClubLocation;
    }

    public void setSportsClubLocation(String sportsClubLocation) {
        this.sportsClubLocation = sportsClubLocation;
    }

    public int getSportsClubMembers() {
        return sportsClubMembers;
    }

    public void setSportsClubMembers(int sportsClubMembers) {
        this.sportsClubMembers = sportsClubMembers;
    }
}
