package inheritance.poems;

public class Haiku extends Poem{
    public Haiku(){
        super(3);
    }

    public int getSyllables(int k){
        if(k==1 || k==3) return 5;
        else return 7;
    }

    public void printRhythm(){
        for (int rows = 1; rows <= getNumlines(); rows++) {
            for (int syllables = 0; syllables<getSyllables(rows)-1; syllables++) {
                System.out.print("ta-");
            }
            System.out.print("ta\n");
        }
    }
}
