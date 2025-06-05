public class Discount {
    private double discountPercentage;

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public static Discount getDiscount(User user){
          Discount d1 =new Discount();
          if(user.getMemberShipStatus()=="Regular"){
            if(user.getPurchaseAmount()<=100){
                d1.setDiscountPercentage(5.0);
            }else if(user.getPurchaseAmount()>=100 && user.getPurchaseAmount()<=500){
                d1.setDiscountPercentage(10.0);
            }else if(user.getPurchaseAmount()>500){
                d1.setDiscountPercentage(25.0);
            }else {
                System.out.println("Error");
            }

          }else if(user.getMemberShipStatus()=="Silver"){
            if(user.getPurchaseAmount()<=100){
                d1.setDiscountPercentage(10.0);
            }else if(user.getPurchaseAmount()>=100 && user.getPurchaseAmount()<=500){
                d1.setDiscountPercentage(15.0);
            }else if(user.getPurchaseAmount()>500){
                d1.setDiscountPercentage(20.0);
            }else {
                System.out.println("Error");
            }

          }else if(user.getMemberShipStatus()=="Gold"){
            if(user.getPurchaseAmount()<=100){
                d1.setDiscountPercentage(15.0);
            }else if(user.getPurchaseAmount()>=100 && user.getPurchaseAmount()<=500){
                d1.setDiscountPercentage(20.0);
            }else if(user.getPurchaseAmount()>500){
                d1.setDiscountPercentage(25.0);
            }else {
                System.out.println("Error");
            }

          }else {
            System.out.println("Give the correct MemberShipDetails Please!!!");
          }
          System.out.println("Discount Percentage is :"+d1.getDiscountPercentage()+"%");
          return d1;
}
}
//mainMethod user test class
