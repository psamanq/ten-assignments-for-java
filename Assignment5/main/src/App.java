import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number : ");
        String numbers = scanner.nextLine();

        float lentgh = numbers.length();

        //partision of number
        String firstPartOfNumber = numbers.substring(0, (int)Math.floor(lentgh/2));
        String secondtPartOfNumber = numbers.substring((int)Math.ceil(lentgh/2), (int)lentgh);

        int sumationOfPart1 = 0;
        int sumationOfPart2 = 0;

        for(int n = 0 ; n<firstPartOfNumber.length();n++){
                sumationOfPart1 += Integer.parseInt(firstPartOfNumber.charAt(n)+"");
                sumationOfPart2 += Integer.parseInt(secondtPartOfNumber.charAt(n)+"");
        }
        
        if(sumationOfPart1 == sumationOfPart2){
            System.out.println("barabare");
        }else{
            System.out.println("barabar nist");
        }
    }
}
