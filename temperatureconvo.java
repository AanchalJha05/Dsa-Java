public class temperatureconvo {
    public void ftoc(double f){
        double c = (f-32)*(5.0/9);
        System.out.println(c);
    }
    public void ctof( double c){
        double f = ((9.0/5)*c)+32;
        System.out.println(f);

        
    }
    public static void main(String [] args){
        temperatureconvo t = new temperatureconvo();
        t.ftoc(30);
    }
    
}  
