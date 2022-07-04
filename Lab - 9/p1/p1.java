/*Write an application that executes two threads. One thread displays "Good Morning" 
every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 
milliseconds. Create the threads by implementing the Runnable interface*/
class Thread1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.currentThread().sleep(1000);
            }
            catch(InterruptedException ie ){
                ie.printStackTrace();
            }
        }
    } 
}
class Thread2 implements Runnable{
    @Override
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.currentThread().sleep(3000);
            }
            catch(InterruptedException ie ){
                ie.printStackTrace();
            }
        }
    } 
}
public class p1{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread t11 = new Thread(t1);
      
        Thread2 t2 = new Thread2();
        Thread t22 = new Thread(t2);
        
        t11.start(); 
        t22.start();
    }
}