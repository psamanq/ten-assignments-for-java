import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int lion = 0;
        int line = 0;
        for(int n = 1 ;n <=1000 ; n++){
                int partab = rand.nextInt(2);
                if(partab == 0){
                    lion++;
                }else{
                    line++;
                }
        }
        System.out.println("lion : "  + lion+"\n"+"line : " + line);
    }
}
