
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoundingBox implements Serializable
{

    @SerializedName("coordinates")
    @Expose
    private List<List<List<Double>>> coordinates = new ArrayList<List<List<Double>>>();
    @SerializedName("type")
    @Expose
    private String type;
    private final static long serialVersionUID = -8805711171069183079L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BoundingBox() {
    }

    /**
     * 
     * @param type
     * @param coordinates
     */
    public BoundingBox(List<List<List<Double>>> coordinates, String type) {
        super();
        this.coordinates = coordinates;
        this.type = type;
    }

    public List<List<List<Double>>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<List<Double>>> coordinates) {
        this.coordinates = coordinates;
    }

    public BoundingBox withCoordinates(List<List<List<Double>>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BoundingBox withType(String type) {
        this.type = type;
        return this;
    }

}
