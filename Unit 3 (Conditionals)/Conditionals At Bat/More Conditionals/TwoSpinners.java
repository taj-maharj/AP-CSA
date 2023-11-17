
public class TwoSpinners{
    private int pScore;
 	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
 	public int spin(int min, int max)
 	{
     	    return (int) (Math.random()*(max-min))+min;
 	}
 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
        int playerSpin = spin(1,10);
        int compSpin = spin(2,8);
        int dif = playerSpin-compSpin;
        if(playerSpin>compSpin){
            pScore+= playerSpin-compSpin;
            System.out.println("You win! " + dif+" points.");
        }
        else if(compSpin>playerSpin){
            pScore+= playerSpin-compSpin;
            System.out.println("You lose. "+dif+" points.");
        }
        else if(compSpin==playerSpin){
            playerSpin += spin(1,10);
            compSpin += spin(2,8);
            if(playerSpin>compSpin){
                pScore+= 1;
                System.out.println("You win! 1 point.");
            }
            else if(compSpin>playerSpin){
                pScore -=1;
                System.out.println("You lose. -1 point.");
            }
            else{
                System.out.println("Tie. 0 points");
            }
        }
	}

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
         		ds.playRound();
     	      }
 	  }

 }
