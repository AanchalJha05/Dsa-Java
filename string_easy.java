import java.util.Scanner;
/*public class string_easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String input = sc.nextLine();
        input = input.toLowerCase();
        boolean[] seen = new boolean[26];

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch>='a'&& ch<='z'){
                seen[ch-'a']=true;
            }
        }
        boolean isPangram = true;
        for(int i=0;i<26;i++){
            if(!seen[i]){
                isPangram = false;
                break;
            }
        }
        if(isPangram){
            System.out.println("It is a pangram");
        }else{
            System.out.println("it is not pangram");
        }

    }
    
}*/

//Given a string s, the task is to check if it is palindrome or not.
/*public class string_easy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the word");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for(int i =0;i<s.length()/2;i++){
            int front = i;
            int back = s.length()-1-i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        String result = sb.toString();
        System.out.println(result);
        if (result.compareTo(s)==0) {
            System.out.println("It is palidrome");
            
        }else{
            System.out.println("it is not palidorme");
        }
    }
}*/

//Given two strings txt and pat, the task is to find if pat is a substring of txt. If yes, return the index of the first occurrence, else return -1.
/*public class string_easy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text");
        String txt = sc.nextLine();
        System.out.println("enter the pat");
        String pat = sc.nextLine();
        boolean found = false;
        int index =-1;
        for(int i=0;i<txt.length();i++){
            for(int j=i+1;j<=txt.length();j++){
                
                String R1= txt.substring(i,j);
                System.out.println(R1);
                if(R1.equals(pat)){
                    found = true;
                    index = i;
                    break;


                }

            }
            if(found) break;

        }
        if(found){
            System.out.println("Yes it is Substring of Txt");
            System.out.println("first occurrence is at "+index);
        }else{
            System.out.println("No it is not a substring of Txt");
        }



    }
        
        

}*/


/*public class string_easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String txt = sc.nextLine();

        System.out.println("Enter the pattern:");
        String pat = sc.nextLine();

        int n = txt.length();
        int m = pat.length();
        int index = -1;

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && txt.charAt(i + j) == pat.charAt(j)) {
                j++;
            }

            if (j == m) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Yes it is Substring of Txt");
            System.out.println("First occurrence index: " + index);
        } else {
            System.out.println("No it is not a Substring of Txt");
        }

        sc.close();
    }
}*/


//Given two non-empty strings s1 and s2 of lowercase letters, determine if they are anagrams — i.e., if they contain the same characters with the same frequencies.
// WORDS
/*import java.util.*;
public class string_easy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word one");
        String input1 = sc.nextLine();
        System.out.println("enter the second word");
        String input2 =sc.nextLine();
        if(input1.length()!=input2.length()){
            System.out.println("this is not anagrams");
            return;//to prevent wrong logic as it start messing up all things
        }
        char []arr1 =input1.toCharArray();
        char [] arr2 = input2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("It is anagrams");
        }else{
            System.out.println("this is not anagrams");
        }

        

    }
}*/

// PHRASES 
/*import java.util.*;
public class string_easy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s1 = sc.nextLine();
        System.out.println("enter the sentence");
        String s2 = sc.nextLine();
        
        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        if(s1.length()!=s2.length()){
            System.out.println("it is not anagram");
            return;
        }
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("this is Anagram");
        }else{
            System.out.println("this is not an anagram");
        }
    }
}*/

//Given two strings of lowercase alphabets and a value k, the task is to find if two strings are K-anagrams of each other or not.
/*import java.util.*;
public class string_easy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word1");
        String s1 = sc.nextLine();
        System.out.println("enter the word2");
        String s2 = sc.nextLine();
        System.out.println("enter the value of k");
        int k = sc.nextInt();
        if(s1.length()!=s2.length()){
            System.out.println("this is not Aangram");
            return;

        }
        int [] count = new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;


        }
        int changes =0;
        for(int i=0; i<26;i++){
            if(count[i]>0){
                changes+=count[i];
            }
        }
        if(changes<=k){
            System.out.println("Yes,k-Anagram");
        }else{
            System.out.println("No K-Anagram");
        }
    }
}*/



// Input: s = "i love programming"
//Output: "i%20love%20programming"
//Explanation: The 2 spaces are replaced by '%20'
/*public class string_easy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s1 = sc.nextLine();
        String s2 = "%20";
        String result = s1.replaceAll(" ", s2);
        //String result = s1.trim().replaceAll("\\s+", "%20");
        //     \\s+ = one or more spaces
        // trim() = removes extra spaces from start/end
        System.out.println("the result is:"+" "+result);
    }
}*/

   // palidrome
public class string_easy{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String s= sc.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        int n= s.length();
        for(int i=0; i<n/2;i++){
            int front =i;
            int back =n-1-i;
            char front_char = sb.charAt(front);
            char back_char = sb.charAt(back);
            sb.setCharAt(front, back_char);
            sb.setCharAt(back,front_char);
        }
        if(s.equals(sb.toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
} 








