import java.util.Scanner;
//Given a string s, the task is to find the length of the string.

/*public class String_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input");
        String input = sc.nextLine();
        
        int len = input.length();
        System.out.println("length of the input"+' '+len);
    }
    
}*/

/*public class String_practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string ");
        String input1 =  sc.nextLine();
        System.out.println("enter the second string" );
        String input2 = sc.nextLine();
        if (input1.compareTo(input2)==0){
            System.out.println("strings are equal");
        }else{
            System.out.println("string are not equal");
        }

        

    }
}*/
//Given a character ch and a string s, the task is to find the index of the first occurrence of the character in the string. If the character is not present in the string, return -1.
/*public class String_practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String word = sc.nextLine();
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        int index  = -1;
        for(int i =0; i<word.length();i++){
            if(word.charAt(i)==ch){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}*/
//Given a string s, a character c and an integer position pos, the task is to insert the character c into the string s at the specified position pos.
/*public class String_practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.nextLine();
        System.out.println("enter the character you want to insert ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the index");
        int index = sc.nextInt();
        StringBuilder sb = new StringBuilder(input);
        sb.insert(index,ch);
        String result = sb.toString();
        System.out.println("result"+result);
    }
}*/
//Given a string and a position (0-based indexing), remove the character at the given position.
/*public class String_practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String word = sc.nextLine();
        System.out.println("enter the character to remove");
        char ch = sc.next().charAt(0);
        System.out.println("enter the startig index");
        int start = sc.nextInt();
        System.out.println("enter the ending index");
        int end = sc.nextInt();
        StringBuilder sb = new StringBuilder(word);
        sb.delete(start,end);
        String result = sb.toString();
        System.out.println(result);
    }
}*/
// String concatenation is the process of joining two strings end-to-end to form a single string.
/*public class String_practice{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first string");
        String word1 = sc.nextLine();
        System.out.println("enter the second string");        
        String word2 = sc.nextLine();
        String result = word1 + word2;
        System.out.println(result);



    }
}*/
//Given a string s, reverse the string. Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes second last and so on.

/*public class String_practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word);
        for(int i = 0; i<word.length()/2;i++){
            int front = i;
            int back = word.length()-1-i;
            char frontchar =sb.charAt(front) ;
            char backchar = sb.charAt(back);
            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
            


        }
        System.out.println(sb);
    }
}*/
//Given a string s, containing lowercase alphabetical characters. The task is to print all non-empty substrings of the given string.
/*public class String_practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String input = sc.nextLine();
        int n = input.length();
        for(int i = 0; i<n;i++){
            for (int j = i+1; j <= n; j++) {
                
                String result = input.substring(i,j);
                System.out.println(result);
            }
        }

    }
    

}*/
//Given a string and a character, remove all the occurrences of the character in the string
/*public class String_practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the word");
        String s = sc.nextLine();
        System.out.println("enter the word to remove");
        char c = sc.next().charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!=c){
                sb.append(s.charAt(i));
                
            }
        }
        String result = sb.toString();
        System.out.println("result:"+" "+ result);

    }
}*/




















