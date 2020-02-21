package threadsintro;

public class SynchronisedDemo {

  static int counter = 0;

  public static void main(String[] args)  {
    Thread threadA = new Thread(new Worker());
    Thread threadB = new Thread(new Worker());

    threadA.start();
    threadB.start();
    // Todo: make it print right number
    System.out.println(counter);
  }

  public static void increment() {
    SynchronisedDemo.counter++;
  }
}

class Worker implements Runnable {

  public void run() {
    for (int i = 0; i < 2000000; i++) {
      SynchronisedDemo.increment();
    }
  }
}