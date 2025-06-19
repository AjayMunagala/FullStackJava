import java.util.ArrayList;


class rou {
  
public static void main(String[] args) {
    ArrayList<String> animal = new ArrayList<String>();
    animal.add("Lion");
    animal.add("Buffalo");
    animal.add("Monkey");
    animal.add("Panda");
    animal.add("Cat");
    animal.add("Tiger");
    animal.stream().forEach(System.out::print);
    System.out.println();
      
    
}
}