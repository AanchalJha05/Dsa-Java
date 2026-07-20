/* 
public class recursion_2 {
    public void stringprint(String name, int index){
        if(index==name.length()) return ;
        
        stringprint(name,index+1);
        System.out.print(name.charAt(index)+" ");
    }
    public static void main(String[] args) {
        recursion_2 r= new recursion_2();
        r.stringprint("asdfghjkl",0);
        
    }
    
}
*/
/* 
public class recursion_2{
    public boolean palidromstring(String name,int i,int j){
        if(i>=j) return true;
        if(name.charAt(i)!=name.charAt(j)) return false;
        return  palidromstring(name,i+1,j-1);
    }
    public static void main(String[] args) {
        recursion_2 r = new recursion_2();
        String name = "naan";
        boolean res = r.palidromstring(name,0,name.length()-1);
        System.out.println(res); 
        
    }
}*/

/* 
public class recursion_2{
    public String removecharfromstring(String name,char ch,int index){
        if(index==name.length()) return "";
        String prev = removecharfromstring(name, ch, index+1);//it store the answer returned by the recursive call.
        if(ch==name.charAt(index)){
            return prev;
            
        }
        return "" + name.charAt(index) + prev;
        
    }
    public static void main(String[] args) {
        String name ="shashcode";
        char ch ='a';
        recursion_2 r = new recursion_2();
        String res = r.removecharfromstring(name, ch,0);
        System.out.println(res);        
    }
}*/
/* 
public class recursion_2{
    private String replacePI(String str,int index){
        int n=str.length();
        if(index==n) return "";
        if(index<n-1 && str.charAt(index)=='P' && str.charAt(index+1)=='I'){
            return ("3.14"+ replacePI(str,index+2));
        }else{
            return (str.charAt(index)+replacePI(str, index+1));
        }
    }
    public static void main(String[] args) {
        String str = "XPIPIX";
        recursion_2 r= new recursion_2();
        String res = r.replacePI(str, 0);
        System.out.println(res);
    }
}

*/


/*
// leetcode count and say question

class Solution {
    public String countAndSay(int n) {
        
        if(n==1) return "1";
        String prev= countAndSay(n-1);
        StringBuilder sb = new StringBuilder("");
        int count =0;
        int len = prev.length();
        for(int i=0;i<len;i++){
            count++;
            if(i==len-1 || prev.charAt(i)!=prev.charAt(i+1)){
                sb.append(count).append(prev.charAt(i));
                count =0;
                

            }
        }
        return sb.toString();

        
    }
}
*/

/* 
// SUBSEQUENCES PATTERN OF RECURSION
public class recursion_2{
    private void printallsubsequence(String input,int index, String current){
        if(index==input.length()){
            System.out.print(current+" , ");
            return;
        }
        // ab

        //pick
        printallsubsequence(input,index+1,current+input.charAt(index));
        //no pick
        printallsubsequence(input,index+1,current);



    }
    public static void main(String[] args){
        String input = "abc";
        recursion_2 r = new recursion_2();
        r.printallsubsequence(input,0,"");


    }
}
*/


public class recursion_2{
    private int printallsubsequence(String input,int index, String current){
        if(index==input.length()){
            return 1;
        }
        // ab

        //pick
        int pick= printallsubsequence(input,index+1,current+input.charAt(index));
        //no pick
        int notpick = printallsubsequence(input,index+1,current);
        return pick+notpick;

    }
    public static void main(String[] args){
        String input = "abc";
        recursion_2 r = new recursion_2();
        int res = r.printallsubsequence(input,0,"");
        System.out.println(res);


    }
}












