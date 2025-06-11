import java.util.function.Predicate;

public class InterfaceMethods {
    public static void main(String[] args){
        Predicate<Integer> evenodd = (num) -> num % 2 == 0;
        System.out.println("is Even :"+evenodd.test(10));

        Predicate <Integer> d1 = (num) -> num>18;
        System.out.println("The person is eligible for the driving license :"+ d1.test(19));

        Predicate <Integer> ly = year ->year %4 == 0;
        System.out.println("year is leap year :"+ly.test(2018));
        }
    
}

