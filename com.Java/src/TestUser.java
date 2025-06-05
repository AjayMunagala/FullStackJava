public class TestUser {
    public static void main(String[] args){
        User u1 = new User();
        u1.setUsername("Ajay");
        u1.setPurchaseAmount(150);
        u1.setMemberShipStatus("Silver");
        u1.displayDiscount();
        Discount dd2 =  Discount.getDiscount(u1);
        u1.applyDiscount(dd2);


        



    }
    
}
