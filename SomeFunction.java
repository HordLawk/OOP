import java.io.IOException;
import java.lang.Math;

public class SomeFunction {
    public static void main(String[] args) throws IOException{
        System.out.print("Start of range: ");
        double a = EntradaTeclado.leDouble();
        System.out.print("End of range: ");
        double b = EntradaTeclado.leDouble();
        int n = 1;
        double c = (a + b) / 2;
        for(double fc; (((b - a) / 2) >= 0.0000001) && ((fc = fn(c)) != 0); c = (a + b) / 2){
            double fa = fn(a);
            if(Math.abs(fc + fa) == (Math.abs(fc) + Math.abs(fa))){
                a = c;
            }
            else{
                b = c;
            }
            n++;
        }
        System.out.printf("Result: %s\nNumber of iterations: %s\n", c, n);
    }

    private static double fn(double x){
        return ((Math.pow(x, 3) - Math.pow(x, 2)) - (13 * x)) + 8;
    }
}
