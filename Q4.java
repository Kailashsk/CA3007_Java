/*Create a class Rectangle with two attributes length and width, each of 
which is initialized to 0.There are methods to calculate perimeter and area 
of the rectangle. It has get() ad set() for both the attributes, however the 
set() should verify that the length and width are greater than 0 and less than 
20  */





import java.util.Scanner;

class Rectangle{

    int length,width;

    void setlength(int length)
    {
        if(length>0 && length<20)
        {
       // System.out.println("Input the length ");
        }
        this.length=length;
    }

    void setwidth(int width)
    {
        if(width>0 && width<20)
        {
       // System.out.println("Input the Width");
        }
        this.width=width;
    }

    public int getlength()
    {
        return length;
    }

    public int getwidth()
    {
        return width;
    }

    public int perimeter()
    {
        return (length+width)*2;
    }

    public int area()
    {
        return length*width;
    }

}



public class a64 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length & width");

        int len=sc.nextInt();
        int wid=sc.nextInt();

        Rectangle re=new Rectangle();

        re.setlength(len);
        re.setwidth(wid);

        System.out.println("Perimeter"+re.perimeter()+" "+"Area"+re.area());
        
        
    }
}
