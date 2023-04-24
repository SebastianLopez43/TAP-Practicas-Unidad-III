package classthread;

/**
 * @author invitado
 */

public class ClassThread {

    public static void main(String[] args) {
        showZeroThread t1 = new showZeroThread();
        t1.start();
        showOneThread t2 = new showOneThread();
        t2.start();
    }
  
}

class showZeroThread extends Thread {
    @Override
    public void run() {
      for (int i = 0; i < 1000; i++) {
        System.out.println("0-");
      }
    }        
}

class showOneThread extends Thread {
    @Override
      public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("1-");
        }
      }
}
