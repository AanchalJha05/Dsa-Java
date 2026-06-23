import java.util.Scanner;
public class lec12_practice{
    public static void main(String[] args) {
        /*//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int totallength = 0;

        String array[] = new String [size];
        for(int i =0;i<size;i++){
            array[i]= sc.next();
            totallength += array[i].length();


        }
        System.out.println(totallength);*/

        //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        //Example : 
        // original = “eabcdef’ ; result = “iabcdif”
        // Original = “xyz” ; result = “xyz”
        /*Scanner sc = new Scanner(System.in);
        
        String original  = sc.next();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)=='e'){
                result.append('i');
            }else{
                result.append(original.charAt(i));
            }
        } 
        System.out.println(result);*/
//         Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”
        /*Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        StringBuilder username = new StringBuilder();
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            username.append(email.charAt(i));
        }
        System.out.println(username);*/
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        int index = email.indexOf('@');
        String username = email.substring(0,index);
        System.out.println("Username:" +username);



          

        


    }

}