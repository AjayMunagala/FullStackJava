@FunctionalInterface
interface InterNum {
    void number(int a);
    
}
class Main{
    public static void main(String[] args){

   InterNum n1 = (n)->{
    String arr[] ={"one","two","three", "four"};
    System.out.println(arr[n]);

   };
   n1.number(1);
 }
}
