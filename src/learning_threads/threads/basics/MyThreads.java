package learning_threads.threads.basics;

public class MyThreads extends Thread{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            try{
                Thread.sleep(1000);
                System.out.println(i+" I am new thread");
            }
            catch(InterruptedException e)
            {
                System.out.println("Interruption occured"+e.getMessage());
            }
        }
    }
}
