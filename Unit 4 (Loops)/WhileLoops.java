public class WhileLoops{
    public int addOdds(int n){
        int sum = 1;
        while(n>sum){
            sum*=n;
            n++;
        }
        return sum;
    }

    public int sumDigits(int x){
        int num = 0;
        int sum = 0;
        int div = 1;
        while(num!=x){
            num = x/div%10;
            div*=10;
            sum += num;
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop){
        double curPop = startpop;
        int year = 0;
        while(curPop != endpop){
            year+=1;
            curPop*=1.13;
        }
        return year;
    }

    public void printSum(int x){
        int sum = 0;
        int num = 1;
        while(num!=x){
            System.out.print(num + " + ");
            sum += num;
        }
        System.out.print(x + " = " + sum);
    }
}