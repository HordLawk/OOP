import java.io.IOException;

public class LowestDivisor {
    public static void main(String[] args) throws IOException{
        System.out.print("Number: ");
        int n = EntradaTeclado.leInt();
        if(n < 2){
            System.out.println("Input an integer higher than 1");
            return;
        }
        for(int i = 2; i <= (n / 2); i++){
            if((n % i) == 0){
                System.out.printf("Lowest divisor: %s\n", i);
                return;
            }
        }
        System.out.println("The number is prime");
    }
}
