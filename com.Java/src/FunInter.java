// public class FunInter {
//  void calculator( Add a){
//     a.sum(10,20);
//  }
// }
// @FunctionalInterface
// interface Add{
//     void sum(int a, int b);
//     }

//     class Addition implements Add{
//         public void sum(int a , int b){
//             int c = a+b;
//             System.out.println(c);
//         }

//     }
// class Test{
//     public static void main(String[] args){
//         Addition a1 = new Addition();
        
//     FunInter funInter = new FunInter();
//     funInter.calculator(a1);

//     }
// }

@FunctionalInterface
interface calclation{
    int num(int a, int b);;
}
class sum{
    public static void main(String[] args){
        calclation add = (a,b)->a+b;
        calclation mul = (a,b)->a*b;
        calclation sub = (a,b)->a-b;
        calclation div = (a,b)->a%b;
        System.out.println(add.num(10,20));
        System.out.println(mul.num(10,20));
        System.out.println(sub.num(10,20));
        System.out.println(div.num(10,20));


    }
}