class FindMax{
  public void findmax(int... a){
    int x = 0;
    int y = 0;
    for(int i =0; i<a.length; i++){
       if(a[i] > x)
       {
        x = a[i];                                   
       }
                   
            }      
            System.out.println("Max Value in the list is: "+x);
    //using for each  loop
    for(int i : a){
      if(i > y){
        y = i;
      }
    }
    System.out.println("Maxium value in the list is :"+y);

  }
  public static void main(String[] args){
    FindMax fm = new FindMax();
    fm.findmax(10,20,30,50,90,80,70);
  }
}