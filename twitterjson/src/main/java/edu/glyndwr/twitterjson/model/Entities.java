
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities implements Serializable
{

    @SerializedName("hashtags")
    @Expose
    private List<Object> hashtags = new ArrayList<Object>();
    @SerializedName("symbols")
    @Expose
    private List<Object> symbols = new ArrayList<Object>();
    @SerializedName("urls")
    @Expose
    private List<Url> urls = new ArrayList<Url>();
    @SerializedName("user_mentions")
    @Expose
    private List<UserMention> userMentions = new ArrayList<UserMention>();
    private final static long serialVersionUID = -6527504753608313669L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities() {
    }

    /**
     * 
     * @param symbols
     * @param urls
     * @param hashtags
     * @param userMentions
     */
    public Entities(List<Object> hashtags, List<Object> symbols, List<Url> urls, List<UserMention> userMentions) {
        super();
        this.hashtags = hashtags;
        this.symbols = symbols;
        this.urls = urls;
        this.userMentions = userMentions;
    }

    public List<Object> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    public Entities withHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
        return this;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public Entities withSymbols(List<Object> symbols) {
        this.symbols = symbols;
        return this;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public Entities withUrls(List<Url> urls) {
        this.urls = urls;
        return this;
    }

    public List<UserMention> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
    }

    public Entities withUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
        return this;
    }

}
