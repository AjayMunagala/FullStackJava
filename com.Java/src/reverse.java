import java.util.Scanner;
public class reverse {
    String rev = "";
    char ch;
    public void reveseString(String word){
//-------------using predefined method-----------------------------
        StringBuilder sb = new StringBuilder(word);
        //System.out.println(sb.reverse()); 

        rev = sb.reverse().toString();
        System.out.println(rev);
                    
            
       //------------------------------------------------------
        for(int i = word.length()-1; i>=0;i--){
            ch = word.charAt(i);
            rev = rev+ch;
            
        }
        System.out.println("Reverse of the String: "+rev);
    }
    public static void main(String[] args){
        String word;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string");
        word = sc.nextLine();
        reverse r1 = new reverse();
        r1.reveseString(word);
        sc.close();


    }
    
    
}
