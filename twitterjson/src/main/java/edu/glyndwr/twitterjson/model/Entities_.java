
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities_ implements Serializable
{

    @SerializedName("description")
    @Expose
    private Description description;
    private final static long serialVersionUID = 7467790323845161273L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities_() {
    }

    /**
     * 
     * @param description
     */
    public Entities_(Description description) {
        super();
        this.description = description;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Entities_ withDescription(Description description) {
        this.description = description;
        return this;
    }

}
