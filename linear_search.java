import java.util.*;
/*public class linear_search {
    public static void main(String[] args) {
        int arr[] = {2,1,4,3,6,8,5,3};
        linear_search(arr,3,false);
        linear_search(arr,3,true);
        
        
    }
    public static void linear_search(int arr[],int target, boolean findlast){
        int ans =-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                ans =i;
                if(findlast ==false){
                    break;
                }
                

            }

        }
        
        if(ans==-1){
            System.out.println("element is not present in the array");
        }else{
            System.out.println("target found at "+ans);

        }

    }
    
}*/

/*public class linear_search {
    public static void main(String[] args) {
        int arr[] = {2,1,4,3,6,8,5,3};
        
        //linear_search(arr,3);
        findmax(arr);
        
        
    }
    public static void linear_search(int arr[],int target){
        
        int ans[]=new int[arr.length];
        int k=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                ans[k] =i;
                k++;
                
                

            }

        }
        
        if(k==0){
            System.out.println("element is not present in the array");
        }else{
            for(int i=0;i<k;i++)
                System.out.println("target found at "+ans[i]);

        }

    }
    
}*/

/*public class linear_search{
    public static void main(String[] args) {
        int arr[] ={2,1,4,3,6,8,5,2};
        findmax(arr);
        linear_search(arr,3,false);
    }
    public static void findmax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max =arr[i];
                
            }
        }
        System.out.println("maximum element is"+max);
    }
    public static void linear_search(int arr[],int target,boolean findlast){
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans=i;
            if(findlast==false){
                break;
            }

            }
        }
        if(ans==-1){
            System.out.println("Element is not present");

        }else{
            System.out.println("element found at "+ans);
        }
    }
}*/

public class linear_search{
    public static void main(String[] args) {
        int arr2d[][]={
            {1,2,3,4,5},
            {6,7,8,9,9},
            {2,3,4,5,7},
            {7,8,10,11,12}
        };
        
        //linear_searchmultiple2d(arr2d,12);
        //linear_search2d(arr2d,5,false);
        //linear_search2d(arr2d,5,true);
        findmaximumsumsubarray(arr2d);
    }
    // this code is valid for normal and jacked matrix
    public static void findmaximumsumsubarray(int arr[][]){
        int max=Integer.MIN_VALUE;
        int resindex = -1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum =sum+arr[i][j];

            }
            if(sum>max){
                max=sum;
                resindex=i;
            }


        }
        System.out.println("maximum sum subarray is "+ max +", for the index "+resindex);
    }
    public static void linear_searchmultiple2d(int arr[][],int target){
        int size =0;
        for(int i=0;i<arr.length;i++){
            size =size+arr[i].length;
        }
        int ans[][]=new int[size][2];
        int k=0;
        int outerindex=-1;
        int innerindex=-1;
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<arr[i].length;j++){
                if(target==arr[i][j]){
                    //outerindex=i;
                    //innerindex=j;
                    ans[k][0]=i;
                    ans[k][1]=j;
                    k++;
                }
                

            }
            if(found==true){
                break;
            }
        }
        
        if(k==0){
            System.out.println("Element is not present");

        }else{
            for(int i=0;i<k;i++){
                System.out.println("element at pos "+ans[i][0]+", "+ans[i][1]);
            }
            
        }

        
    

    }
    public static void linear_search2d(int arr[][],int target,boolean findlast){
        int outerindex=-1;
        int innerindex=-1;
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<arr[i].length;j++){
                if(target==arr[i][j]){
                    outerindex=i;
                    innerindex=j;
                    if(findlast==false){
                        found = true;
                        break;
                    }
                }
                

            }
            if(found==true){
                break;
            }
        }
        
        if(outerindex==-1){
            System.out.println("Element is not present");

        }else{
            System.out.println("element found at "+outerindex+","+innerindex);
        }

        
    }
    public static void linear_search(int arr[],int target,boolean findlast){
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans=i;
            if(findlast==false){
                break;
            }

            }
        }
        if(ans==-1){
            System.out.println("Element is not present");

        }else{
            System.out.println("element found at "+ans);
        }
    }

}











