 class Q {
    int num;
    public void set(int num){
        System.out.println("Set = " + num);
        this.num = num ; 
    }
    public void get(){
        System.out.println("Get = " + num);
    }
}

class Producer implements Runnable {
    Q obj;

    public Producer(Q obj){
        this.obj = obj;
        Thread t1 = new Thread(this,"Producer");
        t1.start();
    }
    public void run(){
        int i = 0 ; 
        while(true){
            obj.set(i++);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable {
    Q obj;

    public Consumer(Q obj){
        this.obj = obj;
        Thread t1 = new Thread(this,"Consumer");
        t1.start();
    }
    public void run(){
        int i = 0 ; 
        while(true){
            obj.get();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class p1{
    public static void main(String[] args) {
            Q q = new Q();
            new Consumer(q);
            new Producer(q);
    }
}

