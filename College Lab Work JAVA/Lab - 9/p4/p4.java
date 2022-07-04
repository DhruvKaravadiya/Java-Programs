/*It is required to have total two threads, both capable of acting as a produce as well as 
a consumer. If first thread acts as a producer then, the second thread becomes the 
consumer and vice-versa. They communicate with each other through a buffer, storing 
one integer number. One of the threads initiates the communication by sending 1 to 
the other thread. The second thread, on receiving 1 sends 2 to the first thread. On 
receiving 2, the first thread sends three integer numbers, one by one to the second 
thread. The second thread consumes the numbers by displaying them. Both threads 
terminate after that. Note that both threads must be capable of initiating the 
communication. Write complete multi-threaded program to meet above requirements.*/
class Consumer implements Runnable{
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
}
class Producer implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

}
public class p4{
    public static void main(String[] args) {
        
    }
}