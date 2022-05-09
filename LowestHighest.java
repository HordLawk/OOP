import java.io.IOException;

public class LowestHighest {
    public static void main(String[] args) throws IOException{
        double x = EntradaTeclado.leDouble();
        if(x == 0){
            System.out.println("No input");
            return;
        }
        double lowest = x;
        double highest = x;
        while((x = EntradaTeclado.leDouble()) != 0){
            if(x < lowest){
                lowest = x;
            }
            else if(x > highest){
                highest = x;
            }
        }
        System.out.printf("Lowest: %s\nHighest: %s\n", lowest, highest);
    }
}
