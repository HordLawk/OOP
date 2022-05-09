import java.io.IOException;

public class Password{
    public static void main(String args[]) throws IOException{
        System.out.print("Input max value: ");
        int n;
        try{
            n = EntradaTeclado.leInt();
        }
        catch(Exception e){
            System.out.println("Invalid value");
            return;
        }
        Random random = new Random();
        int passwd = random.getIntRand(n + 1);
        int tries = 1;
        int x;
        try{
            x = EntradaTeclado.leInt();
        }
        catch(Exception e){
            System.out.println("Invalid value");
            return;
        }
        while(x != passwd){
            System.out.printf("The password is %s than %s\n", passwd > x ? "higher" : "lower", x);
            try{
                x = EntradaTeclado.leInt();
            }
            catch(Exception e){
                System.out.println("Invalid value");
                return;
            }
            tries++;
        }
        System.out.printf("You got it right in %s tries\n", tries);
    }
}