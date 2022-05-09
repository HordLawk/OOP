import java.io.IOException;
import java.lang.Math;

public class OtherFunction {
    public static void main(String[] args) throws IOException{
        System.out.print("Initial estimate: ");
        double x0 = EntradaTeclado.leDouble();
        int n = 1;
        double x1 = x0 - (fn(x0) / dxfn(x0));
        while(Math.abs(x1 - x0) >= 0.0000001){
            n++;
            x1 = (x0 = x1) - (fn(x0) / dxfn(x0));
        }
        System.out.printf("Result: %s\nNumber of iterations: %s\n", x1, n);

    }

    private static double fn(double x){
        return ((Math.pow(x, 3) - Math.pow(x, 2)) - (13 * x)) + 8;
    }

    private static double dxfn(double x){
        return ((3 * Math.pow(x, 2)) - (2 * x)) - 13;
    }
}
