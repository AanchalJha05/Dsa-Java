public class string {
    public static void main(String[] args) {
        // String s1 = "hello";
        // s1.concat("world"); //  string is immutable so this doesn't work
        // System.out.println(s1);
        // String s1 = "ja"+"va";
        // String s2 = "java";
        // System.out.println(s1==s2);
        // problem of immutability
        String s ="";
        for(int i=0;i<5;i++){
            s+=i; // s = s+i;
            System.out.println(s);

        }
    }
    
}
