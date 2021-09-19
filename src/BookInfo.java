//Create a class Book with the following information.
//        Member variables : name (String), author
//        (of the class Author you have just created), price (double), and qtyInStock (int)
//        [Assumption: Each book will be written by exactly one Author]
//        Parameterized Constructor: To initialize the variables
//        Getter methods  for all the member variables
class Book{
    String author;
    String name;
    double price;
    int qtyIntStock;

    public Book(String name,String author,double price, int qtyIntStock) {
        this.name = name;
        this.author=author;
        this.price = price;
        this.qtyIntStock = qtyIntStock;
    }
    }

public class BookInfo {
    public static void main(String[] args) {
        Book obj=new Book("C++","Denni's Richi",455,56);
        System.out.println("Name of the book is :"+obj.name);
        System.out.println("The Author is :"+obj.author);
        System.out.println("Price of the book is:"+obj.price);
    }
}
