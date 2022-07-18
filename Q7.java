/*. Write a menu driven program in java to perform the operations like add, 
subtract and multiply two complex numbers. Use constructor overloading 
to initialize the data members real and imaginary of the class Complex. 
(one default and another parameterized constructor). Also define and use 
the appropriate methods for usual activitie.
*/


import java.util.Scanner;

class Complex {
    
    int real,imiginary;

    Complex()
    {

    }

    Complex(int x,int y)
    {
        real=x;
        imiginary=y;
    }

    Complex add(Complex a,Complex b)
    {
        Complex c=new Complex();
        c.real = a.real+b.real;
        c.imiginary=a.imiginary+b.imiginary;
        return c;
    }

    Complex subtract(Complex a,Complex b)
    {
        Complex c=new Complex();
        c.real=a.real+a.real;
        c.imiginary=a.imiginary-b.imiginary;
        return c;
    }

    Complex Multiply(Complex a,Complex b)
    {
        Complex c=new Complex();
        c.real=a.real*b.real;
        c.imiginary=a.imiginary*a.imiginary;
        return c;
    }

    void print()
    {
        System.out.println("Complex Number "+real+" "+imiginary);
    }
}

public class Complex1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Complex Number");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Enter Second Complex Number");
        int c=sc.nextInt();
        int d=sc.nextInt(); 


        Complex x=new Complex(a,b);
        Complex y=new Complex(c,d);

        Complex s=new Complex();


       int ch;  
        do {  
            System.out.println("\n ***Complex Two Number***");  
            System.out.println("1. Add  \n 2. Substract\n 3. Multiply \n 4.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        s=s.add(x, y);
                        s.print();
                        break;  
                    case 2:  
                        s=s.subtract(x, y);
                        s.print();
                        break;  
                    case 3:  
                        s=s.Multiply(x, y);
                        s.print();
                        break;  
                    case 4:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 4);  
  
            

    }
}
