
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Large implements Serializable
{

    @SerializedName("h")
    @Expose
    private Long h;
    @SerializedName("resize")
    @Expose
    private String resize;
    @SerializedName("w")
    @Expose
    private Long w;
    private final static long serialVersionUID = 7594547217565895522L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Large() {
    }

    /**
     * 
     * @param w
     * @param resize
     * @param h
     */
    public Large(Long h, String resize, Long w) {
        super();
        this.h = h;
        this.resize = resize;
        this.w = w;
    }

    public Long getH() {
        return h;
    }

    public void setH(Long h) {
        this.h = h;
    }

    public Large withH(Long h) {
        this.h = h;
        return this;
    }

    public String getResize() {
        return resize;
    }

    public void setResize(String resize) {
        this.resize = resize;
    }

    public Large withResize(String resize) {
        this.resize = resize;
        return this;
    }

    public Long getW() {
        return w;
    }

    public void setW(Long w) {
        this.w = w;
    }

    public Large withW(Long w) {
        this.w = w;
        return this;
    }

}
