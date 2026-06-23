import java.util.Arrays;

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

public class maths_2{
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

}// time complexity is log(min(a,b))