//Sort in descending
/*public class sorting_practice {
    public static void PrintArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        
    }
    public static void main(String args[]) {
        int arr[] = {7,8,3,2,1};
        //selection sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        PrintArray(arr);
        
    }
    
}*/
/*public class sorting_practice{
    public static void PrintArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();

    }
    public static void main(String[] args) {
    int arr [] = {7,5,8,1};
    for(int i=0;i<arr.length;i++){
        int smallest =i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]>arr[smallest]){
                smallest = j;
                 
            }
        }
        //swap
        int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;

    }  
    PrintArray(arr); 
    }
}*/

/*public class sorting_practice{
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,3,5,6};
        for(int i=1;i<arr.length;i++){
            int current =arr[i];
            int j =i-1;
            while(j>=0 && arr[j]<current){
                // keep swapping 
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        PrintArray(arr);

    }
}*/
import java.util.*;
// Count number of swaps/comparisons
/*public class sorting_practice{
    public static void PrintArray(int  arr []){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String args []) {
        int arr [] = {6,8,5,3,0,9};
        int swap = 0;
        int comparisons =0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                comparisons++;
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swap++;


                }
                
                
            }
        }

        PrintArray(arr);
        System.out.println("so the comparison and swap is :"+" "+comparisons+" "+ "&"+" "+swap);
    }
}*/


// Sort an array of strings (lexicographically)
/*public class sorting_practice{
    public static void PrintArray(String [] arr){
        for(String s : arr){
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of string");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String arr [] = new String[n]; 
        System.out.println("enter the strings");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        PrintArray(arr);



    }
}*/

// Find smallest & largest element in sorting 
/*public class sorting_practice{
    public static void PrintArray(int arr[] ) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        
    }
    public static void main(String args[]) {
        int arr[] = {-7,-8,3,2,1};
        //bubble sort
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    

                }
            }
            
            
        }
        PrintArray(arr);
        System.out.println(arr[0] +"&"+ arr[arr.length-1]);

    }
}*/

// Find smallest & largest element in unsorted array
/*public class sorting_practice{
    public static void main(String[] args) {
        int arr[] ={-8,6,3,2,9};
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];

            }
            if(arr[i]>max){
                max = arr[i];

            }

        }
        System.out.println("max: "+" "+ max );
        System.out.println("min "+" "+min);

    }
}*/

//Move all zeros to end

//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]

public class sorting_practice{
    public static void PrintArray(int arr[] ) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        
    }
    public static void main(String args[]) {
        int arr[] = {7,0,8,3,0,2,1};
        //bubble sort
        int j = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
                j++;
            }
        }
        PrintArray(arr);

    }
}





