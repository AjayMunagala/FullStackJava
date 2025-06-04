/*
 * write a java program for findining MaximumuniquesubString and its length in the given String.
you have to take on method that will find in a String cointains only unique character or not.
mathod like public static boolean isUniqueString(String s); after that in main method take one
String value and call this isUniqueString(String s) method in the logical way for finding maximum
length and maximum subString and print that.
Note:if you know another way like through collection or other things you can do.
Example: String s="abcbabab"
Output: Maximum Unique SubString ="abc";
        length=3;
 */
import java.util.LinkedHashSet;
import java.util.Scanner;
public class substring {
    public static void idUniqueString(String s){
        LinkedHashSet<Character>  set = new LinkedHashSet<Character>();
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            set.add(ch);
            }
            System.out.println(set.size());
            System.out.println(set);
          




        }

    
    
    public static void main(String[] args){;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        idUniqueString(s);


    }
    
}
