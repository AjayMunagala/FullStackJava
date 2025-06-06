/*Count Vowels and Consonants
Write a program to input a string and count the number of vowels and consonants in it.





Q4. Count Words in a Sentence
Input a sentence and count the number of words. Assume words are separated by single 
spaces.

Q5. Convert to Title Case
Write a program to convert the first letter of each word in a sentence to uppercase.

Q6. Check for Anagram
Accept two strings and check whether they are anagrams of each other.
(e.g., listen and silent)

Q7. Frequency of Characters
Input a string and print the frequency of each character (excluding spaces).

Q8. Remove Duplicate Characters
Accept a string and remove all duplicate characters, keeping only the first occurrence.

Q9. Encrypt a String (Caesar Cipher)
Shift each character of a string by 3 positions forward in the alphabet and print 
the new string.

Q10. Longest Word in a Sentence
Input a sentence and display the longest word along with its length.

Q11. Rearrange Alphabetically
Accept a string and display all characters sorted in alphabetical order 
(excluding spaces).

Q12. Find the Most Frequent Word
Accept a sentence and print the word that appears the most number of times.

Q13. Check if Pangram
Accept a sentence and check if it's a pangram (i.e., contains all 26 letters of the
English alphabet at least once).

Q14. Pattern Matching
Accept two strings: a sentence and a word. Check if the word is present in the 
sentence and how many times it appears.

Q15. Toggle Case of Characters
Convert all uppercase letters to lowercase and vice versa in the given string. */
import java.util.Scanner;
public class Alphabet {
    int count =0;
    int num =0;
    int  space = 0;
    public void CountNoOfVowConst(String sent){
        for (int i =0; i<sent.length() ; i++){
            char ch = sent.charAt(i);
            if(ch !=' '){
                if(ch=='A' || ch=='a'|| ch =='e'|| ch =='E' || ch == 'i' || ch =='I' || ch == 'o'|| ch == 'O' || ch == 'u' || ch == 'U'){
               count++;
            }
            else{
                num++;
            }
        }else {
            space++;
        }
    
            
        }   
        System.out.println("Vowels count is: "+ count);
        System.out.println("Consonents count is: "+ num);  
        System.out.println("spaces in the sentence is : "+ space);   

    }

            
        
    
    public static void main(String[] args){
        String sentence;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        sentence = sc.nextLine();
        Alphabet a1 = new Alphabet();
        a1.CountNoOfVowConst(sentence);
        sc.close();


    }
    
}
