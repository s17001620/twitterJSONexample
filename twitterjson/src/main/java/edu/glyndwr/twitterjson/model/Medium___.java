
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Medium___ implements Serializable
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
    private final static long serialVersionUID = -6489315657639150671L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Medium___() {
    }

    /**
     * 
     * @param w
     * @param resize
     * @param h
     */
    public Medium___(Long h, String resize, Long w) {
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

    public Medium___ withH(Long h) {
        this.h = h;
        return this;
    }

    public String getResize() {
        return resize;
    }

    public void setResize(String resize) {
        this.resize = resize;
    }

    public Medium___ withResize(String resize) {
        this.resize = resize;
        return this;
    }

    public Long getW() {
        return w;
    }

    public void setW(Long w) {
        this.w = w;
    }

    public Medium___ withW(Long w) {
        this.w = w;
        return this;
    }

}
