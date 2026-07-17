/*import java.util.HashMap;
public class hashmapquestion{
    
    public static void main(String[] args) {
        int arr[]= {2,1,7,8,2,1,9,10,9,9,2,8,2};
        int ans = mostfrequentElement(arr);
        System.out.println(ans);
        
    }
    public static int mostfrequentElement(int arr[]){
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        int ans =-1;
        int maxfreq = 0;
        for(int i=0;i<arr.length;i++){
            
            if(freqmap.containsKey(arr[i])){
                int val = freqmap.get(arr[i]); // read the current count 
                val+=1;                            // increase it
                freqmap.put(arr[i],val);        // write the new count back
            }else{
                freqmap.put(arr[i],1);
            }
            if(freqmap.get(arr[i])>maxfreq){   // it check the number ki 2, 1 baar hai and maxfreq = 0 hai to 1>0 t
                maxfreq= freqmap.get(arr[i]); // maxfreq ko 1 kr denge 
                ans = arr[i];
            }
        }
        return ans;
    }
}*/

import java.util.HashSet;
import java.util.Iterator;
public class hashmapquestion{
    public static void main(String[] args){
        HashSet<Integer>set = new HashSet<>();
        set.add(4);
        set.add(6);
        System.out.println(set);
        for(Integer i:set){
            System.out.println(i);

        }
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
            
        }
        
        
    }
}