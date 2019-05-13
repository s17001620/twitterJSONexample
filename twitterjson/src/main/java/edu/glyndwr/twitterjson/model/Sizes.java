
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes implements Serializable
{

    @SerializedName("large")
    @Expose
    private Large large;
    @SerializedName("medium")
    @Expose
    private Medium_ medium;
    @SerializedName("small")
    @Expose
    private Small small;
    @SerializedName("thumb")
    @Expose
    private Thumb thumb;
    private final static long serialVersionUID = 4654097604309289783L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes() {
    }

    /**
     * 
     * @param thumb
     * @param small
     * @param medium
     * @param large
     */
    public Sizes(Large large, Medium_ medium, Small small, Thumb thumb) {
        super();
        this.large = large;
        this.medium = medium;
        this.small = small;
        this.thumb = thumb;
    }

    public Large getLarge() {
        return large;
    }

    public void setLarge(Large large) {
        this.large = large;
    }

    public Sizes withLarge(Large large) {
        this.large = large;
        return this;
    }

    public Medium_ getMedium() {
        return medium;
    }

    public void setMedium(Medium_ medium) {
        this.medium = medium;
    }

    public Sizes withMedium(Medium_ medium) {
        this.medium = medium;
        return this;
    }

    public Small getSmall() {
        return small;
    }

    public void setSmall(Small small) {
        this.small = small;
    }

    public Sizes withSmall(Small small) {
        this.small = small;
        return this;
    }

    public Thumb getThumb() {
        return thumb;
    }

    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    public Sizes withThumb(Thumb thumb) {
        this.thumb = thumb;
        return this;
    }

}
