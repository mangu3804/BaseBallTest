package baseballtest;

/**
 *
 * @author mangu3804
 */
public abstract class Sports {
    
    public String sport;
    public String team;
    public int points;
    
    public Sports(String sportName, String teamName, int teamPoints) {
        sport = sportName;
        team = teamName;
        points = teamPoints;
    }
    
}

/*
The class BaseballTeam should extend the Sports class. What instance variables
and methods do sports teams share? Create the Sports and BaseballTeam classes.

Create a Stats interface that contains a member method named overallPoints that
returns the overall points for a team where 2 points are given for each win, 1
point for a tie, and 0 points for a loss. Make sure the BaseballTeam class that
implements the Stats interface. The BaseballTeam class should have variable
members for games won, lost, and tied and method members for updating the number
of games won, lost, or tied as well as a method for displaying the team's
overall points.

Create a BaseballTest application that tests the classes.
*/