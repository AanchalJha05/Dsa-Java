/*public class string2 {
    public static void main(String[] args) {
        // reverse the whole sentence
        String name ="hello qorld";
        StringBuilder sb = new StringBuilder();
        for (int i =name.length()-1; i >=0; i--){
            char ch = name.charAt(i);
            sb.append(ch);
            
        }
        System.out.print(sb);
    }
        
    
}*/
public class string2{
    public static void main(String[] args) {
        // reverse the only the word in the sentence while keeping their position
        /*String name = "hello world";
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                ans.append(sb.reverse());
                ans.append(' ');
                sb.setLength(0);
            }
        }
        ans.append(sb.reverse());
        System.out.println(ans);*/
        // compress string that is Input : "aaabbcc" Output: "a3b2c2"
        String name = "aaabbcc";
        StringBuilder sb = new StringBuilder();
        int count =1;
        for(int i=0;i<name.length()-1;i++){
            char ch = name.charAt(i);
            char next = name.charAt(i+1);
            if(ch==next){
                count++;

            }
            else{
                sb.append(ch);
                sb.append(count);
                count =1;
            }
        }
        // add the last element
        
        sb.append(name.charAt(name.length()-1));
        sb.append(count);
        System.out.println(sb);
    }
}