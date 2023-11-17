public class Die {
    private int roll;
    public static void main(String[] args) {
        Die die = new Die();
        die.rollDie();
        System.out.println(die.getNumDots());
    }
    public int rollDie(){
        roll = (int) (Math.random()*6+1);
        return roll;
    }

    public int getNumDots(){
        return roll;
    }
}
