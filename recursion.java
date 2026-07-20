/*public class recursion {
    private void print(int n){
        if(n==0) return;// base case
        print(n-1);        // recursive call
        System.out.print(n+" "); // task after recursion 

    }
    public static void main(String[] args){
        recursion r = new recursion();
        r.print(6);
    }
    
}

*/


/*public class recursion {
    private void print(int n){
        if(n==0) return;// base case
               
        
        print(n-1); // recursive call
        System.out.print(n+" "); // task after recursion  

    }
    public static void main(String[] args){
        recursion r = new recursion();
        r.print(6);
    }
    
}*/
/* 
public class recursion{
    public int fact(int n){
        if(n==1) return 1;
        if(n==-0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
        recursion r = new recursion();
        int res = r.fact(3);
        System.out.println(res);

    }
}
*/
/* 
public class recursion{
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-2)+fib(n-1);
        
        
    }
    public static void main(String[] args){
        recursion r = new recursion();
        int res = r.fib(4);
        System.out.println(res);
    }
}

*/

/* 

// increasing order 
public class recursion{
    private int printarray(int index,int arr[]){
        if(index==arr.length) return 0;
        
        int res = printarray(index+1,arr);
        System.out.print(arr[index]+" ");
        return res;
        

    }
    public static void main(String[] args){
        int arr[] = {2,3,4,5,8,6,7,0,3};
        recursion r = new recursion();
        int res1 = r.printarray(0, arr);
        
        
    }
}
*/

/* 
// increasing order
public class recursion{
    private int printarray(int index,int arr[]){
        if(index==arr.length) return 0;
        System.out.print(arr[index]+" ");
        return printarray(index+1,arr);
        
        
        

    }
    public static void main(String[] args){
        int arr[] = {2,3,4,5,8,6,7,0,3};
        recursion r = new recursion();
        int res1 = r.printarray(0, arr);
        
        
    }
}

*/


/* 
public class recursion{
    private boolean checkelement(int arr[], int index,int target){
        if(index== arr.length) return false;
        if(arr[index]==target) return true;
        return checkelement(arr, index+1, target);

    }
    public static void main(String[] args){
        int arr[] = {2,3,4,5,8,6,7,0,3};
        int target = 3;

        recursion r = new recursion();
        boolean res1 = r.checkelement(arr,0,target);
        System.out.println(res1);
        
        
    }
}

*/

/* 
public class recursion{
    public int firstoccurance(int arr[],int index,int target){
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        return firstoccurance(arr,index+1,target);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,8,6,7,0,3};
        int target = 3;

        recursion r = new recursion();
        int res1 = r.firstoccurance(arr,0,target);
        System.out.println(res1);

    }
}
*/

/* 
public class recursion{
    public int lastoccurrence(int arr[], int index, int target){
        if(index == arr.length) return -1;
        int res= lastoccurrence(arr,index+1,target);
        if(res ==- 1){
            if(arr[index]==target) return index;
        }
        return res;
        

    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,8,6,7,0,3};
        int target = 3;

        recursion r = new recursion();
        int res1 = r.lastoccurrence(arr,0,target);
        System.out.println(res1);

    }
}

*/

/* 
class Solution {

    public ArrayList<Integer> findIndex(int[] arr, int key) {
        ArrayList<Integer> ans = new ArrayList<>();

        int firstIndex = first(arr, 0, key);
        int lastIndex = last(arr, arr.length - 1, key);

        ans.add(firstIndex);
        ans.add(lastIndex);

        return ans;
    }

    public int first(int[] arr, int index, int key) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == key) {
            return index;
        }

        return first(arr, index + 1, key);
    }

    public int last(int[] arr, int index, int key) {
        if (index < 0) {
            return -1;
        }

        if (arr[index] == key) {
            return index;
        }

        return last(arr, index - 1, key);
    }
}

*/


/* 
import java.util.ArrayList;

public class recursion{
    public void findalloccurance(int arr[],int index,int target,ArrayList<Integer> res){
        
        if(index==arr.length) return;
        if(arr[index]==target){
            res.add(index);
        }
        findalloccurance(arr, index+1, target,res);
        


    }
    public static void main(String[] args) {
        
        int arr[] = {2,4,3,4,6,5};
        int target = 4;
        ArrayList<Integer> res = new ArrayList<>();
        recursion r = new recursion();
        r.findalloccurance(arr, 0,target,res);
        
        System.out.println(res);
        
        
        
    }
}*/

/* 

public class recursion{
    public void printallele(int arr[],int index){
        if(index==arr.length) return;
        System.out.println(arr[index]+" ");
        printallele(arr,index+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,7,8,4};
        recursion r = new recursion();
        r.printallele(arr, 0);
    }
}
*/

/* 
import java.util.ArrayList;

public class recursion{
    public void evenno(int arr[],int index,ArrayList<Integer> ans){
        if(index==arr.length) return;
        if(arr[index]%2==0){
            ans.add(index);
            System.out.println(arr[index]);
        }
        
        evenno(arr,index+1,ans);
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        int arr[]= {4,2,3,4,5,6,3,6};
        recursion r = new recursion();
        r.evenno(arr,0,ans);
        
    }
}*/
/* 

import java.util.ArrayList;

public class recursion{
    public void findalloccurance(int arr[],int index,int target,ArrayList<Integer> res){
        
        if(index==arr.length) return;
        if(arr[index]==target){
            res.add(index);
        }
        
        findalloccurance(arr, index+1, target,res);
        System.out.println(index+" ");
        


    }
    public static void main(String[] args) {
        
        int arr[] = {2,4,3,4,6,5};
        int target = 4;
        ArrayList<Integer> res = new ArrayList<>();
        recursion r = new recursion();
        r.findalloccurance(arr, 0,target,res);
        
        
        
        
        
    }
}
*/


public class recursion{
    public boolean binarysearch(int start,int end, int target,int arr[]){
        if(start>end) return false;
        int mid = start+(end-start)/2;
        if(arr[mid]==target) return true;
        if(target<arr[mid]){
            return binarysearch(start,mid-1, target, arr);
        }
        else{

            return binarysearch(mid+1, end, target, arr);
        }


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 3;
        recursion r = new recursion();
        
        boolean res = r.binarysearch(0,arr.length-1,4, arr);
        System.out.println(res);
        
    }
}

















