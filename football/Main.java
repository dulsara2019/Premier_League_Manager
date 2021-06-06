package football;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Main   {

    public static void main(String[] args) throws IOException {

        PremierLeagueManager premierLeagueManager=new PremierLeagueManager();

        try {
            File clubDataFile = new File("../File.txt");
            FileInputStream fileInputStream = new FileInputStream(clubDataFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            for (;;) {
                try {
                    premierLeagueManager.addClub((FootballClub) objectInputStream.readObject());
                }catch (Exception e){
                    break;
                }
            }
        }catch (IOException ignored){ }

        System.out.println("----------------------------------------------");
        System.out.println("******Welcome To Premier League Manager******");
        System.out.println("----------------------------------------------");
        System.out.println();
        Scanner scanner1=new Scanner(System.in);

        menu:
        while (true){
            System.out.println("Enter 'A' to Add to the Premier League ");
            System.out.println("Enter 'D' to Delete club from the Premier League ");
            System.out.println("Enter 'C' to Display the various statistics for a selected club ");
            System.out.println("Enter 'V' to Display the Premier League table ");
            System.out.println("Enter 'M to Add a played match ");
            System.out.println("Enter 'S' to Save in a file ");
            System.out.println("Enter 'F' to Save Match in a file ");
            System.out.println("Enter 'X' to all the club in league points =1");
            System.out.println("Enter 'E' to Exit the programme ");

            System.out.println();
            System.out.print("=====Enter your option===== :");
            String option=scanner1.next().toUpperCase();

            switch (option){
                case ("A"):

                    System.out.println();
                    System.out.print("Name of the club: ");
                    String clubName = scanner1.next();

                    System.out.print("Location of the club: ");
                    String clubLocation = scanner1.next();

                    System.out.print("Count of the club members: ");
                    int clubMem = scanner1.nextInt();

                    System.out.print("Number of wins in the league: ");
                    int wins = scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.print("Number of draws in the league: ");
                    int draws = scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.print("Number of defeats in the league: ");
                    int defeats = scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.print("Number of goals received  in the league: ");
                    int received = scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.print("Number of goals scored  in the league: ");
                    int scored = scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.print("Number of goals points in the league: ");
                    int points = scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.print("Number of played matches in the league: ");
                    int played = scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.println("");

                    FootballClub footballClub = new FootballClub(clubName,clubLocation,clubMem,wins,draws,defeats,received,scored,points,played);
                    premierLeagueManager.addClub(footballClub);

                    System.out.println("============================");
                    System.out.println("Club added Successfully!!!!!");
                    System.out.println("============================");
                    System.out.println();
                    break ;


                case ("D"):
                    System.out.print("Enter the name of the club to delete: ");
                    String deleteClub=scanner1.next();
                    premierLeagueManager.deleteClub(deleteClub);
                    System.out.println();
                    break;

                case ("C"):
                    System.out.print("Enter the name of the club: ");
                    String clName=scanner1.next();
                    premierLeagueManager.displayClub(clName);
                    break ;

                case ("V"):
                    premierLeagueManager.displayTable();
                    break ;
                case ("X"):
                    premierLeagueManager.points();
                case ("M"):

                    System.out.println();
                    System.out.println("Enter the Day: ");
                    int day=scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.println("Enter the Month: ");
                    int month=scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.println("Enter the Year: ");
                    int year=scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.println("Enter the club 1 name: ");
                    String club1=scanner1.nextLine();

                    System.out.println("Enter the goals scored by the club: ");
                    int goal1=scanner1.nextInt();
                    scanner1.nextLine();

                    System.out.println("Enter the club 2 name: ");
                    String club2=scanner1.next();

                    System.out.println("Enter the goals scored by the club: ");
                    int goal2=scanner1.nextInt();
                    scanner1.nextLine();


                    Date matchDate=new Date(day,month,year);


                    if ( !club1.equals(club2)) {
                        premierLeagueManager.addMatch(matchDate, club1, club2 , goal1, goal2);
                    }else {
                        System.out.println("Club name already added!!!");
                    }
                    break;

                case ("S"):
                    premierLeagueManager.saveFile();
                    break;
                case ("F"):
                    premierLeagueManager.saveMatch();
                    break;
                case ("E"):
                    break menu;


                default:
                    System.out.println("Invalid input Please enter vaild input!!!!!");

            }

        }

    }


}
