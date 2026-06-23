/*public class maths2{
    public void armstrongnumber(int num){
        if(num<0) return false;
        int digits = (int)Math.log10(num)+1;
        int copy = num;
        int res =0;
        while(num>0){
            
            int digit = num%10;  
            res = res+(int)Math.pow(digit,digits);
            num = num/10;

        }
        if(copy == res){
            System.out.println("the number is armstrong "+res);
        }else{
            System.out.println("the no. is not armstrong "+res);
        }


    }
    public static void main(String[] args) {
        maths2 m = new maths2();
        m.armstrongnumber(153);
    }

}*/


/*public class maths2{
    public void palidrome(int num){
        
        int res =0;
        int copy = num;
        while(num>0){
           int digit = num%10;
           res = res*10+ digit;
           num = num/10;

        }
        if(copy == res){
            System.out.println("the number is palidrome "+res);
        }else{
            System.out.println("the number is not palidrome "+res);
        }
         


    }
    public static void main(String[] args) {
        maths2 m = new maths2();
        m.palidrome(121);
    }
}*/


/*public class maths2{
    public void printalldivisors(int num){
        int sqrts = (int)Math.sqrt(num);
        for( int i=1;i<=sqrts;i++){
            if(num%i == 0){
                System.out.println("the divisors are  "+i);
                if(num/i !=i){
                    System.out.println(num/i + " ");
                }
            }
        }

    }
    public static void main(String[] args) {
        maths2 m = new maths2();
        m.printalldivisors(6);
    }
}*/

public class maths2{
    public void primedemo(int num){
        if(num<2){
            System.out.println("not prime ");
        }
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(num%i==0){
                System.out.println("the number is not prime");
            }else{
                System.out.println("the number is prime");
            }
            
        }
    }
    public static void main(String [] args){
        maths2 m = new maths2();
        m.primedemo(1);
    }
}
