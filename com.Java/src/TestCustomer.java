class CustomerTester{
    public static void main(String[] args){
        Customer c = new Customer();
        c.setCustomerName("john Doe");
        c.setMonthlySpending(7000);
        c.displayDetails();
       CardType.getTypes(c);

       System.out.println();

       Customer c2 = new Customer();
        c2.setCustomerName("jane Smith");
        c2.setMonthlySpending(28000);
        c2.displayDetails();
       CardType.getTypes(c2);

       System.out.println();

       Customer c3 = new Customer();
        c3.setCustomerName("AliceBrown");
        c3.setMonthlySpending(120000);
        c3.displayDetails();
       CardType.getTypes(c3);
        


    }
}