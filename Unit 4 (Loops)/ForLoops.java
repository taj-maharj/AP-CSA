public class ForLoops {
    public int addEvens(int n){
        int sum = 0;
        for(int i =2; i<=n; i+=2){
            sum+=i;
        }
        return sum;
    }
    public void printSquaresBack(int n){
        for(int i = n; i>=1; i--){
            System.out.println(Math.pow(i, 2));
        }
        System.out.println();
    }
    public void sillyNumbers(){
        for(int f = 1; f<=3; f++){
            for(int i = 0; i<=9; i++){
                for(int j = 1; j <= 3; j++){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public void sillyNumbers2(){
        for(int f = 1; f<= 4; f++){
            for(int i = 9; i >= 1; i--){
                for(int j = i; j>=1; j--){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public void dollarsAndStars(){
        int stars = -2;
        int money = 8;
        int star = 16;
        for(int i = 1; i<=7; i++){
            stars +=2;
            money -= 1;
            star -=2;
            for(int j = stars; j>0; j--){
                System.out.print("*");
            }
            for(int j = money; j>0; j--){
                System.out.print("$");
            }
            for(int j = star;j>0; j--){
                System.out.print("*");
            }
            for(int j = money; j>0; j--){
                System.out.print("$");
            }
            for(int j = stars; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        ForLoops fl = new ForLoops();
        System.out.println("addEvens");
        System.out.println(fl.addEvens(1));
        System.out.println(fl.addEvens(10));
        System.out.println(fl.addEvens(4));

        System.out.println("\nprintSquaresBack");
        fl.printSquaresBack(3);
        fl.printSquaresBack(6);
        fl.printSquaresBack(10);

        System.out.println("\nsillyNumbers");
        fl.sillyNumbers();

        System.out.println("\nSillyNumbers2");
        fl.sillyNumbers2();

        System.out.println("\ndollarsAndStars");
        fl.dollarsAndStars();
    }
}
