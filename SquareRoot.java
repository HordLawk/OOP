import java.io.IOException;

public class SquareRoot{
    public static void main(String args[]) throws IOException{
        System.out.print("Value to calculate the square root of: ");
        double x = EntradaTeclado.leDouble();
        if(x < 0){
            System.out.println("Root isn't in the set of real numbers");
            return;
        }
        double xk = x / 2;
        double xi = x == 0 ? 0 : ((xk + (x / xk)) / 2);
        for(double diff = (xk >= xi) ? xk - xi : xi - xk; diff >= 0.00000001; diff = (xk >= xi) ? xk - xi : xi - xk){
            xk = xi;
            xi = ((xi + (x / xi)) / 2);
        }
        System.out.printf("Estimated result: %s\n", xi);
    }
}