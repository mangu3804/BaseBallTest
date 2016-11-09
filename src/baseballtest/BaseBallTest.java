package baseballtest;

/**
 *
 * @author mangu3804
 */
public class BaseBallTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BaseBallTeam team1 = new BaseBallTeam ("Baseball" , "BlueJays", 1);
        BaseBallTeam team2 = new BaseBallTeam ("Baseball" , "RedSocks", 0);
        
        System.out.println(team1.toString());
        System.out.println(team2.toString());
        
        
    }
    
}
