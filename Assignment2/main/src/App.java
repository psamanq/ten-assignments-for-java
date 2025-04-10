import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\ttext:(like programming)");
        String usertext = scanner.nextLine();
        String temp = "";
        
        for(int n = 0;n<usertext.length(); n++) {
            char ch = usertext.charAt(n);
            boolean bool = false;
            
            for(int i = 0;i<temp.length();i++){
                if(temp.charAt(i) == ch){
                    bool = true;
                }
            }
            if(!bool){
                temp += ch;
            }
        }
        
        System.out.println(temp);
    }
}
