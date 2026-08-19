import java.util.HashMap;
import java.util.*;
//Character frequency using HashMap
/*public class hashmap2 {
    public static void main(String[] args) {
        String s = "banana";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
          }
    System.out.println(map);
    }
       
}*/

// HashMap Question 1 — Basic put() and get()
//Create a HashMap<String, Integer> and store:
/*public class hashmap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("x",90);
        map.put("y",99);
        map.put("z",89);
        System.out.println(map);
        System.out.println(map.get("x"));
    }  
}*/

//Question 3 — Count frequency of numbers

/*public class hashmap2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1, 2, 2, 3, 1, 2};

        for(int i=0;i<arr.length;i++){
            int c = arr[i];
            
            map.put(c,map.getOrDefault(c,0)+1);


        }
        System.out.println(map);


    }  
}*/
//Question 4 — Find the most frequent number
/*public class hashmap2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2, 3, 3, 3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        System.out.println(map);
        int maxi = Integer.MIN_VALUE;
        int answer =0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {

            int key = entry.getKey();
            int values = entry.getValue();
            //maxi = Math.max(maxi,values); // to only get the max values 
            if(values>maxi){   // tp get the both key and values

                maxi = values;
                answer = key;

            }
            
        }
        System.out.println(answer+" -> " + maxi);
        


    }  
}*/
//Question 5 — Find the first non-repeating number
public class hashmap2 {
    public static void main(String[] args) {
        
    }
       
}

