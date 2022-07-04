/*Write a program to create two threads, one thread will print odd numbers and second 
thread will print even numbers between 1 to 20 numbers.*/
class MyThread implements Runnable{
    String sname;
    MyThread(String threadName){
        this.sname = threadName;
    }
    @Override
   synchronized public void run(){
        for(int i =  1 ; i <= 20 ; i++){
            if(i%2!=0 && sname.equalsIgnoreCase("Odd Thread")){
                Thread.currentThread().setName(sname);                
                try{
                System.out.println(sname+"---"+i);
                // Thread.currentThread().sleep(1000);
               }
               catch(Exception ie){
                ie.printStackTrace();
               }
            }
            else if(i%2==0 && sname.equalsIgnoreCase("Even Thread")){
                Thread.currentThread().setName(sname);                
                try{
                 System.out.println(sname+"---"+i);
                //  Thread.currentThread().sleep(1000);
                }
                catch(Exception ie){
                 ie.printStackTrace();
                }
             }
        }
    }
}

public class p2{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Odd Thread");
        MyThread t2 = new MyThread("Even Thread");
        Thread t11 = new Thread(t1);
        Thread t22 = new Thread(t2);
        t11.start(); 
        t22.start();
    }
}