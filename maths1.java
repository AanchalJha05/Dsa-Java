public class maths1 {
    public void findnoofdigits(int num){
        int no = (int)Math.log10(num)+1;
        System.out.println("number of digits"+ no);
    }
    public static void main(String[] args) {
        maths1 m = new maths1();
        m.findnoofdigits(312);
        
    }
    
}
