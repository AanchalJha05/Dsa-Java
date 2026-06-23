import java.util.Scanner;

public class practice_lec11 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]= sc.nextInt();

            }

        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==x){
                    System.out.print("the number found on ("+ i +","+ j +")");
                    

                }
            }
        }
    }*/
    //Question2
    /*Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int transpose[][] = new int[rows][cols];
    for(int i=0;i<rows;i++){
     
   for(int j=0;j<cols;j++){
            transpose[i][j] = sc.nextInt();
        } 

    }
    for(int j = 0;j<cols;j++){
        for(int i=0;i<rows;i++){
            System.out.print(transpose[i][j]+" ");
        }
        System.out.println();
    }*/
    //question 1
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int spiral[][]= new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0; j<m;j++){
            spiral[i][j]=sc.nextInt();
        }
    }
    System.out.println("to print the spiral order matrix");
    int row_start = 0;
    int row_end = n-1;
    int col_start = 0;
    int col_end= m-1;
    while(row_start<=row_end && col_start<= col_end){
        for(int col = col_start;col<=col_end;col++){
            System.out.print(spiral[row_start][col]+" ");

        }
        row_start++;
        for(int row=row_start;row<=row_end;row++){
            System.out.print(spiral[row][col_end]+" ");

        }
        col_end--;
        for(int col=col_end;col>=col_start;col--){
            System.out.print(spiral[row_end][col]);
        }
        row_end--;
        for(int row =row_end;row>=row_start;row--){
            System.out.print(spiral[row][col_start]);

        }
        col_start++;
        System.out.println();


    }



    
}
}