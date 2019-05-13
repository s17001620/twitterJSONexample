
package edu.glyndwr.twitterjson;

import edu.glyndwr.twitterjson.backend.JSONToTweetListParser;
import edu.glyndwr.twitterjson.backend.TweetToJSONListWriter;
import edu.glyndwr.twitterjson.model.Tweet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author Alexander Bruckbauer s17001620
 */

public class TwitterJSONClient {
    //set your JSON FILE PATH
    public static final String FILEPATH = "C:\\tweets.json";
    
    public static void main(String[] args) {
        
        //initialize the parser and writer
        JSONToTweetListParser parser = new JSONToTweetListParser();
        TweetToJSONListWriter writer = new TweetToJSONListWriter();
        //load the tweets
        ArrayList<Tweet> tweets = new ArrayList<>();
        tweets.addAll(Arrays.asList(parser.loadJSONForTweets(FILEPATH)));
        //Display all tweets
        tweets.forEach((tweet) -> {
            System.out.println(tweet.getText());
        });
        //create new tweet
        Calendar cla = Calendar.getInstance();
        Tweet newtweet = new Tweet();
        newtweet.setCreatedAt(cla.getTime().toString());
        newtweet.setText("NEW TWEET TO WRITE");
        tweets.add(newtweet);
        //write the tweet list to file
        Tweet[] tweetsToSave = tweets.toArray(new Tweet[tweets.size()]);
        writer.WriteJSON(tweetsToSave,FILEPATH);
        //reload the written file
        tweets = new ArrayList<>();
        tweets.addAll(Arrays.asList(parser.loadJSONForTweets(FILEPATH)));
        //display tweets
        tweets.forEach((tweet) -> {
            System.out.println(tweet.getText());
        });
    }
}
