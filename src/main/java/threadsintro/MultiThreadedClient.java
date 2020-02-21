package threadsintro;

public class MultiThreadedClient {

  public static void main(String[] args){
    long startTime = System.nanoTime();
    // do stuff here
    // Fetch dto from http://brianparra.com/sfsu/csc413dat.json
    // Fetch dto from http://brianparra.com/sfsu/classDetails.json
    // Optimize, do it at the same time
    // Print all fields
    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Time took : " + timeElapsed);
  }
}
