
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
    public static void main(String[] args) {
        JSONToTweetListParser parser = new JSONToTweetListParser();
        TweetToJSONListWriter writer = new TweetToJSONListWriter();
        ArrayList<Tweet> tweets = new ArrayList<>();
        tweets.addAll(Arrays.asList(parser.loadJSONForTweets()));
        tweets.forEach((tweet) -> {
            System.out.println(tweet.getText());
        });
        Calendar cla = Calendar.getInstance();
        Tweet newtweet = new Tweet();
        newtweet.setCreatedAt(cla.getTime().toString());
        newtweet.setText("NEW TWEET TO WRITE");
        tweets.add(newtweet);
        Tweet[] tweetsToSave = tweets.toArray(new Tweet[tweets.size()]);
        writer.WriteJSON(tweetsToSave );
        tweets = new ArrayList<>();
        tweets.addAll(Arrays.asList(parser.loadJSONForTweets()));
        tweets.forEach((tweet) -> {
            System.out.println(tweet.getText());
        });
    }
}
