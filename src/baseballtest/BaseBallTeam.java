package baseballtest;

/**
 *
 * @author mangu3804
 */
public class BaseBallTeam extends Sports implements Stats {
    
    public int wins, ties, losses, overallPoints;
    
    public BaseBallTeam (String sportName, String teamName, int teamPoints) {
        super(sportName, teamName, teamPoints);
        
        
    }
    
    public void updateWins() {
        wins ++;
    }
    
    public void updateLosses() {
        losses ++;
    }
    
    public void updateTies() {
        ties ++;
    }
    
    public int overallPoints() {
        overallPoints = points + 2 * wins + ties;
        
        return overallPoints;
    }
    
    public String toString() {
        return ("The " + team + " has " + overallPoints() + " points");
    }
}
