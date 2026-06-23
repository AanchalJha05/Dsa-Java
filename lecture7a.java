import java.util.Scanner;

public class lecture7a {
    static void factorial(){
        int fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        for(int i =1 ;i<=n;i++){
            if(n==1){
                System.out.println(fact);
            }else{
                fact = i*fact;
            }

        }
        System.out.println(fact);


        
    }
    public static void main(String[] args) {
        factorial();
    }

    
}
