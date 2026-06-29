package learning_threads.inter_thread_communiction;

class Message
{
    boolean isMessage=false;
    public synchronized void receiver()throws InterruptedException
    {
        while(!isMessage)
        {
            System.out.println("Waiting for the message");
            wait();
        }
        System.out.println("message received");
    }
    public synchronized void sender()
    {
        isMessage=true;
        System.out.println("Message sent");
        notify();
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        Message m=new Message();
        Thread t1=new Thread(()->
        {
            try
            {
                m.receiver();
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }

        });
        Thread t2=new Thread(()->
        {
            m.sender();
        });
         t1.start();
         t2.start();

         t1.join();
         t2.join();
    }
}
