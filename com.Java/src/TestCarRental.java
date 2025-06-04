public class TestCarRental {
    public static void main(String[] args){
        CarRenatal cr = new CarRenatal();
        cr.setCarModel("Apache");
        cr.setRentalDays(10);
        cr.setDailyRate(2500);
        System.out.println(cr);
     
        System.out.println("Net Bill Amount: " +cr.calculateTotalCost());
        



    }
    
}
