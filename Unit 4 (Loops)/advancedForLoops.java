public class advancedForLoops{
    public void eights(){
        int spaces = 0;
        for(int i = 8; i>=2; i-=2){
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(i);
            }
            System.out.println();
            spaces++;
        }
    }
    
    public void alternate(int h){
        for(int i = 1; i<= h; i++){
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            int dif = 0;
            System.out.println();
            for(int j = 1; j<= i+dif; j++){
                System.out.print(j);
            }
            dif++;
            System.out.println();
        }
    }

    public static void main(String[]args){
        advancedForLoops adv = new advancedForLoops();
        adv.eights();
        adv.alternate(5);
    }
}