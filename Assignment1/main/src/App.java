import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("number1 , number2 : ");
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        String biggerNumber = "";

        if(number1.length() > number2.length()){ 
            biggerNumber = number1;
            while(number2.length() < number1.length()){
                number2 = "0" + number2;
            }
        }else if (number2.length() > number1.length()){
            biggerNumber = number2;
            while (number1.length() < number2.length()){
                number1 = "0" + number1;
            }
        }

        int len = biggerNumber.length();
        int sumDigit = 0;
        int carry = 0;
        int mainDigit = 0;
        String result = "";
        for(int n = 1 ; n <= len+1 ; n++){
            if(n == len+1){
                if((carry != 0)){
                    result = result+(carry);
                }
                break;
            }
            sumDigit = Character.getNumericValue(number1.charAt(len-n)) + Character.getNumericValue(number2.charAt(len-n)) + carry;
            if(sumDigit >= 10) {
                carry = 1;
                mainDigit = 10-sumDigit;
            }else{
                mainDigit = sumDigit;
                carry = 0;
            }
            result = result+(mainDigit);
        }

        System.out.print("result : ");
        for(int j = result.length()-1 ;j >= 0 ; j-- ){
            if(!(result.charAt(j) == '-')){
                System.out.print(result.charAt(j));
            }
        }
        // close the scanner
        scanner.close();
    }
}
