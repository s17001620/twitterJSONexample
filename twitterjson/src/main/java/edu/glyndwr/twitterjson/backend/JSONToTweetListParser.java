
package edu.glyndwr.twitterjson.backend;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.glyndwr.twitterjson.model.Tweet;
import edu.glyndwr.twitterjson.model.Tweets;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.extern.java.Log;

/**
 *
 * @author Alexander Bruckbauer s17001620
 */
@Log
public class JSONToTweetListParser {
    

      public Tweet[]  loadJSONForTweets(){
            String json = null;  
          try {
                 json =  new String(Files.readAllBytes(Paths.get("C:\\tweets.json")));
              } catch (IOException ex) {
                  Logger.getLogger(JSONToTweetListParser.class.getName()).log(Level.SEVERE, null, ex);
              }
         
      
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        Tweet[] tweets = gson.fromJson(json, Tweet[].class);
       
        return tweets;
    }
    
}
