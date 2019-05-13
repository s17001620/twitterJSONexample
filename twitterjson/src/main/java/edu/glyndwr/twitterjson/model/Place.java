
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Place implements Serializable
{

    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("bounding_box")
    @Expose
    private BoundingBox boundingBox;
    @SerializedName("contained_within")
    @Expose
    private List<Object> containedWithin = new ArrayList<Object>();
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("place_type")
    @Expose
    private String placeType;
    @SerializedName("url")
    @Expose
    private String url;
    private final static long serialVersionUID = 1375362343027724590L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Place() {
    }

    /**
     * 
     * @param id
     * @param boundingBox
     * @param containedWithin
     * @param name
     * @param countryCode
     * @param fullName
     * @param attributes
     * @param placeType
     * @param url
     * @param country
     */
    public Place(Attributes attributes, BoundingBox boundingBox, List<Object> containedWithin, String country, String countryCode, String fullName, String id, String name, String placeType, String url) {
        super();
        this.attributes = attributes;
        this.boundingBox = boundingBox;
        this.containedWithin = containedWithin;
        this.country = country;
        this.countryCode = countryCode;
        this.fullName = fullName;
        this.id = id;
        this.name = name;
        this.placeType = placeType;
        this.url = url;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Place withAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public Place withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public List<Object> getContainedWithin() {
        return containedWithin;
    }

    public void setContainedWithin(List<Object> containedWithin) {
        this.containedWithin = containedWithin;
    }

    public Place withContainedWithin(List<Object> containedWithin) {
        this.containedWithin = containedWithin;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Place withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Place withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Place withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Place withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place withName(String name) {
        this.name = name;
        return this;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public Place withPlaceType(String placeType) {
        this.placeType = placeType;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Place withUrl(String url) {
        this.url = url;
        return this;
    }

}
