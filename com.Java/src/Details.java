public class Details {
    public void printDetails(String name,String... hobies){
        System.out.println("Name of the Person is:"+ name);
        System.out.print("Hobbies of the person: ");
        for(int i=0;i<hobies.length;i++){
            System.out.print(hobies[i]+",");
        }
        for(String i : hobies){
            System.out.println();
            System.out.print(i+",");
        }



    }
    public static void main(String[] args){
        Details d = new Details();
        d.printDetails("ajay", "playing","music","dance");
    }
    
}
