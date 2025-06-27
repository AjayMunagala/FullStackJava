import java.util.Scanner;
class ZeroException extends Exception{}
public class Excep1 {
    int a;
    int b;
    public void div(int a,int b) throws ZeroException {
        // try {
        //     int d = a/b;
        //     System.out.println("Quotient is : "+d);
        //     int c = a%b;
        //     System.out.println("Remainder is : "+c);
        // } catch (ArithmeticException e) {
        //    System.out.println("Please Enter the Positive Number");
        // }
        if(b<=0){
            throw new ZeroException();
        }else {
            System.out.println(a%b);
                }
    }
    public static void main(String[] args) throws ZeroException{
        Excep1 exp = new Excep1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();
        exp.div(a,b);
        sc.close();

    }
    
}
