
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description implements Serializable
{

    @SerializedName("urls")
    @Expose
    private List<Object> urls = new ArrayList<Object>();
    private final static long serialVersionUID = 1233241497458371730L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Description() {
    }

    /**
     * 
     * @param urls
     */
    public Description(List<Object> urls) {
        super();
        this.urls = urls;
    }

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    public Description withUrls(List<Object> urls) {
        this.urls = urls;
        return this;
    }

}
