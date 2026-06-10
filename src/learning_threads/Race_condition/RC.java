package learning_threads.Race_condition;
/*
class Myrace{
    int count;

    public synchronized void increment() {
        count++;
    }
}
public class RC
{
    public static void main(String args[]) throws InterruptedException {
        Myrace r = new Myrace();
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 1000; i++) {
                r.increment();
            }
        });
        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 1000; i++) {
                r.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
*/
import java.util.*;
class BS
{
    int seats=2;
    synchronized void book(String name)
    {
        if(seats>0)
        {
            System.out.println("Booked successfully by "+name);
            seats--;
        }
        else {
            System.out.println("No seats available");
        }
    }
}

class BookSystem
{
    public static void main(String args[])throws InterruptedException
    {
        Scanner sc=new Scanner (System.in);
        String name=sc.next();
        BS s=new BS();

        Thread t1=new Thread(()->
        {
            for(int i=0;i<=3;i++) {
                s.book(name);
            }
        });
        Thread t2=new Thread(()->
        {
           s.book(name);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();



    }
}