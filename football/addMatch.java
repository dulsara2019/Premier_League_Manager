package football;

import java.io.Serializable;

public class addMatch implements Serializable {
    private Date date;
    private String club1;
    private int scoredGoals1;
    private String club2;
    private int scoredGoals2;

    public addMatch(Date date, String club1, int scoredGoals1, String club2, int scoredGoals2){
        this.date=date;
        this.club1=club1;
        this.scoredGoals1=scoredGoals1;
        this.club2=club2;
        this.scoredGoals2=scoredGoals2;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getClub1() {
        return club1;
    }
    public void setClub1(String club1) {
        this.club1 = club1;
    }
    public int getScoredGoals1() {
        return scoredGoals1;
    }
    public void setScoredGoals1(int scoredGoals1) {
        this.scoredGoals1 = scoredGoals1;
    }
    public String getClub2() {
        return club2;
    }
    public void setClub2(String club1) {
        this.club2 = club2;
    }
    public int getScoredGoals2() {
        return scoredGoals2;
    }
    public void setScoredGoals2(int scoredGoals2) {
        this.scoredGoals2 = scoredGoals2;
    }
}
