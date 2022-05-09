import java.io.IOException;

public class PreviousPrime {
    public static void main(String[] args) throws IOException{
        System.out.print("Number: ");
        int n = EntradaTeclado.leInt();
        descending:
        for(int i = n - 1; i > 1; i--){
            for(int k = 2; k <= (i / 2); k++) if((i % k) == 0) continue descending;
            System.out.printf("First prime number lower than %s: %s\n", n, i);
            return;
        }
        System.out.println("No prime number found");
    } 
}
