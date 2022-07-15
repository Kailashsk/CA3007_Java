/*  . Define a class called Time with attributes hour, minute and second along 
with methods like get_time() and show_time() to input and display the time 
respectively. Also define a method add_time() which takes two time 
objects as input and returns a time object. Display the added time in terms 
of hour, minute and second using the same show_time().
*/

import java.util.*;

class Time{
    int hour,minute,second;
    Scanner sc=new Scanner(System.in);

    void get_Time()
    {
        System.out.println("Enter hour");
        hour=sc.nextInt();
        System.out.println("Enter minutes");
        minute=sc.nextInt();
        System.out.println("Enter seconds");
        second=sc.nextInt();
    }

    void show_Time()
    {
        System.out.println(hour+":"+minute+":"+second);
    }

    void add_Time(Time t1,Time t2)
    {
        if((t1.second+t2.second)>=60)
        {
            second=t1.second+t2.second-60;
            t1.minute++;
            minute=t1.minute+t2.minute;
        }
        if(t1.minute+t2.minute>=60)
        {
            minute=t1.minute+t2.minute-60;
            hour=t1.hour+t2.hour;
            hour++;
        }
    }
}


public class time1 {
    public static void main(String[] args) {
        Time t1=new Time();
        t1.get_Time();
        t1.show_Time();

        Time t2=new Time();
        t2.get_Time();
        t2.show_Time();

       // Time t3=new Time();
       // t3.add_Time(t1, t2);
       // t3.show_Time();
    }
}
