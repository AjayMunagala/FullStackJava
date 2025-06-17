

// @FunctionalInterface
// interface EvenOdd{
//     void display(int a);
// }
// class Main{
//     public static void main(String[] args){
//     EvenOdd ev =(n)->{
//         if(n%2 ==0){
//             System.out.println("even");
//         }else{
//             System.out.println("odd");
//         }
//     };
//     ev.display(2);
// }
// }
//----------------------------------------------------------------------------------------

import java.util.function.Consumer;

class FunctionalInterface{
    public static void main(String[] args){
        Consumer<Integer> c1 = (value)->System.out.println(value);
        Consumer<Integer> c2 = System.out::println;
        Consumer<String> c3 =  (value)->System.out.print(value);
        Consumer<String>  c4 = System.out::println;
        c1.accept(10);
        c2.accept(20);
        c3.accept("AJay");
        c4.accept("Kumar");

    }
}
