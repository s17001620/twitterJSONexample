
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url_ implements Serializable
{

    @SerializedName("urls")
    @Expose
    private List<Url__> urls = new ArrayList<Url__>();
    private final static long serialVersionUID = -1985290632947886423L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Url_() {
    }

    /**
     * 
     * @param urls
     */
    public Url_(List<Url__> urls) {
        super();
        this.urls = urls;
    }

    public List<Url__> getUrls() {
        return urls;
    }

    public void setUrls(List<Url__> urls) {
        this.urls = urls;
    }

    public Url_ withUrls(List<Url__> urls) {
        this.urls = urls;
        return this;
    }

}
