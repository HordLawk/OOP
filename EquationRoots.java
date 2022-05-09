import java.lang.Math;

public class EquationRoots {
    public static void main(String[] args){
        double a = read("a");
        double b = read("b");
        double c = read("c");
        double delta = (b * b) - (4 * a * c);
        if(delta < 0){
            System.out.println("Root isn't in the set of real numbers");
            return;
        }
        System.out.printf("x1: %s\nx2: %s\n", (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a));
    }

    private static double read(String field){
        System.out.printf("%s: ", field);
        double coef;
        try {
            coef = EntradaTeclado.leDouble();
        } catch(Exception e) {
            coef = Double.NaN;
        }
        while(Double.isNaN(coef)){
            System.out.printf("Value must be a number\n%s: ", field);
            try {
                coef = EntradaTeclado.leDouble();
            } catch(Exception e) {
                coef = Double.NaN;
            }
        }
        return coef;
    }
}
