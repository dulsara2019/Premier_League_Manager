package football;

import football.FootballClub;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class PremierLeagueManager implements LeagueManager {

    private ArrayList<FootballClub>footballClubArrayList =new ArrayList<>();
    private ArrayList<addMatch>addMatches=new ArrayList<>();



    @Override
    public void addClub(FootballClub addFootballClub) {
        footballClubArrayList.add(addFootballClub);
    }


    @Override
    public void points(){

        for(FootballClub footballClub:footballClubArrayList){
            footballClub.getSportsClubName();
            footballClubArrayList.remove(footballClub);


        }


    }


    @Override
    public void deleteClub(String clubName) {
        boolean deleClub =  true;

        for(FootballClub footballClub:footballClubArrayList){
            if(clubName.equals(footballClub.getSportsClubName())){
                footballClubArrayList.remove(footballClub);
                System.out.println("=====Delete Successfully======");
                deleClub = false;
                break;
            }
        }

        if(deleClub){
            System.out.println("Name not found!!!!!!");
        }

    }

    @Override
    public void displayClub(String clubName) {
        if(footballClubArrayList.size()==0){
            System.out.println("=================");
            System.out.println("Details not found!!!");
            System.out.println("=================");
            System.out.println("");
        }
        for(FootballClub footballClub:footballClubArrayList){
            if(clubName.equals(footballClub.getSportsClubName())){
                System.out.println();
                System.out.println("Club Name :" + footballClub.getSportsClubName());
                System.out.println("Club Location :" + footballClub.getSportsClubLocation());
                System.out.println("Club Members :" + footballClub.getSportsClubMembers());
                System.out.println("Club wins :" + footballClub.getWins());
                System.out.println("Club draws :" + footballClub.getDraws());
                System.out.println("Club defeats :" + footballClub.getDefeats());
                System.out.println("Club number of goals received :" + footballClub.getGoalsReceived());
                System.out.println("Club number of goals scored :" + footballClub.getGoalsScored());
                System.out.println("Club number of points :" + footballClub.getPoints());
                System.out.println("Club number of played matches in the league :" + footballClub.getNoOfPlayedMatches());
                System.out.println();
            }
        }


    }

    @Override
    public void displayTable() {

        if(footballClubArrayList.size()==0) {
            System.out.println("=================");
            System.out.println("Details not found!!!");
            System.out.println("=================");
            System.out.println("");
        }
        footballClubArrayList.sort(Comparator.comparing(FootballClub::getPoints).thenComparing(FootballClub::getGoalsScored));
        Collections.reverse(footballClubArrayList);
        System.out.println("===============================================================================================================================================");
        System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s", "Name", "Location", "Members", "Wins", "Draws", "Defeats", "Received", "Scored", "Points", "Matches");
        System.out.println();
        System.out.println("===============================================================================================================================================");




        for(FootballClub footballClub:footballClubArrayList){

            System.out.format( "%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s", footballClub.getSportsClubName(), footballClub.getSportsClubLocation(), footballClub.getSportsClubMembers(), footballClub.getWins(),footballClub.getDraws(), footballClub.getDefeats(), footballClub.getGoalsReceived(), footballClub.getGoalsScored(), footballClub.getPoints(), footballClub.getNoOfPlayedMatches());
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");


        }

    }

    @Override
    public void addMatch(Date matchDate, String matchClub1, String matchClub2, int goal1, int goal2) {
        boolean club1 = false;
        boolean club2 = false;

        for(FootballClub footballClub : footballClubArrayList){
            if(matchClub1.equals(footballClub.getSportsClubName())){
                club1 = true;
            }
            if(matchClub2.equals(footballClub.getSportsClubName())){
                club2 = true;
            }
        }

        if (!club1 || !club2){
            System.out.println("No Club found!!!");
        }else {
            for (FootballClub footballClub: footballClubArrayList){
                if(matchClub1.equals(footballClub.getSportsClubName())){
                    footballClub.setGoalsScored(footballClub.getGoalsScored() + goal1);
                    footballClub.setGoalsReceived(footballClub.getGoalsReceived() + goal2);
                    footballClub.setNoOfPlayedMatches(footballClub.getNoOfPlayedMatches() + 1);

                    if(goal1 > goal2){

                        footballClub.setWins(footballClub.getWins() + 1);
                        footballClub.setPoints(footballClub.getPoints() + 3);
                    }else if( goal2 > goal1) {

                        footballClub.setDefeats(footballClub.getDefeats() + 1);
                    }else {

                        footballClub.setDraws(footballClub.getDraws() + 1);
                        footballClub.setPoints(footballClub.getPoints() + 1);
                    }
                }
                if(matchClub2.equals(footballClub.getSportsClubName())){
                    footballClub.setGoalsScored(footballClub.getGoalsScored() + goal2);
                    footballClub.setGoalsReceived(footballClub.getGoalsReceived() + goal1);
                    footballClub.setNoOfPlayedMatches(footballClub.getNoOfPlayedMatches() + 1);

                    if(goal1 > goal2){

                        footballClub.setDefeats(footballClub.getDefeats() + 1);

                    }else if( goal2 > goal1) {
                        footballClub.setWins(footballClub.getWins() + 1);
                        footballClub.setPoints(footballClub.getPoints() + 3);

                    }else {

                        footballClub.setDraws(footballClub.getDraws() + 1);
                        footballClub.setPoints(footballClub.getPoints() + 1);
                    }
                }
            }
        }
        addMatch addMatch=new addMatch(matchDate,matchClub1,goal1,matchClub2,goal2);
        addMatches.add(addMatch);





    }

    @Override
    public void saveFile() throws IOException {


        try {
            if(footballClubArrayList.size()==0){
                System.out.println("=================");
                System.out.println("Details not found!!!");
                System.out.println("=================");
                System.out.println("");
            }
            FileOutputStream fileOutputStream = new FileOutputStream("../File.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (FootballClub footballClub : footballClubArrayList) {
                objectOutputStream.writeObject(footballClub);

            }objectOutputStream.close();
        }
        catch (FileNotFoundException exception){
            exception.printStackTrace();
        }





    }

    @Override
    public void saveMatch() throws IOException {
        if(footballClubArrayList.size()==0){
            System.out.println("=================");
            System.out.println("Details not found!!!");
            System.out.println("=================");
            System.out.println("");
        }


        FileOutputStream fileOutputStream = new FileOutputStream("../Match.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        for (addMatch match : addMatches) {
            objectOutputStream.writeObject(match);

        }objectOutputStream.close();


    }



}
