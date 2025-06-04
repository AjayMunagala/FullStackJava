

@FunctionalInterface
interface EvenOdd{
    void display(int a);
}
class Main{
    public static void main(String[] args){
    EvenOdd ev =(n)->{
        if(n%2 ==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    };
    ev.display(2);
}
}
