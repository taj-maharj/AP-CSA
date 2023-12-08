public class WhileLoops{
    public int addOdds(int n){
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum+=i;
            i+=2;
        }
        return sum;
    }

    public int sumDigits(int x){
        int sum = 0;
        while(x != 0){
            sum+=(x%10);
            x/=10;
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop){
        int year = 0;
        while(startpop < endpop){
            startpop = startpop+ (startpop*0.0113);
            year+=1;
        }
        return year;
    }

    public void printSum(int x){
        int sum = 0;
        int num = 1;
        while(num!=x){
            System.out.print(num + " + ");
            sum += num;
            num++;
        }
        sum+=x;
        System.out.print(x + " = " + sum);
        System.out.println();
    }

    public boolean isPerfectSquare(int n){
        int x = 1;
        int num = 0;
        while(num < n){
            num += x;
            x+=2;
        }
        return num==n;
    }

    public static void main(String[]args){
        WhileLoops wL = new WhileLoops();

        System.out.println("addOdds");
        System.out.println(wL.addOdds(12));
        System.out.println(wL.addOdds(1));
        System.out.println(wL.addOdds(9));
        System.out.println(wL.addOdds(3));

        System.out.println("\nsumDigits");
        System.out.println(wL.sumDigits(315));
        System.out.println(wL.sumDigits(111));
        System.out.println(wL.sumDigits(1259));

        System.out.println("\nhowManyYears");
        System.out.println(wL.howManyYears(111.2, 120));
        System.out.println(wL.howManyYears(111.2, 150));

        System.out.println("\nprintSum");
        wL.printSum(6);
        wL.printSum(10);
        wL.printSum(5);

        System.out.println("\nisPerfectSquare");
        System.out.println(wL.isPerfectSquare(9));
        System.out.println(wL.isPerfectSquare(64));
        System.out.println(wL.isPerfectSquare(3));
        System.out.println(wL.isPerfectSquare(13));
        System.out.println(wL.isPerfectSquare(1));
    }
}