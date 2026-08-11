
import java.lang.String;


public class string1 {
    public static void main(String[] args) {
        /* 
        Find the length of a string.
        String name = "helloworld";
        System.out.println(name.length());
        //Print each character of a string.
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            System.out.print(ch);
        }
        */
        
        /*    //Reverse a string

        // method 1
        String name = "hello";
        for(int i=name.length()-1;i>=0;i--){
            char ch = name.charAt(i);
            System.out.print(ch);

        }
        // method 2
        String rev = "";
        for(int i=name.length()-1;i>=0;i--){
            rev+= name.charAt(i);
        }
        System.out.print(rev);
        */


        /*
        Check whether a string is a palindrome.
        String name = "hello";
        String rev = "";
        for(int i=name.length()-1;i>=0;i--){
            rev += name.charAt(i);

        }
        if(name.equals(rev)){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        */

        /* count vowels
        String name = "HELLO";
        int count =0;
        for(int i=0;i<name.length();i++){
            char ch = Character.toLowerCase(name.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            
        }
        System.out.print(count);
        */

        /* 
        count consonants

        String name = "HELLO123";
        int count =0;
        for(int i=0;i<name.length();i++){
            char ch = Character.toLowerCase(name.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| !Character.isLetter(ch)){
                continue;
            }
            else{
                count++;
            }
            
        }
        System.out.print(count);
        */

        /* 
        Count words in a sentence.
        String sent = " i am a robot ";
        int count =0;
        for(int i=0;i<sent.length();i++){
            char ch = sent.charAt(i);
            if(!Character.isSpaceChar(ch)){
                if(i==0|| Character.isSpaceChar(sent.charAt(i-1))){
                    count++;
                }
                
            }
            
        }
        System.out.println(count);
        */
       /* 
        //Count uppercase and lowercase letters.
        String name="Helllo";
        int countupper =0;
        int countlower =0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(Character.isUpperCase(ch)){
                countupper++;
            }
            else if(Character.isLowerCase(ch)){
                countlower++;
            }
            else{
                continue;
            }
        }
        System.out.println(countlower);
        System.out.println(countupper);
        */

        /*
        // Ascii value of every of character
        String name = "hello12";
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            System.out.println((int)ch);
        }
        */

       /* 

       // Remove all spaces.
        String sent = "hello world 123";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<sent.length();i++){
            char ch = sent.charAt(i);
            if(!Character.isWhitespace(ch)){
                sb.append(ch);
            }
            else{
                continue;
            }

        }
        System.out.println(sb);
        */

        /*
        Remove all vowels from a string. 
        String name = "HELLO world";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char ch = Character.toLowerCase(name.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;

            }
            else{
                sb.append(ch);

            }
            
        }
        System.out.println(sb);
        */
        

    }
    
}

public class string1 {
    public static void main(String[] args){
        /*Reverse each word individually, but keep the words in the same order.

        Example 1
        Input : "hello world"
        Output: "dlrow olleh" */
        String name = "hello world";
        StringBuilder sb = new StringBuilder();
        for(int i=name.length()-1;i>=0;i++){

            char ch= name.charAt(i);
            sb.append(ch);
        }
        System.out.println(sb);

    }
}