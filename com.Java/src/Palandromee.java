/* */
import java.util.Scanner;
public class Palandromee{
  
    public void checker(String word){
      boolean a = true;
      int start =0;
      int end =word.length()-1;
      System.out.println(start);
      System.out.println(end);
      while(start < end){
        if(word.charAt(start)!= word.charAt(end)){
          a = false;
          break;
        }
        else {
          start++;
          end--;
        }
      }
      if(!a){
        
        System.out.println(word +": Not a Palindrome");
      }else{
        System.out.println(word +": Is a palindrome");
        System.out.println("--------------------------------------------------------");
      }

    }     
    //-------------------------------------------------------------
    public void checkPalindrome(String word){
    //----------Using predefined method-----------------------------
      StringBuilder sb = new StringBuilder(word);                      

      String rev = sb.reverse().toString();
      System.out.println("Reverse of the word is :"+rev);
      if (word.equalsIgnoreCase(rev)){
        System.out.println(word+" is a palindrome");
      }
        else{
          System.out.println(word +" Not a palindrome");
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
      
      }
      //--------------------------------------------------------
      public void check(String word){
        char ch;
        String reve="";
        for(int i = word.length()-1;i>=0; i--){
          
          ch = word.charAt(i);
          reve = reve+ch;
        }
        System.out.println(reve);
        if (word.equals(reve)){
          System.out.println(word+" is a palindrome");
        }
          else{
            System.out.println(word+" Not a palindrome");

          }
          System.out.println();
      }

        

    
    public static void main(String[] args){
        String word;
        Scanner sc = new Scanner(System.in);
        while(true){
         System.out.println("Enter the word to check the palindrome");
         word = sc.nextLine();
         Palandromee p = new Palandromee();
          p.checker(word);
          p.checkPalindrome(word);
          p.check(word);
         sc.close();

    }
    
  }

    
}
