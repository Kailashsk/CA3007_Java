/*Define a class Fruit having instance variable name, colour and taste. Use 
constructor to initialize the members if provided at the time of object 
creation as parameter otherwise the default name is banana, colour is 
yellow and taste is sweet. Define a separate class to create objects of Fruit 
class and display the attributes. 
*/



class Fruit{
    String name,colour,taste;

    Fruit()
    {
        name="Banana";
        colour="yellow";
        taste="sweet";
    }

    Fruit(String s1,String s2,String s3)
    {
        name=s1;
        colour=s2;
        taste=s3;
    }

    void display()
    {
        System.out.println("Name :"+ name);
        System.out.println("Colour :"+ colour);
        System.out.println("Taste :"+ taste);
    }
}

public class Fru {
    
    public static void main(String[] args) {
        
        Fruit f=new Fruit();
        Fruit f1=new Fruit("Apple", "Red", "Sweet");
        f.display();
        f1.display();
    }
}
