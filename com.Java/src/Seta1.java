/*
 * Write a Java program that prompts the user to enter a positive integer and checks if the entered number is both positive and prime. The program should use lambda expressions to implement the necessary checks and print out the results separately.

Your program should follow these specifications:

Input:

Prompt the user to enter a positive integer.
Processing:

Implement a lambda expression to check if a given number is positive, using the Predicate interface.
Implement a lambda expression to check if a given number is prime,  using the Predicate interface.
Use the implemented lambda expressions to separately check if the entered number is positive and if it is prime.

Output:

Print whether the entered number is positive.
Print whether the entered number is prime
 */
import java.util.Scanner;
@FunctionalInterface
public interface Seta1 {
    void findNum(int num);
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    Seta1 A1 = (a)->{
        if(num>0){
            System.out.println(num +" is positive integer"); 
    }else {
        System.out.println(num+ "is negative integer");
        }

    
    };
    Seta1 A2 = (b)->{
        int count = 0;
        for(int i =2;i<=b;i++){
            if(b%i==0){
                count++;
            }

        }
        if(count < 2){
            System.out.println(b +" is prime");
        }else {
            System.out.println(b+ "is not a prime");
        }
    };
    A1.findNum(num);
    A2.findNum(num);
}
}