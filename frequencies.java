/*
public class frequencies {

    public void uniqueChar(String s) {

        int[] freq = new int[26];

        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            freq[index]++;
        }

        // Print the frequency of each letter
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);  // for letter a at i=0 yhe dega a -> 3 or ese hi loop chalega har character ke liye 
            System.out.println(letter + " -> " + freq[i]); // yaha show krva diya
        }
    }

    public static void main(String[] args) {
        frequencies f = new frequencies();
        f.uniqueChar("abaca");
    }
}*/


// Print the frequency of every lowercase letter.

// Input

// banana

// Output

// a -> 3
// b -> 1
// n -> 2

/*public class frequencies{
    public void lowercaseletter(String S){
        int[] freq = new int[26];
        for(int i=0;i<S.length();i++){
            char ch =S.charAt(i);
            int index = ch -'a';
            freq[index]++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                char letter = (char)('a'+i);
                System.out.println(letter+" ->"+freq[i]);

            }
            
        }


        
    }
    public static void main(String[] args){
        frequencies f = new frequencies();
        f.lowercaseletter("banana");

    }
}*/

/* 
public class frequencies{
    public void uniqueChar(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index = ch-'a';
            freq[index]++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==1){
                char letter = (char)('a'+i);
                System.out.println(letter +"->"+freq[i]);

            }
            

        }

    }
    public static void main(String [] args){
        frequencies f = new frequencies();
        f.uniqueChar("banana");
    }
}

*/

public class frequencies{
    public static void main(String[] args) {
        /* 
        String name = "banana";
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            int count =0;
            for(int j=0;j<name.length();j++){
                if(ch== name.charAt(j)){
                    count++;
                }
            }
            System.out.println(ch +" -> "+count);
        }
        
        */
       
        /*String name = "banana";
        boolean[] visited = new boolean[256];

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(visited[ch]){
                continue;
            }
            int count=0;
            for(int j = 0; j < name.length(); j++){
                if(ch== name.charAt(j)){
                    count++;
                }


                
            }
            visited[ch]= true;
            System.out.println(ch +" -> "+ count);
        }*/
        String name = "banana";
        int[] freq = new int[26];
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            char letter = (char)('a'+i);  // yhe (char)('a'+i) imse char jo hai vo int ko char me change krne ke liye use hota hai
            System.out.println(letter +" -> "+ freq[i]);
        }



        
        
    }
}



















