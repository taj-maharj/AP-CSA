package inheritance.poems;

public class Limerick extends Poem{
    public Limerick(){
        super(5);
    }

    public int getSyllables(int k){
        if(k==3||k==4) return 6;
        return 9;
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
