package learning_threads;

class MyDaemonThread extends Thread{
    public void run()
    {
        int c=0;
        while(c<5)
        {
            c++;
            System.out.println("hello");
        }
    }
}
public class MyDaemon
{
    public static void main(String args[])throws InterruptedException
    {
        System.out.println("My main thread starts");
        MyDaemonThread t=new MyDaemonThread();
        //t.setDaemon(true);  without this it will print 5 times hello
        //daemon thread is used to execute main thread and only after printing the main thread it will exit from the code
        t.start();

        t.join();//makes main thread to wait until all threads complete their work and then resumes main thread
        System.out.println("Main thread ends");
    }
}