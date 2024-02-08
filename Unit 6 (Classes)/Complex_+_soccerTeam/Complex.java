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
        double z = ((this.a*other.a)+(this.b*other.b)*(-1));
        double y = ((this.a*other.b)+(this.b*other.a));
        return new Complex(z,y);
    }

    public Complex mult(double x){
        return new Complex((this.a*x)+(this.b*x));
    }

    public static void main(String[] args){
        Complex c = new Complex(4,5);
        Complex x = new Complex(2.5,8.9343);
        System.out.println(c.abs());
        System.out.println(x.abs()+"\n");
        System.out.println(c.add(x));
        System.out.println(x.add(c)+"\n");
        System.out.println(c.mult(x));
    }
}