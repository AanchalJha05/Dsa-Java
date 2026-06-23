import java.util.Arrays;

public class maths_2 {
    public void printPrimes(int num){
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr,true);
        arr[0] =false;
        arr[1] = false;
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if (arr[i]) {
                // 2*2 = 4 so 4+2 = 6,8,10
                for(int j=i*i;j<=num;j=j+i){
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
    
}
