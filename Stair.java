import java.io.IOException;

public class Stair {
    public static void main(String[] args) throws IOException{
        System.out.print("n: ");
        int n = EntradaTeclado.leInt();
        for(int i = 0; i < n; i++){
            for(int k = 0; k < i; k++) System.out.print(" ");
            for(int k = 0; k < (n - i); k++) System.out.print("*");
            System.out.println();
        }
    }
}
