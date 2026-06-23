import java.util.Scanner;

public class lec10{
    public static void main(String[] args){
        /*int[] marks = new int[3];// isko tum int marks []= new int [3] bhi likh skte ho ...[] aage ho piche ho farak nhi padta 
        marks[0] = 89;//phy
        marks[1] = 90;//chem
        marks[2] = 94;//eng
        System.out.println(marks); //gives jarg value(mtlb jese usne store kiya hai vese hi denge )
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        for(int i = 0; i<3;i++){
            System.out.println(marks[i]);*/


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0;i<size; i++){
            numbers[i] =  sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
        int x = sc.nextInt();
        for(int i=0;i<size;i++){
            if (numbers[i] == x){
                System.out.println("index at which x found:"+i);
            }
            
        }


            

        }

    }

