/*
    Multi-threading using 'runnable' interface
 */
package Concurrency;

/**
 *
 * @author Nagarjuna 14
 */
// Thread creation by extending the Thread class
public class MultiThreading implements Runnable{
    // 'synchroonized' makes ...
    public void Print(){
        try{
            for(int i = 5; i >0; i--)
            {
                // Get current thread name
                System.out.println(Thread.currentThread()); 
                System.out.println(i);
                // Stop the thread for 1000 milliseconds
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void run() {
        // Exception Handling is required for 'run' method of thread
        Print();
    }
    
    public static void main(String[] args){
        // Thread creation by implementing 'Runnable' requires 
        // the implementing class to be passed as parameter to 'Thread' class
        MultiThreading mt = new MultiThreading();
        Thread t1 = new Thread(mt, "First Thread");                        // Actual Thread
        
        Thread t2 = new Thread(mt, "Second Thread");
        
        Thread t3 = new Thread(mt, "Third Thread");
        
        // Setting thread priority. High integer = higher priority
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(10);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
