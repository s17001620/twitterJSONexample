
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Small implements Serializable
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
    private final static long serialVersionUID = -7294705190445436740L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Small() {
    }

    /**
     * 
     * @param w
     * @param resize
     * @param h
     */
    public Small(Long h, String resize, Long w) {
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

    public Small withH(Long h) {
        this.h = h;
        return this;
    }

    public String getResize() {
        return resize;
    }

    public void setResize(String resize) {
        this.resize = resize;
    }

    public Small withResize(String resize) {
        this.resize = resize;
        return this;
    }

    public Long getW() {
        return w;
    }

    public void setW(Long w) {
        this.w = w;
    }

    public Small withW(Long w) {
        this.w = w;
        return this;
    }

}
