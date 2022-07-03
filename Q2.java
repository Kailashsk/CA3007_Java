/* Write a program in Java to declare a class called Book with data members 
as title, publisher, authors, price and number_of_pages. Define 
member methods (as per your convenience) to input the data from user 
interface for the Book object and display it. Also you need to write a 
method to compare two Book objects and display whether they are the 
same books or different one. (Note: Use method which returns a boolean 
data type and also pass object as parameter to the method for comparing 
two book objects). */




class Book1{
    String title,publisher,author;
    int price,page;
    void input(String title,String publisher,String author, int price,int page)
    {
        this.title=title;
        this.publisher=publisher;
        this.author=author;
        this.page=page;
        this.price=price;
    }

    boolean compare(Book1 obj)
    {
        if((this.title.equals(obj.title)) && (this.publisher.equals(obj.publisher)) && (this.author.equals(obj.author)) && (this.price==obj.price) && (this.page==obj.page))
        {
            return true;
            
        }
        else
        {
            return false;
        }
    }
}


public class book {
    
    public static void main(String[] args) {
        Book1 b1=new Book1();
        b1.input("India", "Dell", "Me", 150, 200);

        Book1 b2=new Book1();
        b2.input("India", "Dell", "Me", 200, 200);

        if(b1.compare(b2))
        {
            System.out.println("Same Book");
        }
        else
        {
            System.out.println("Not same book");
        }
    }
}
