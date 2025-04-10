import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("length of number : ");
        int lentgh = scan.nextInt();
        System.out.println("please enter your numbers");

        int [] Array = new int[lentgh];
        int [] scondArray = new int[lentgh];
        int [] exist = new int[lentgh];
        int [] countArray = new int[lentgh];

        for(int i =0;i<lentgh;i++){
            Array[i] = scan.nextInt();
            scondArray[i] = Array[i];
        }


        int c = 0;
        for(int j = 0 ; j<lentgh;j++){          
            boolean isexist = false;
            for(int n = 0;n<exist.length;n++){ 
                if((Array[j] == exist[n])){ 
                    isexist = true;
                }
            }
            if(!isexist){
                for(int k = 0;k<lentgh ; k++){
                    if(Array[j] == scondArray[k]){
                        countArray[c]++;
                        exist[c] = Array[j];
                    }
                }
                if(!isexist){
                    c++;
                    System.out.println(Array[j]+" --> "+ countArray[c] + " bar");
                }
            }
        }
    }
}
