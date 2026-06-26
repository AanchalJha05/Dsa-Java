import java.util.*;

/*public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        
        int num = sc.nextInt();
        
        int evencount =0;
        int oddcount =0;
        for(int i=1;i<=num;i++){
            if(num==0){
                System.out.println("neither even nor odd");
                
            }
            if(i%2==0){
                
                evencount++;
            }else{
                
                oddcount++;
            }

        }
        
        System.out.println("total even number "+evencount);
        System.out.println("total odd number"+oddcount);
        
    }

    
}*/
// for you can use formula to find the odd and even google kr liyo formula
/*public class main{
    public static void main(String [] args){
        for(int i=1;i<=4;i++){
            for(int j =1;j<=4;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}*/


// HOMEWORK




/*public class main{
    public static void main(String[] args){
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){ // increasing
                System.out.print(k);
                
            }
            for(int k=i-1;k>=1;k--){// decreading
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }
}*/

/*public class main{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-i;k++){
                

                if(i%2!=0){
                    System.out.print(" @ ");

                }
                else{
                    System.out.print(" # ");
                }

            }
            System.out.println();
            
            

        }
    }
}*/

/*public class main{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++){
                

                if(i%2!=0){
                    System.out.print("@");

                }
                else{
                    System.out.print("#");
                }

            }
            System.out.println();
            
            

        }
    }
}*/

//print 

/*public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        int sqt = (int)Math.sqrt(num);
        for(int i=2;i<=sqt;i++){
            if(num%i==0){
                System.out.println("this is not a prime number");
            }else{
                System.out.println("this is a prime number");
            }
        }
        
    }
}*/

// practice
import java.util.Scanner;
import java.util.Arrays;
public class main{
    public void printprimes(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        boolean arr[] = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j=i+j){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i]){
                System.out.print(i);
            }
        }
        
        

        
    }
    public static void main(String[] args){
        main m = new main();
        m.printprimes(12);
    }
}
