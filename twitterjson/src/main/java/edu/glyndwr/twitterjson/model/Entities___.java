
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities___ implements Serializable
{

    @SerializedName("description")
    @Expose
    private Description_ description;
    @SerializedName("url")
    @Expose
    private Url_ url;
    private final static long serialVersionUID = 6038705556129836436L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities___() {
    }

    /**
     * 
     * @param description
     * @param url
     */
    public Entities___(Description_ description, Url_ url) {
        super();
        this.description = description;
        this.url = url;
    }

    public Description_ getDescription() {
        return description;
    }

    public void setDescription(Description_ description) {
        this.description = description;
    }

    public Entities___ withDescription(Description_ description) {
        this.description = description;
        return this;
    }

    public Url_ getUrl() {
        return url;
    }

    public void setUrl(Url_ url) {
        this.url = url;
    }

    public Entities___ withUrl(Url_ url) {
        this.url = url;
        return this;
    }

}
