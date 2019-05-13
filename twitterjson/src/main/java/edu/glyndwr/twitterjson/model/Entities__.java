
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities__ implements Serializable
{

    @SerializedName("hashtags")
    @Expose
    private List<Object> hashtags = new ArrayList<Object>();
    @SerializedName("media")
    @Expose
    private List<Medium> media = new ArrayList<Medium>();
    @SerializedName("symbols")
    @Expose
    private List<Object> symbols = new ArrayList<Object>();
    @SerializedName("urls")
    @Expose
    private List<Object> urls = new ArrayList<Object>();
    @SerializedName("user_mentions")
    @Expose
    private List<UserMention_> userMentions = new ArrayList<UserMention_>();
    private final static long serialVersionUID = 3493177722143945245L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities__() {
    }

    /**
     * 
     * @param symbols
     * @param urls
     * @param hashtags
     * @param media
     * @param userMentions
     */
    public Entities__(List<Object> hashtags, List<Medium> media, List<Object> symbols, List<Object> urls, List<UserMention_> userMentions) {
        super();
        this.hashtags = hashtags;
        this.media = media;
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

    public Entities__ withHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
        return this;
    }

    public List<Medium> getMedia() {
        return media;
    }

    public void setMedia(List<Medium> media) {
        this.media = media;
    }

    public Entities__ withMedia(List<Medium> media) {
        this.media = media;
        return this;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public Entities__ withSymbols(List<Object> symbols) {
        this.symbols = symbols;
        return this;
    }

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    public Entities__ withUrls(List<Object> urls) {
        this.urls = urls;
        return this;
    }

    public List<UserMention_> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<UserMention_> userMentions) {
        this.userMentions = userMentions;
    }

    public Entities__ withUserMentions(List<UserMention_> userMentions) {
        this.userMentions = userMentions;
        return this;
    }

}
