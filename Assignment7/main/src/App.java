import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {                                                                                                                                                                                                                      
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        String text1 = scan.nextLine();
        System.out.print("Please enter your text2: ");
        String text2 = scan.nextLine();
        boolean isEqual = false;

        if (text1.length() == text2.length()) {
            char[] arr1 = text1.toCharArray();
            char[] arr2 = text2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            isEqual = Arrays.equals(arr1, arr2);
        }

        if (isEqual) {
            System.out.println("barabar");
        } else {
            System.out.println("nabarabar");
        }
    }
}
