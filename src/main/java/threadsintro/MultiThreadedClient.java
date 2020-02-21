package threadsintro;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class MultiThreadedClient {

  public static void main(String[] args) throws IOException {
    long startTime = System.nanoTime();
    // do stuff here
    // Fetch dto from http://brianparra.com/sfsu/csc413dat.json
    // Fetch dto from http://brianparra.com/sfsu/classDetails.json
    // Optimize, do it at the same time
    // Print all fields

    OkHttpClient okHttpClient = new OkHttpClient();
    Request request = new Request.Builder()
            .url("http://brianparra.com/sfsu/csc413dat.json")
            .build();
    Response response = okHttpClient.newCall(request).execute();
    Gson gson = new Gson();
    String output = response.body().string();
    Sfsu413Dto dto = gson.fromJson(output, Sfsu413Dto.class);

    System.out.println("School is: " + dto.school);

    System.out.println("Department is: " + dto.department);
    System.out.println("Topics are: " + dto.topics);

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Time took : " + timeElapsed);
  }
}
