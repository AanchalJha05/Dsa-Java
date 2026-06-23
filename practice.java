import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int mult = 0;
        for(int i =1;i<=5;i++){
            mult = i*n;
            System.out.println(mult);


        }
    }
}
