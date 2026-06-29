package learning_threads.threads.basics;

public class Main {
    //checking whether the main is thread or not
    public static void main(String args[]) throws InterruptedException
    {
        System.out.println(Thread.currentThread().getName()); //prints main

        System.out.println("Creation of thread");
        MyThreads t=new MyThreads();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        for(int i=1;i<=3;i++)
        {
            t.join(); //waits till the mythreads executes and then start executing
            try{
                Thread.sleep(1000);
                System.out.println(i+" i am");
            }
            catch(InterruptedException e)
            {
                System.out.println("Interruption occured");
            }
        }
    }
}
