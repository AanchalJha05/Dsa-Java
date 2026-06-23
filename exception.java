import java.util.Scanner;
/*public class exception {
    public int getuserinput(){
        Scanner sc = new Scanner(System.in);
        int val =0;
        try{
            val = sc.nextInt(); // yhe yaha likh diya to bahar me dikkat aayegi isliye bahar val = 0 kr diya 

        }catch(Exception e){
            System.out.println("failed"+ ":"+e);

        }
        
        return val;

    }
    public static void main(String[] args){
        exception n = new exception();
        int result = n.getuserinput();
        System.out.println(result);
        


    }
    
}*/
// muti try catch 
/*public class exception{
    public static void main(String[] args){
        try{
            int arr[] = {6,7,9};
            System.out.println(arr[5]); // yhe show krega then yhe thik hua to 
            String s = null;
            System.out.println(s.length()); /// yhe chalega or agr yhe thik kr diya to 
            System.out.println(5/0);   // yhe chalega 
        }catch(ArithmeticException e){
            System.out.println("you can not divide by zero"+e);
        }catch(ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Either Array index problem or Null pointer problem"+e);
        }catch(Exception e){
            System.out.println("recived some other message"); // isko baki vo catch se upper nhi de skte kyuki error aayega as uske alawa jo honge error vo jisme aate h

        }
    
    }
}
*/

// Custom exception handling
class lowermarksException extends Exception{
    public lowermarksException(String message){
        super(message);
    }
}
public class exception{
    public static void enrollstudent(String name , int marks) throws lowermarksException{
        if(marks<40){
            throw new lowermarksException("Sorry " +name+", you need at least 40 makrs to enroll!");



        }else{
            System.out.println(name+",you have enrolled successfully !");

        }
    }
    public static void main(String[] args){
        try{
            enrollstudent("govind", 99);
            

        }catch(lowermarksException e){
            System.out.println("caught exception"+e.getMessage());

        }
        try{
            enrollstudent("anbcd", 0);
        }catch(lowermarksException e){
            System.out.println("caught exception "+e.getMessage());
        }

    }
}





















