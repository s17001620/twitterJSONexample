
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Medium__ implements Serializable
{

    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("expanded_url")
    @Expose
    private String expandedUrl;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("indices")
    @Expose
    private List<Long> indices = new ArrayList<Long>();
    @SerializedName("media_url")
    @Expose
    private String mediaUrl;
    @SerializedName("media_url_https")
    @Expose
    private String mediaUrlHttps;
    @SerializedName("sizes")
    @Expose
    private Sizes_ sizes;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;
    private final static long serialVersionUID = 9220481937131720472L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Medium__() {
    }

    /**
     * 
     * @param sizes
     * @param id
     * @param displayUrl
     * @param mediaUrl
     * @param indices
     * @param type
     * @param expandedUrl
     * @param url
     * @param mediaUrlHttps
     * @param idStr
     */
    public Medium__(String displayUrl, String expandedUrl, Long id, String idStr, List<Long> indices, String mediaUrl, String mediaUrlHttps, Sizes_ sizes, String type, String url) {
        super();
        this.displayUrl = displayUrl;
        this.expandedUrl = expandedUrl;
        this.id = id;
        this.idStr = idStr;
        this.indices = indices;
        this.mediaUrl = mediaUrl;
        this.mediaUrlHttps = mediaUrlHttps;
        this.sizes = sizes;
        this.type = type;
        this.url = url;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public Medium__ withDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
        return this;
    }

    public String getExpandedUrl() {
        return expandedUrl;
    }

    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    public Medium__ withExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medium__ withId(Long id) {
        this.id = id;
        return this;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public Medium__ withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public Medium__ withIndices(List<Long> indices) {
        this.indices = indices;
        return this;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public Medium__ withMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    public String getMediaUrlHttps() {
        return mediaUrlHttps;
    }

    public void setMediaUrlHttps(String mediaUrlHttps) {
        this.mediaUrlHttps = mediaUrlHttps;
    }

    public Medium__ withMediaUrlHttps(String mediaUrlHttps) {
        this.mediaUrlHttps = mediaUrlHttps;
        return this;
    }

    public Sizes_ getSizes() {
        return sizes;
    }

    public void setSizes(Sizes_ sizes) {
        this.sizes = sizes;
    }

    public Medium__ withSizes(Sizes_ sizes) {
        this.sizes = sizes;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Medium__ withType(String type) {
        this.type = type;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Medium__ withUrl(String url) {
        this.url = url;
        return this;
    }

}
