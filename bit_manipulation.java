import java.util.ArrayList;
/*public class bit_manipulation{
    public boolean isEven(int num){
        if((num&1)==0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        bit_manipulation bm = new bit_manipulation();
        System.out.println(bm.isEven(-4));
        
    }
}*/
/*public class bit_manipulation{
    
    public void swap(int a,int b) {
        System.out.println("before swap a:"+a+"b:"+b);
        
        a=a^b;
        b = a^b;
        a=a^b;
        System.out.println("after swap a:"+a+"b :"+b);
    }
    public static void main(String[] args) {
        bit_manipulation m = new bit_manipulation();
        int a = 10;
        int b =12;
        m.swap(a,b);
    }
}
*/
/*public class bit_manipulation{
    public boolean checksetbit(int num,int k){
        return ((1<<k)& num)!=0;

    }
    public static void main(String[] args) {
        bit_manipulation m = new bit_manipulation();
        int k=1;
        int num=7;
        if(m.checksetbit(num, k)){

            System.out.println("k th bit of "+num+"was set,k"+k);
        }else{
            System.out.println("k th bit of"+num+"was not set,k="+k);

        }
        
    }
}*/

/*public class bit_manipulation{
    private int setabit(int num,int k){
        return ((1<<k)|num);

    }
    public static void main(String[] args) {
        bit_manipulation m = new bit_manipulation();
        int k=2;
        int num=16;
        int res = m.setabit(num,k);
        System.out.println("after setting kth bit ,res="+res);
        
    }
}*/
/*public class bit_manipulation{
    private int unsetBit(int num,int k){
        return (~(1<<k)&num);

    }
    public static void main(String [] args){
        int k=2;
        int num=13;
        bit_manipulation m = new bit_manipulation();
        int res = m.unsetBit(num, k);
        System.out.println(res);

    }
}*/

// sare number me se bas ek number toggle krna ho to xor use krte h
//example : 1101 ab hame postion 2 ko toggle krna hai to yhe bnega 1001

/*public class bit_manipulation{
    private int toggleBit(int num,int k){
        return ((1<<k)^num);
    }
    public static void main(String[] args) {
        bit_manipulation m =new bit_manipulation();
        int num =13;
        int k =1;
        int res = m.toggleBit(num,k);
        System.out.println(res);


    }
}*/
/*public class bit_manipulation{
    private int countBitusingBrianAlgo(int num){
        int count =0;
        while(num!=0){
            num =num&(num-1);
            count++;
        }
        return count;


    }
    public static void main(String[] args) {
        bit_manipulation m =new bit_manipulation();
        int res = m.countBitusingBrianAlgo(-13);
        System.out.println(res);
    }
}*/

/* 

public class bit_manipulation{
    private int rightmostsetbit(int num){
        return (num&-num);

    }
    public static void main(String[] args) {
        bit_manipulation m = new bit_manipulation();
        int res =m.rightmostsetbit(13);
        System.out.println(res);
    }
}
*/

/*public class bit_manipulation{
    private boolean poweroftwo(int num){
        if((num & 1)!=0){
            return false;
        }
        return ((num&num-1)==0);

    }
    public static void main(String[] args) {
        bit_manipulation m = new bit_manipulation();
        int num =1;
        boolean res =m.poweroftwo(num);
        System.out.println(res);
    }
}*/
/*public class bit_manipulation{
    private char tolower(char ch){
        
        return (char)(ch|(1<<5));

    }
    public static void main(String[] args) {
        bit_manipulation m = new bit_manipulation();
        
        System.out.println(m.tolower('A'));
    }
}*/
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class bit_manipulation{
    public List<List<Integer>> subset(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        int subset = 1<<len;
        for(int i=0;i<subset;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<len;j++){
                if((i & (1<<j))!=0){
                    list.add(nums[j]);

                }
                
            }res.add(list);

        }return res;
        
        
    }
    

    public static void main(String[] args) {
        bit_manipulation m = new bit_manipulation();
        System.out.println(m.subset(new int []{1,2,3}));
    }
}


/*import java.util.*;

public class bit_manipulation {

    public List<List<Integer>> subset(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        int len = nums.length;
        int totalSubsets = 1 << len;

        for (int i = 0; i < totalSubsets; i++) {

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < len; j++) {

                if ((i & (1 << j)) != 0) {
                    list.add(nums[j]);
                }
            }

            res.add(list);
        }

        return res;
    }

    public static void main(String[] args) {

        bit_manipulation m = new bit_manipulation();

        System.out.println(m.subset(new int[]{1, 2, 3}));
    }
}*/