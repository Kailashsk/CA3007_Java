/* Define a class called Time with attributes hour, minute and second along 
with methods like get_time() and show_time() to input and display the time 
respectively. Also define a method add_time() which takes two time 
objects as input and returns a time object. Display the added time in terms 
of hour, minute and second using the same show_time().  */

//add_time is not added in main function .....





import java.util.Scanner;

class Time{
    int hour,minute,second;

    void get_time()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter hours");
        hour=sc.nextInt();
        System.out.println("Enter minute");
        minute=sc.nextInt();
        System.out.println("Enter Second");
        second=sc.nextInt();
    }

    void show_time()
    {
        System.out.println(hour+":"+minute+":"+second);
    }

    public static Time add_time(Time t1,Time t2)
    {
       Time sum=new Time();
       sum.hour=t1.hour+t2.hour;
       sum.minute=t1.minute+t2.minute;
       sum.second=t1.second+t2.second;
       return sum;
    }
}


public class a63 {
    public static void main(String[] args) {
        Time t=new Time();
        t.get_time();
        t.show_time();
       
    }
    
}
