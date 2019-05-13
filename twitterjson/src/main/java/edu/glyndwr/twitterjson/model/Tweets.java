package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class Tweets implements Serializable
{
    @SerializedName("tweets")
    @Expose
    private List<Tweet> tweets = new ArrayList<Tweet>();
    private final static long serialVersionUID = 6461066783156986461L;

    public Tweets() {
    }
}
