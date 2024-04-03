package inheritance.poems;
public class Poem{
    private int lines;

    public Poem(int l){
        lines = l;
    }

    public int getNumlines(){return lines;}

    public void printRhythm(){
        System.out.println("Free Verse");
    }
}