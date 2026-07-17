import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
class mycollege{
    int regno;
    private int hashcode;

    mycollege(int regno){
        this.regno =regno;
        this.hashcode =Objects.hash(regno);

    }
    @Override
    public int hashCode(){
        return hashcode; 
    }
    @Override
    public boolean equals(Object obj){
        mycollege college = (mycollege) obj;
        return this.regno == college.regno;

        
    }

}

class myranking{
    int rank;
    myranking(int rank){
        this.rank = rank;
    }
    @Override
    public String  toString(){
        return ""+ this.rank;
    }

}


/* 
public class hashmap {



    public static void main(String[] args) {
        HashMap<Integer,String> mymap = new HashMap<>();
        mymap.put(1,"Poppy");
        System.out.println(mymap);
        System.out.println(mymap.get(1));
        System.out.println(mymap.containsKey(1));
        System.out.println(mymap.getOrDefault(5,"not present"));
        // how to iterate the map
        for(Map.Entry<Integer,String> entry: mymap.entrySet()){
            System.out.println("key ->"+ entry.getKey());
            System.out.println("value ->" + entry.getValue());
        }
        for(Integer key: mymap.keySet()){
            System.out.println("key ->"+ key);
            
        }
    }
}*/

public class hashmap{
    public static void main(String[] args) {
        HashMap<Integer,Integer> collegerankingmap = new HashMap<>();
        collegerankingmap.put(111,1);
        collegerankingmap.put(112,2);
        collegerankingmap.put(113,3);
        System.out.println(collegerankingmap.get(111));
        System.out.println(collegerankingmap.containsValue(1));
        HashMap<mycollege,myranking> collegerankingmap2 = new HashMap<>();
        collegerankingmap2.put(new mycollege(111),new myranking(1));
        collegerankingmap2.put(new mycollege(112),new myranking(2));
        collegerankingmap2.put(new mycollege(113),new myranking(3));
        System.out.println(collegerankingmap2.get(new mycollege(111)));// yhe null dega isilye hashcode likhna padega jo override kiya hai 
        System.out.println(collegerankingmap.containsValue(1));
        
    }
}
