import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();

        boolean iscorrect = true;

        String array = "";

        for(int n = 0; n < userText.length(); n++){
            
            char ch = userText.charAt(n);

            if ((ch == '(') || (ch == '{') ||  (ch == '[')){
                array += ch;
            } 

            else if((ch == ')') ||  (ch == '}') || (ch == ']')){
                if(array.isEmpty()) {
                    iscorrect =  false;
                }
                char last = array.charAt(array.length() - 1);

                if((ch == ')' && last == '(') || 
                   (ch == '}' && last == '{') || 
                   (ch == ']' && last == '[')){
                    array = array.substring(0, array.length()-1);
                }else{
                    iscorrect =  false;

                }
            }
        }

        if(iscorrect){
            System.out.print("its correct");

        }else {
            System.out.print("its not correct");
            
        } 

        scanner.close();
    }
}
