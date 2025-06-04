public class Target {
    public static void TargetValue(int value,int... a) {
        boolean b= true;
        for(int i =0;i<a.length;i++){
            if(a[i]==value){
                b = true;
                break;
                
            }else{
                b = false;
            }
        }
        if(b == true){
            System.out.println("Target value "+ value+"is present in the given list");
        }else{
            System.out.println("Target value "+ value+"is not present in the given list");
        }



    }
    public static void main(String[] args){
        TargetValue(10,220,40,50,10,3,6,0,35);
    }
    
}
