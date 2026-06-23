import java.util.Scanner;
public class practice_lec10 {
    /*  QUESTION 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
        for(int i=0;i<size;i++){
            names[i] = sc.next();


        }
        for(int i =0; i<size;i++){
            System.out.println(names[i]);
        }
    }*/
    //QUESTION 3 
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();

        }
        boolean isAscending = true;
        for(int i = 0;i<num.length-1;i++){
            if (num[i]>num[i+1]){
                isAscending= false;

            }

        }
        if(isAscending){
            System.out.println("The Array is in sorted in ascending order");
        }else{
            System.out.println("The array is sorted in descending order");
            
        }



        
    }*/
   // QUESTION 3
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n[] = new int[size];
        for(int i=0;i<size; i++){
            n[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i =0; i<n.length;i++){
            if(n[i]<min){
                min = n[i];
            }
            if(n[i]>max){
                max = n[i];

            }
            
        }
        System.out.println("max number is "+max);
        System.out.println("min number is "+min);
             




   }
    
    
}
