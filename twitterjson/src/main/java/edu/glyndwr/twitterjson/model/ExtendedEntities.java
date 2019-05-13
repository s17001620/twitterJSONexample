
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtendedEntities implements Serializable
{

    @SerializedName("media")
    @Expose
    private List<Medium__> media = new ArrayList<Medium__>();
    private final static long serialVersionUID = -2607603934582642181L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtendedEntities() {
    }

    /**
     * 
     * @param media
     */
    public ExtendedEntities(List<Medium__> media) {
        super();
        this.media = media;
    }

    public List<Medium__> getMedia() {
        return media;
    }

    public void setMedia(List<Medium__> media) {
        this.media = media;
    }

    public ExtendedEntities withMedia(List<Medium__> media) {
        this.media = media;
        return this;
    }

}
