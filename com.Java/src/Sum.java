public class Sum {
    public static void findSum(double... a){
        double x = 0;
        for(int i =0;i<a.length;i++){
            x=a[i]+x;

        }
        System.out.println("Sum of the numbers given is :"+ x);

    }
    public static void main(String[] args){
        findSum(10,20.8,78.9,55.5,88.0);

    }
    
}
