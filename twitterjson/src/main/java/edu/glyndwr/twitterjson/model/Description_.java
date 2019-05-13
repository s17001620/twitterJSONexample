
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description_ implements Serializable
{

    @SerializedName("urls")
    @Expose
    private List<Object> urls = new ArrayList<Object>();
    private final static long serialVersionUID = 2437635176594167700L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Description_() {
    }

    /**
     * 
     * @param urls
     */
    public Description_(List<Object> urls) {
        super();
        this.urls = urls;
    }

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    public Description_ withUrls(List<Object> urls) {
        this.urls = urls;
        return this;
    }

}
