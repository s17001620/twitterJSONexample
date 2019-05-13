
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserMention implements Serializable
{

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("indices")
    @Expose
    private List<Long> indices = new ArrayList<Long>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("screen_name")
    @Expose
    private String screenName;
    private final static long serialVersionUID = 3498937528602785789L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserMention() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param screenName
     * @param indices
     * @param idStr
     */
    public UserMention(Long id, String idStr, List<Long> indices, String name, String screenName) {
        super();
        this.id = id;
        this.idStr = idStr;
        this.indices = indices;
        this.name = name;
        this.screenName = screenName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserMention withId(Long id) {
        this.id = id;
        return this;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public UserMention withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public UserMention withIndices(List<Long> indices) {
        this.indices = indices;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserMention withName(String name) {
        this.name = name;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public UserMention withScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

}
