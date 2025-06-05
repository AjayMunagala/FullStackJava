/*
Membership Benefits Based on Customer Spending with Discount Application:
You are tasked with creating a system to determine discounts for products based on the total purchase amount and membership status of a user. The system involves two classes: User and Discount.

Classes:
class User (BLC):

Attributes (all are private):
userName (String) - The name of the user.
purchaseAmount (double) - The total amount spent by the user on a purchase.
membershipStatus (String) - The membership status of the user ("Regular", "Silver", "Gold").

Methods:
setUserName(String name): void - Sets the user's name.
setPurchaseAmount(double amount): void - Sets the total purchase amount.
setMembershipStatus(String status): void - Sets the membership status.
getUserName(): String - Returns the user's name.
getPurchaseAmount(): double - Returns the total purchase amount.
getMembershipStatus(): String - Returns the membership status.

displayDiscount(): void - Displays the user's name, purchase amount.

applyDiscount(Discount discount) - Calculates and prints the final price and discount  %, after applying the discount.

class Discount (BLC):

Attributes (all are private):
discountPercentage (double) - The percentage of discount applied.

Methods:
getDiscountPercentage() - Returns the discount percentage.
getDiscount(User user) - A static method that takes a User object as a parameter and returns a Discount object. This method should initialize the discountPercentage attribute based on the user's purchaseAmount and membershipStatus.
Logic:
If the user’s membership status is "Regular":
If the purchase amount is less than 100, set the discount percentage to 5.0%.
If the purchase amount is between 100 and 500 (inclusive), set the discount percentage to 10.0%.
If the purchase amount is greater than 500, set the discount percentage to 15.0%.

If the user’s membership status is "Silver":
If the purchase amount is less than 100, set the discount percentage to 10.0%.
If the purchase amount is between 100 and 500 (inclusive), set the discount percentage to 15.0%.
If the purchase amount is greater than 500, set the discount percentage to 20.0%.

If the user’s membership status is "Gold":
If the purchase amount is less than 100, set the discount percentage to 15.0%.
If the purchase amount is between 100 and 500 (inclusive), set the discount percentage to 20.0%.
If the purchase amount is greater than 500, set the discount percentage to 25.0%.

Create an ELC class UserTest:
In Main Method:

Create an instance of the User class.
Set the user's name, purchase amount, and membership status using setter methods.
Call the displayDiscount() method to display the user's details along with the calculated discount.
Call the getDiscount(User user) method to get the Discount object with discountPercentage, by passing User object.
Call the applyDiscount(Discount) method to display the final price after applying the discount.

Example Ouput:
User 1: Name: "Alice", Purchase Amount: 150, Membership Status: "Silver"
Discount: 15%
Final Price: 127.50

User 2: Name: "Bob", Purchase Amount: 600, Membership Status: "Gold"
Discount: 25
Final Price: 450.00

User 3: Name: "Charlie", Purchase Amount: $80, Membership Status: "Regular"
Discount: 5%
Final Price: 76.00
        

 */
public class User {
private String username;
private double purchaseAmount;
private String memberShipStatus;
double discountapplied;
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
public double getPurchaseAmount() {
    return purchaseAmount;
}
public void setPurchaseAmount(double purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
}
public String getMemberShipStatus() {
    return memberShipStatus;
}
public void setMemberShipStatus(String memberShipStatus) {
    this.memberShipStatus = memberShipStatus;
}

public void displayDiscount(){
    System.out.println("Name :"+getUsername());
    System.out.println("Purchase Amount :"+getPurchaseAmount());
    System.out.println("Member Ship status"+getMemberShipStatus());
        }
public void applyDiscount(Discount discount){
   
    discountapplied = purchaseAmount*discount.getDiscountPercentage()/100;
    double finalAmount = purchaseAmount - discountapplied;
    System.out.println("total Amount is :"+getPurchaseAmount());
    System.out.println("Net Amunt to be payed:"+ finalAmount);

    
}


}