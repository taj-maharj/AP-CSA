public class Factorial{
    public static void main(String[]args){
        Factorial fact = new Factorial();
        System.out.println("calcFactorial");
        for(int i=1;i<=20;i++){
            System.out.println(fact.calcFactorial(i));
        }   
        System.out.println();
        System.out.printf("e is %2.3f \n", fact.calcE());
        System.out.println("\ncalcEX:");
        for(int i = 1; i<=5; i++){
            System.out.printf("%2.3f \n", fact.calcEX(i));
        }
    }

    public long calcFactorial(int i){
        long product = 1;
        for(int x = 1; x<=i; x++){
            product*=x;
        }
        return product;
    }

    public double calcE(){
        double e = 1;
        double olde = 0;
        int i = 1;
        Factorial fact = new Factorial();
        while(e-olde > .001){
            olde = e;
            e+= 1.0/fact.calcFactorial(i);
            i++;
        }
        return e;
    }

    public double calcEX(int x){
        double e = 1;
        double olde = 0;
        int i = 1;
        Factorial fact = new Factorial();
        while(e-olde > .001){
            olde = e;
            e+= (double) Math.pow(x, i)/fact.calcFactorial(i);
            i++;
        }
        return e;
    }
}