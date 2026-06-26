/*public class maths_1 {
    public void digitsinnumber(int num){
        if(num==0){
            System.out.println("number of digits is "+1);
            return;

        }
        if(num<0){
            num = -1*num;
        }
        //int res = (int)Math.log10(num)+1;
        //System.out.println(res);
        int res = 0;
        while(num>0){
            num = num/10;
            res++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        maths_1 n = new maths_1();
        n.digitsinnumber(2890);

    }
    
}*/
/*import java.util.Scanner;
public class maths_1{
    public void appendingdigitsatend(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num");
        int num = sc.nextInt();

        System.out.println("enter the digits");
        int digit = sc.nextInt();

        int res = num*10 + digit;
        System.out.println("so the final answer is"+res);

    }
    public static void main(String[] args) {
        maths_1 n = new maths_1();
        n.appendingdigitsatend();
        
    }
}*/

/*public class maths_1{
    public void insertatfront(int num,int digit){
        
        int length = (int)Math.log10(num)+1;
        int res = digit*(int)Math.pow(10,length) + num;
        System.out.println(res);

    }
    public static void main(String[]args){
        maths_1 m = new maths_1();
        m.insertatfront(9605,3);
             
    }
}*/

/*public class maths_1{
    public void reversenumber(int num){
        int res = 0;
        boolean isNeg = false;
        if(num<0){
            isNeg = true;
            num =  -1*num;
        }
        if(num ==0){
            System.out.println("the reverse of the number is "+0);
        }
        while(num>0){
            int d = num%10;
            res = res*10+d;
            num = num/10;

        }
        if(isNeg){
            res = -1*res;
        }
        System.out.println("reverse of number is "+res);
    }
    public static void main(String []args){
        maths_1 n = new maths_1();
        n.reversenumber(-3740);
    }
}*/

/*public class maths_1{
    public void oddeven(int num){
        if(num%2==0){
            System.out.println("the number is even as remainder is zero");

        }else if(num%2!=0){
            System.out.println("the number is odd");
        }else{
            System.out.println("the number is 0");
        }
    }
    public static void main(String[] args) {
        maths_1 m = new maths_1();
        m.oddeven(7);
    }
}*/
/*public class maths_1{
    public void exponentsdemo(int a,int b){
        if(n==1){
            return true;
        }
        boolean isNeg = false;
        if(b<0){
            b = -1*b;
            isNeg = true;

        }
        double res =1;
    
        for(int i=0;i<b;i++){
            res = res*a;

        }
        if(isNeg){
            res= 1/res;


        }
        System.out.println("so the answer of the exponent is "+res);
    }
    public static void main(String [] args){
        maths_1 m = new maths_1();
        m.exponentsdemo(2,-4);

    }
}*/
public class maths_1{
    public void fastexponentation(int a ,int b){
        double res = 1.0;
        while(b>0){
            if(b%2!=0){
                res = res*a;
                b--;
            }
            b = b/2;
            a = a*a;
        }
        System.out.println("the fast exponentation answer is "+res);
    }
    
    public static void main(String [] args){
        maths_1 m = new maths_1();
        m.fastexponentation(2,3);

    }

}

/*public class maths_1{
    public void numbersystem(String input,int currentbase){
        int res =0;
        int pos =0;
        int len = input.length();
        for(int i=len-1;i>=0;i--){
            int digit = getDigit(input.charAt(i));
            res = res + digit*(int)Math.pow(currentbase,pos);
            pos++;
        }
        System.out.println("converted number is "+res);
    }
    private int getDigit(char ch){
        switch (ch){
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return ch-'0';
            

        }

    }
    public static void main(String[] args) {
        maths_1 m = new maths_1();
        m.numbersystem("6B", 16);
    }
}*/


/*public class maths_1{{
    for(int i = 1;i<=4;i++){
        for(int j=1;j<=4-i;j++){
            System.out.print(" ");

        }
    }
    for(int k=1;k<=2*i-1;k++){
        System.out.print("*");
    }
    System.out.println();
}*/


/*  leetcode reverse hai use case dekh lo
class Solution {
    public int reverse(int x) {
        int res = 0;
        boolean isNeg = false;
        
        while(x!=0){
            int d = x%10;
            
            if (res > Integer.MAX_VALUE / 10 ||
                (res == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }

            if (res < Integer.MIN_VALUE / 10 ||
                (res == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }
            res = res*10+d;
            x /=10;

        }
        
        return res;
        
    }
}*/









