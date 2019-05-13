
package edu.glyndwr.twitterjson.backend;

import com.google.gson.Gson;
import edu.glyndwr.twitterjson.model.Tweet;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alexander Bruckbauer s17001620
 */
public class TweetToJSONListWriter {
public void WriteJSON(Tweet[] tweets, String filepath){
    
  Gson gson = new Gson();
  
  // convert java object to JSON format,
  // and returned as JSON formatted string
  String json;
    json = gson.toJson(tweets);
  
  try {
   //write converted json data to a file 
   FileWriter writer = new FileWriter(filepath);
   writer.write(json);
   writer.close();
     } catch (IOException e) {
   e.printStackTrace();
  }
}
}
