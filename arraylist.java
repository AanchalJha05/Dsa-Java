import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;



/*public class arraylist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> vector = new ArrayList<>();
        System.out.println("enter the size");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            vector.add(sc.nextInt());
        }
        System.out.println("enter the scalar");
        int scalar = sc.nextInt();
        for(int i=0;i<vector.size;i++){
            vector.set(i,vector.get(i)*scalar);
        }
        System.out.println("vector after scalar multiplication");
        System.out.println(vector);
    }
}*/

public class arraylist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> vector = new ArrayList<>();
        System.out.println("enter the size");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            vector.add(sc.nextInt());
        }
        int left =0;
        int right = vector.size()-1;
        while(left<right){
            int temp = vector.get(left);
            vector.set(left,vector.get(right));
            vector.set(right,temp);
            left++;
            right--;


        }
        System.out.println(vector);
    }
}
























