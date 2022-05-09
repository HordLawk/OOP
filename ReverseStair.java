import java.io.IOException;

public class ReverseStair {
    public static void main(String[] args) throws IOException{
        System.out.print("n: ");
        int n = EntradaTeclado.leInt();
        while(n-- >= 0){
            for(int i = n; i >= 0; i--) System.out.print("*");
            System.out.println();
        }
    }
}
