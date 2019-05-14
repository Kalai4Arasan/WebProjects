class MultithreadingDemo extends Thread { 
public void run() {  System.out.println ("Thread " + Thread.currentThread().getId() + " is running");
} 
} 
public class Demo{
     public static void main(String[] args){
         int n = 8; // Number of threads 
         for (int i=0; i<8; i++) { 
             MultithreadingDemo object = new MultithreadingDemo(); 
             object.start();
            }
        }
    } 
