import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    @SuppressWarnings("removal")
    public static void main(String[] args){
         ArrayList<Integer> a1 = new ArrayList<Integer>();
         a1.add(100);
         a1.add(30);
         a1.add(49);
         a1.add(79); 
         a1.add(200);
         System.out.println("Elements in the arraylist are:"+a1);
        
         System.out.println();
         System.out.println("Using for loop:");
         for(int i=0;i<a1.size();i++){
         System.out.println(a1.get(i));
        }

        System.out.println();
        System.out.println("Using foreach method");
        for(Integer i : a1){
            System.out.println(i);
        };


         System.out.println();
         System.out.println("size() Method :");
         System.out.println("Size of the ArrayList"+a1.size());

         System.out.println();
         System.out.println("Empty() Method :");
         System.out.println("List is Empty or not"+a1.isEmpty());

         System.out.println();
         System.out.println("contain() Method:");
         System.out.println("ArratList contain this element 49 :"+a1.contains(49));
         System.out.println("ArratList contain this element 50 :"+a1.contains(50));

         System.out.println();
         System.out.println("ITerator() Method :");
         Iterator<Integer> itr = a1.iterator();
         System.out.println("Elements are :");
         while(itr.hasNext()){    
             System.out.println(itr.next());
         } 

         System.out.println("Remove an element from array List:");
         a1.remove(2);
         a1.remove((Integer)100);
         a1.remove(new Integer(30));
         System.out.println(a1);

         System.out.println("---------------------------------------------------");
         ArrayList<Integer> b1= new ArrayList<Integer>();
         b1.add(20);
         b1.add(30);
         b1.add(40);
         b1.add(50);
         b1.add(60);
         b1.add(80);
         ArrayList<Integer> b2 = new ArrayList<Integer>();
         b2.add(20);
         b2.add(111);
         b2.add(222);
         b2.add(333);
         b2.add(444);
         b2.add(60);
         System.out.println(b1);
         System.out.println(b2);

         System.out.println();
         System.out.println("addAll() Method");
         System.out.println("Combined arrary list of b1 and b2");
         b1.addAll(b2);
         System.out.println("Combined ArrayList:"+b1);

         System.out.println();
         System.out.println("containAll() Method");
         System.out.println("b1 contain all elements of b2 :"+b1.containsAll(b2));
         System.out.println("b1 contain all elements of b2 :"+b2.containsAll(b1));

         System.out.println();
         System.out.println("RetainAll() Method");
         b1.retainAll(b2);
         System.out.println(b1);
         System.out.println(b2);

         System.out.println();
         b1.add(55);
         b1.add(75);
         System.out.println("removAll() Method");
         b1.removeAll(b2);
         System.out.println(b1);
         System.out.println(b2);

         System.out.println();
         System.out.println("ClearAll() Method");
         b2.clear();
         System.out.println(b2);
         System.out.println(b1);

         b1.add(22);
         b1.add(46);
         b1.add(90);
         System.out.println();
         System.out.println("RemoveIf() Method");
         b1.removeIf(n->n%2==0);
         System.out.println(b1);
     
        
        }
    
   
    
}
