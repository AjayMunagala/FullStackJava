/*
 * You are tasked with creating a Book class for a library system. The class should have the following attributes:

class name: Book (BLC)

private: title (String)
private: author (String)
private: ISBN (String)
private: price (double)
private: discountPercentage (double) - the percentage of discount applied to the book.
You cannot use constructors for initialization, and you must provide setter methods to initialize the attributes and getter methods to retrieve the values.

Additionally, implement a method to calculate the final price of the book after applying the discount.

Implement below methods:

Implement public setter methods to initialize each of these attributes.
Implement public getter methods to retrieve the values of these attributes.

Add a method getFinalPrice() that calculates and returns the price of the book after applying the discount:
method name: getFinalPrice()
return type: double
modifier: public
Logic:
finalPrice = price - (price * discountPercentage / 100)

Create an ELC class BookTester,
Write a main method where you:
Create an instance of the Book class.
Use the setter methods to initialize the attributes of the book.
Calculate the final price using the getFinalPrice() method.
Print the details of the book, including the final price.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private double price;
    private double discountPercentage;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
   public double getFinalPrice(){
    double finalPrice = price - (price * discountPercentage / 100);
    return finalPrice;
   }
    
}
class BookTester{
    public static void main(String[] args){
        Book b1 = new Book();
        b1.setTitle("Attitute is EveryThing");
        b1.setAuthor("Jeff Keller");
        b1.setISBN("1234567890987");
        b1.setPrice(200); 
        b1.setDiscountPercentage(10.0);       
        
        System.out.println("Title of the book is      :"+b1.getTitle());
        System.out.println("Author of the book is     :"+b1.getAuthor());
        System.out.println("ISBN of the book is       :"+b1.getISBN());
        System.out.println("Price of the book is      :"+b1.getPrice());
        System.out.println("Dicount of the book is    :"+b1.getDiscountPercentage());
        System.out.println("FinalPrice of the book is :"+b1.getFinalPrice());

   }
}
