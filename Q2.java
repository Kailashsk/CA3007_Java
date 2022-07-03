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
