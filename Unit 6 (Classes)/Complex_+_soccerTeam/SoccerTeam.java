public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    private static int totalGames;
    private static int totalGoals;

    public SoccerTeam(){
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore){
        totalGames++;
        totalGoals+= myScore+otherScore;
        if(myScore < otherScore){
            other.wins += 1;
            this.losses += 1;
        }
        else if(myScore==otherScore){
            other.ties += 1;
            this.ties += 1;
        }
        else{
            this.wins += 1;
            other.losses += 1;
        }
    }

    public int getPoints(){ return (this.wins*3) + (this.ties);}

    public void reset(){
        wins = 0;
        ties = 0;
        losses = 0;
    }

    public static int getTotalGames(){
        return totalGames;
    }

    public static int getTotalGoals(){
        return totalGoals;
    }

    public static void startTournament(){
        totalGames = 0;
        totalGoals = 0;
    }

    public static void main(String [] args){
        SoccerTeam t1 = new SoccerTeam();
        SoccerTeam t2 = new SoccerTeam();
        SoccerTeam t3 = new SoccerTeam();
        SoccerTeam t4 = new SoccerTeam();

        startTournament();

        t1.played(t2, 1, 1);
        t3.played(t4, 10, 5);
        t1.played(t3, 7,2);

        System.out.println(t1.getPoints());
        System.out.println(t2.getPoints());
        System.out.println(t3.getPoints());
        System.out.println(t4.getPoints());
        System.out.println(getTotalGames());
        System.out.println(getTotalGoals());

        t1.reset();
        t2.reset();
        t3.reset();
        t4.reset();

        startTournament();

        t1.played(t2, 10, 10);
        t3.played(t4, 2, 0);
        t1.played(t3, 6,1);

        System.out.println(t1.getPoints());
        System.out.println(t2.getPoints());
        System.out.println(t3.getPoints());
        System.out.println(t4.getPoints());
        System.out.println(getTotalGames());
        System.out.println(getTotalGoals());
    }
}
