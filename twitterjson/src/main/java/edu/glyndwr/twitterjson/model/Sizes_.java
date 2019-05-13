
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes_ implements Serializable
{

    @SerializedName("large")
    @Expose
    private Large_ large;
    @SerializedName("medium")
    @Expose
    private Medium___ medium;
    @SerializedName("small")
    @Expose
    private Small_ small;
    @SerializedName("thumb")
    @Expose
    private Thumb_ thumb;
    private final static long serialVersionUID = -5129652774662409191L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sizes_() {
    }

    /**
     * 
     * @param thumb
     * @param small
     * @param medium
     * @param large
     */
    public Sizes_(Large_ large, Medium___ medium, Small_ small, Thumb_ thumb) {
        super();
        this.large = large;
        this.medium = medium;
        this.small = small;
        this.thumb = thumb;
    }

    public Large_ getLarge() {
        return large;
    }

    public void setLarge(Large_ large) {
        this.large = large;
    }

    public Sizes_ withLarge(Large_ large) {
        this.large = large;
        return this;
    }

    public Medium___ getMedium() {
        return medium;
    }

    public void setMedium(Medium___ medium) {
        this.medium = medium;
    }

    public Sizes_ withMedium(Medium___ medium) {
        this.medium = medium;
        return this;
    }

    public Small_ getSmall() {
        return small;
    }

    public void setSmall(Small_ small) {
        this.small = small;
    }

    public Sizes_ withSmall(Small_ small) {
        this.small = small;
        return this;
    }

    public Thumb_ getThumb() {
        return thumb;
    }

    public void setThumb(Thumb_ thumb) {
        this.thumb = thumb;
    }

    public Sizes_ withThumb(Thumb_ thumb) {
        this.thumb = thumb;
        return this;
    }

}
