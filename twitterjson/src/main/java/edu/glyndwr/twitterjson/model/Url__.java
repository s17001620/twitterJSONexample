
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url__ implements Serializable
{

    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("expanded_url")
    @Expose
    private String expandedUrl;
    @SerializedName("indices")
    @Expose
    private List<Long> indices = new ArrayList<Long>();
    @SerializedName("url")
    @Expose
    private String url;
    private final static long serialVersionUID = 6783930119781851410L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Url__() {
    }

    /**
     * 
     * @param displayUrl
     * @param indices
     * @param expandedUrl
     * @param url
     */
    public Url__(String displayUrl, String expandedUrl, List<Long> indices, String url) {
        super();
        this.displayUrl = displayUrl;
        this.expandedUrl = expandedUrl;
        this.indices = indices;
        this.url = url;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public Url__ withDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
        return this;
    }

    public String getExpandedUrl() {
        return expandedUrl;
    }

    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    public Url__ withExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
        return this;
    }

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public Url__ withIndices(List<Long> indices) {
        this.indices = indices;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Url__ withUrl(String url) {
        this.url = url;
        return this;
    }

}
