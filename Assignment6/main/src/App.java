import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
                System.out.print("your Array :  (with space between letters): ");
                String[] array = scanner.nextLine().split(" ");

                int[] indexarray1 = new int[array.length];
                int[] indexarray2 = new int[array.length];

                System.out.print("please Enter your first number: ");
                String number1 = scanner.nextLine();
        
                System.out.print("please Enter your second number: ");
                String number2 = scanner.nextLine();
    
        
                int indexes1 = 0;
                int indexes2 = 0;

                for(int n = 0; n<array.length; n++){
                    if(array[n].equals(number1)){
                        indexarray1[indexes1] = n;
                        indexes1++;
                    }else if(array[n].equals(number2)){
                        indexarray2[indexes2] = n;
                        indexes2++;
                    }
                }

                int min = Integer.MAX_VALUE;
                for(int j = 0;j<indexes1;j++){
                    for(int k = 0;k<indexes2;k++){
                        if((Math.abs(indexarray1[j]-indexarray2[k]) < min) && (Math.abs(indexarray1[j]-indexarray2[k])) != 0){
                            min = Math.abs(indexarray1[j]-indexarray2[k]);
                        }
                    }
                }
                System.out.println("main min" + ":" +min);
    }
}
