import java.util.ArrayList;
import java.util.Arrays;
//import java.util.*;
import java.util.*;
/*public class maths_2 {
    public void printPrimes(int num){
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr,true);
        arr[0] =false;
        arr[1] = false;
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){ // yhe nhi liya kyuki kbhi yhe prime hai kbhi kbhi nhi hai prime 
            if (arr[i]) {
                // 2*2 = 4 so 4+2 = 6,8,10
                for(int j=i*i;j<=num;j=j+i){ // num/i is the complexity of this particular loop
                    arr[j]= false;





                }
                
            }
        }
        for(int i=2;i<=num;i++){
            if(arr[i]){
                System.out.print(i+" ");
            }
        }

        

    }
    public static void main(String[] args){
            maths_2 m = new maths_2();
            m.printPrimes(30);
        }
    
}*/

// time complexity is  (num*loglog(num))

/*public class maths_2{
    private int findGcd(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
        //cases for handling zero:
        if(a==0 && b==0) return 0;
        if(a==0) return b;
        if(b==0) return a;


        int min = Math.min(a,b);
        int res = 1;
        for(int i=2;i<=min;i++){
            if(a%i==0 && b%i==0){
                res = i; // overwrite kr deta hai last value ko jese 2 tha ab 3 aya to current value 3 fir 6 aya to 6 bn gya 

            }
        }
        System.out.println("GCD of"+a+ " and "+b+" is: " +res);
        return res;
    }
    public static void main(String[] args){
        maths_2 m = new maths_2();
        m.findGcd(-12, -18);
    }

}*/

/*public class maths_2{
    private int euclideanalgo(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(b>a){
            return euclideanalgo(b, a);
        }
        while(b>0){
            int temp = a%b;
            a = b;
            b = temp;

        }
        return a;
    }
    public static void main(String[] args){
        maths_2 m = new maths_2();
        int a = 18;
        int b = 12;
        System.out.println("GCD of "+ a +" and "+ b + " is "+ m.euclideanalgo(a, b) );
    }

}*/ // time complexity is log(min(a,b))


//spf

/*public class maths_2{
   
        private ArrayList<Integer> findUniquePrimeFactors(int N){
            ArrayList<Integer> list = new ArrayList<>();
            int sqrt = (int)Math.sqrt(N);
            for(int i=2;i<=sqrt;i++){
                if(N%i==0){
                    list.add(i);
                    while(N%i==0){
                        N=N/i;
                    }
                }
            }
            if(N>1){
                list.add(N);

            }
            return list;
        }
        public static void main(String[] args) {
        
            maths_2 m = new maths_2();
            ArrayList<Integer> list = m.findUniquePrimeFactors(12);
            System.out.println(list);
    }
        
    
    
}*/

// spf using sieve algo

// (n*log(log(n)))
//is the time complexity


/*public class maths_2 {

    private ArrayList<Integer> Spfusingsieve(int n) {

        ArrayList<Integer> res = new ArrayList<>();
        int[] prime = new int[n + 1];

        // Initially, every number is its own smallest prime factor
        for (int i = 2; i <= n; i++) {
            prime[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {

            if (prime[i] == i) {   // i is prime

                for (int j = i * i; j <= n; j += i) {

                    if (prime[j] == j) {
                        prime[j] = i;
                    }
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            res.add(prime[i]);
        }

        return res;
    }

    public static void main(String[] args) {

        maths_2 m = new maths_2();
        ArrayList<Integer> res = m.Spfusingsieve(10);
        System.out.println(res);
    }
}*/


//  MOST IMPORTANT QUESTION OF 

// ek array h size 5 ka ek baar for loop lga kr 4 baar print kro 
// 8, 9,1,3,2
// ek line likh kr krna hai 

/*public class maths_2{
    public static void main(String [] args){
        int[] arr = {8,9,1,3,2};
        for(int i=0;i<=19;i++){  // 4 baar krne pr 19 aayega 0,1,2,3,4 ek baar  2nd time 5,6,7,8,9 3rd time  10,11,12,13,14 and 4t time 15,16,17,18,19
            System.out.print(arr[i%5]); // size hai 5 and hamne % yhe use kiya hai taki array me 2 ke badd again vo 8 se start kr dega so that circular loop 4 round tk bne rahe 

        }

    }
}*/


/*public class maths_2{
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/* 
public class maths_2{
    public int hcf(int a,int b){
        a =Math.abs(a);
        b = Math.abs(b);

        if(a==0 && b==0) return 0;
        if(a==0) return b;
        if(b==0) return a;
        int res =1;
        int n = Math.min(a,b);
        for(int i=1;i<=n;i++){
            if(a%i==0 & b%i==0){
                res =i;
            }
        }
        System.out.println("hcf of a and b is"+res);
        return res;

    }
    public static void main(String [] args){
        maths_2 m = new maths_2();
        m.hcf(6,3);
    }
}*/


/*public class maths_2{
    private int findGcd(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
        //cases for handling zero:
        if(a==0 && b==0) return 0;
        if(a==0) return b;
        if(b==0) return a;


        int min = Math.min(a,b);
        int res = 1;
        for(int i=2;i<=min;i++){
            if(a%i==0 && b%i==0){
                res = i; // overwrite kr deta hai last value ko jese 2 tha ab 3 aya to current value 3 fir 6 aya to 6 bn gya 

            }
        }
        System.out.println("GCD of"+a+ " and "+b+" is: " +res);
        return res;

    }
    public static void main(String[] args){
        maths_2 m = new maths_2();
        m.findGcd(-12, -18);
    }

}*/


/*public class maths_2{
    public int lcm(int a,int b){
        a =Math.abs(a);
        b = Math.abs(b);
        int res =1;
        
        if(b==0) return a;
        if(a==0) return b;
        int n =Math.min(a,b);
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                res =i;

            }
            

        }
        System.out.println(res);
        int lcms = (a*b)/res;
        System.out.println(lcms);
        return res;
        

        
    }
    public static void main(String[] args) {
        maths_2 m = new maths_2();
        m.lcm(4, 3);
    }
}*/


// LCM for the three numbers

/*public class maths_2 {
    public int gcd(int a,int b){
        if(b>a){
            return gcd(b,a);
        }
        while(b>0){
            int temp =a%b;
            a=b;
            b=temp;
            
            
        } 
        return a;
        
        
    }
    public int lcm(int a,int b){
        return (a*b/gcd(a,b));
    }
    public int lcmofthree(int a,int b,int c){
        return lcm(lcm(a,b),c);
    }
    
    public static void main(String[] args) {
        maths_2 m = new maths_2();
        int res = m.lcmofthree(3,4,5);
        System.out.println(res);
        
    }
}*/
 
public class maths_2{
    public void leapyear(int year){
        if(year%400==0){
            System.out.println("this is leap year");
            
        }else if(year%100==0){
            System.out.println("this is not leap year");

        }else if(year%4==0){
            System.out.println("this is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
    public static void main(String[] args) {
        maths_2 m = new maths_2();
        m.leapyear(2028);
    }
}

