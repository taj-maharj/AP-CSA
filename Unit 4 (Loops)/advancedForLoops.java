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
        for(int i = 1; i<= h; i+=2){
            for(int j = 1; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
            for(int j = i+1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void  isosceles(int h){
        for(int i = 1; i<=h; i++){
            for(int j = 1; j<=h-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<i; j++){
                System.out.print(j);
            }
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void upSideDown(int s, int e){
        int start = s;
        int spaces = 1;
        for(int i = 1; i <= (s-e)+1;i++){
            for(int j = 1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j = start; j >= e; j--){
                System.out.print(j);
            }
            for(int j = e+1; j<=start; j++){
                System.out.print(j);
            }
            start--;
            spaces++;
            System.out.println();
        }
    }

    public static void main(String[]args){
        advancedForLoops adv = new advancedForLoops();
        System.out.println("eights\n");
        adv.eights();

        System.out.println("\nAlternate\n");
        adv.alternate(3);
        adv.alternate(7);

        System.out.println("\nisosceles\n");
        adv.isosceles(6);
        System.out.println();
        adv.isosceles(7);

        System.out.println("\nupSideDown\n");
        adv.upSideDown(8, 3);
        System.out.println();
        adv.upSideDown(9, 6);
    }
}