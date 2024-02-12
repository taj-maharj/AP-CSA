import java.util.concurrent.CompletionException;

public class Complex{
    private double a;
    private double b;
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Complex(double a){
        this(a, 0.0);
    }

    public double abs(){
        return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
    }

    public Complex add(Complex other){
        return new Complex((a+other.a),(b+other.b));
    }

    //Overloaded Method
    public Complex add(double a){
        return new Complex((this.a+a),(b));
    }

    public String toString(){
        return a+"+"+b+"i";
    }

    public Complex mult(Complex other){
        double z = (this.a*other.a)-(this.b*other.b);
        double y = (this.a*other.b)+(this.b*other.a);
        return new Complex(z,y);
    }

    public Complex mult(double x){
        return new Complex((this.a*x),(this.b*x));
    }

    public static void main(String[] args){
        Complex one = new Complex(4.3,5.3);
        Complex two = new Complex(5.5, 6.24);

        Complex three= new Complex(-5, 10);
        Complex four= new Complex(0.1, -4);

        Complex five = new Complex(1,0);
        Complex six = new Complex(0,1);

        System.out.println("testing abs");
        System.out.println(one.abs());
        System.out.println(two.abs()+"\n");

        System.out.println("Testing add");
        System.out.println(three.add(2));
        System.out.println(four.add(1));
        System.out.println(three.add(four));

        System.out.println("\nTesting Multiply");
        System.out.println(five.mult(0));
        System.out.println(six.mult(10));
        System.out.println(five.mult(six));

    }
}