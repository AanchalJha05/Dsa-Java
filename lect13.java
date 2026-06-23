import java.util.Scanner;

public class lect13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        for(int i=0;i<sb.length()/2;i++){
            int front =i;
            int back = sb.length()-1-i; // 5-1-0=>4
            char backchar = sb.charAt(back); 
            char frontchar = sb.charAt(front);
            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);

        }
        System.out.println(sb);


    }
    
}
