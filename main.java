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
/*import java.util.Scanner;
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
}*/
/*public class main{
    public static void main(String[] args) {
        int num =10;
        
        for(int n=1;n<=num;n++){
            int count =0;
            for(int i =1;i<=n;i++){
                if(n%i==0){
                    count ++;
                }
            }
            if(count==2){
            System.out.println(n);
                
            }
            
        
        }
        
    }
}*/
// factors

public class main{
    public void factor(int n){
        
        int count =0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                
                count++;
            }


        }
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        main m = new main();
        m.factor(10);
        

        
    }
}
//largest number
/*public class main{
    public static void main(String[] args) {
        int num = 2356;
        int largest = 0;
        while(num>0){
            int digit = num%10;
            if(digit>largest){
                largest= digit;

            }
            num = num/10;
        }
        System.out.println(largest);
    }
}
*/


/*public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
    }
}*/
/*public class main{
    public static void main(String [] args){
        int num = 3456;
        int res =0;
        for(;num!=0;num= num/10){
            int digit = num%10;
            res = res*10+digit;
            
            

        }
        System.out.println(res);
    }
}

*/
/*public class main {

    public void convertFromDecimal(int num, int destination) {
        if(num==0)
            return;
        convertFromDecimal(num/destination,destination);
        

        System.out.print(num%destination);
    }

    public static void main(String[] args) {
        main st = new main();
        st.convertFromDecimal(11, 2);
    }
}
*/

/*public class main{
    public int converttoDecimal(int num,int base,int power){
        if(num==0){
            return 0;
        }
        int digit = num%10;
        return digit*power+converttoDecimal(num/10,base,power*base);
    }
    public static void main(String[] args) {
        main m = new main();
        System.out.println(m.converttoDecimal(1021,2,10));
    }
}*/
/*public class main{
    public int converttodecimal(int num,int base,int power){
        if(num==0){
            return 0;
        }
        int digit= num%10;
        return digit*power+converttodecimal(num/10,base,base*power);
    }
    public static void main(String [] args){
        main m = new main();
        System.out.println(m.converttodecimal(1024,2,10));
    }
}*/

/*public class main{
    public int printnno(int num){
        int fac =1;
        for(int i=1;i<=num;i++){
            fac =fac*i;
            
        }
        return fac;



        
    }
    public static void main(String[] args) {
        main m  = new main();
        for(int i=1;i<=5;i++){
            System.out.println(m.printnno(i));
        }
        
    }
}*/

/*public class main{
    public int minmax(int a,int b){
        
        if(a>b){
            return a;
        }else{
            return b;
        }
        

    }
    public static void main(String[] args) {
        main m = new main();
        m.minmax(2, 3);
        System.out.println(m.minmax(2, 3));
        
        
    }
}*/

//try kro iska function bna kr 

/*public class main {
    
    public int lcm(int a,int b,int c){
        a =Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        int res =1;
        
        
        int n =Math.min(a,b);
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                res =i;

            }
            

        }
        int lcm = a*b/(res);
        int result = 1;
        int m=Math.min(lcm,c);
        for(int i=1;i<=m;i++){
            if(lcm%i==0 && c%i==0){
                result =i;

            }
            

        }
        int lcmss = c*lcm/(result);
        return lcmss;
        
        

        
    }
    public static void main(String[] args) {
        main m = new main();
        System.out.println(m.lcm(2,3,5));
    }
}*/


/*public class main{
    public void printmaths(int a,int b,int c){
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        
        
        double D = (b*b-4*a*c); 
        if(D<0){
            System.out.println("no real roots");
        }
        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);

        
    }
    public static void main(String[] args) {
        main m = new main();
        m.printmaths(2,4,1);
    }
}*/

























