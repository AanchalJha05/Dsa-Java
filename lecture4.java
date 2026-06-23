import java.util.Scanner;

public class lecture4 {
    public static void main(String[] args){
        // for loop
        // for(int i =0;i<11;i++){
        //     System.out.print(i+" ");
        // }

        // while loop
        // int i = 0;
        // while(i<11){
        //     System.out.println(i);
        //     i = i+1;


        // }
        // DO WHILE LOOP
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i = i+1;
        // }while(i<11);
        
        
        // Print Sum of first n natural numbers.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("  ENTER THE NUMBER");
        // int n = sc.nextInt();
        // int sum = 0;  
        // for(int i = 0; i<=n;i++){
        //     sum +=i;
        // System.err.println(sum);    


        // }
        // Print the table of a number input by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int mul = 0;
        for(int i = 1; i <11; i++){
            mul = i*n;
            System.err.println(mul);
        }
        
        



    }
    
}
