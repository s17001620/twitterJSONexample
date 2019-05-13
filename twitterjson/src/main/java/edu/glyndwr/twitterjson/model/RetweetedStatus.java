
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetweetedStatus implements Serializable
{

    @SerializedName("contributors")
    @Expose
    private Object contributors;
    @SerializedName("coordinates")
    @Expose
    private Object coordinates;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("entities")
    @Expose
    private Entities__ entities;
    @SerializedName("extended_entities")
    @Expose
    private ExtendedEntities extendedEntities;
    @SerializedName("favorite_count")
    @Expose
    private Long favoriteCount;
    @SerializedName("favorited")
    @Expose
    private Boolean favorited;
    @SerializedName("geo")
    @Expose
    private Object geo;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    private Object inReplyToScreenName;
    @SerializedName("in_reply_to_status_id")
    @Expose
    private Object inReplyToStatusId;
    @SerializedName("in_reply_to_status_id_str")
    @Expose
    private Object inReplyToStatusIdStr;
    @SerializedName("in_reply_to_user_id")
    @Expose
    private Object inReplyToUserId;
    @SerializedName("in_reply_to_user_id_str")
    @Expose
    private Object inReplyToUserIdStr;
    @SerializedName("is_quote_status")
    @Expose
    private Boolean isQuoteStatus;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("place")
    @Expose
    private Place place;
    @SerializedName("possibly_sensitive")
    @Expose
    private Boolean possiblySensitive;
    @SerializedName("retweet_count")
    @Expose
    private Long retweetCount;
    @SerializedName("retweeted")
    @Expose
    private Boolean retweeted;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("truncated")
    @Expose
    private Boolean truncated;
    @SerializedName("user")
    @Expose
    private User_ user;
    private final static long serialVersionUID = 3615008382697028887L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RetweetedStatus() {
    }

    /**
     * 
     * @param text
     * @param contributors
     * @param geo
     * @param retweeted
     * @param inReplyToUserIdStr
     * @param retweetCount
     * @param extendedEntities
     * @param inReplyToScreenName
     * @param truncated
     * @param lang
     * @param entities
     * @param possiblySensitive
     * @param idStr
     * @param id
     * @param inReplyToStatusId
     * @param source
     * @param favoriteCount
     * @param inReplyToStatusIdStr
     * @param favorited
     * @param createdAt
     * @param inReplyToUserId
     * @param place
     * @param user
     * @param coordinates
     * @param isQuoteStatus
     */
    public RetweetedStatus(Object contributors, Object coordinates, String createdAt, Entities__ entities, ExtendedEntities extendedEntities, Long favoriteCount, Boolean favorited, Object geo, Long id, String idStr, Object inReplyToScreenName, Object inReplyToStatusId, Object inReplyToStatusIdStr, Object inReplyToUserId, Object inReplyToUserIdStr, Boolean isQuoteStatus, String lang, Place place, Boolean possiblySensitive, Long retweetCount, Boolean retweeted, String source, String text, Boolean truncated, User_ user) {
        super();
        this.contributors = contributors;
        this.coordinates = coordinates;
        this.createdAt = createdAt;
        this.entities = entities;
        this.extendedEntities = extendedEntities;
        this.favoriteCount = favoriteCount;
        this.favorited = favorited;
        this.geo = geo;
        this.id = id;
        this.idStr = idStr;
        this.inReplyToScreenName = inReplyToScreenName;
        this.inReplyToStatusId = inReplyToStatusId;
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        this.inReplyToUserId = inReplyToUserId;
        this.inReplyToUserIdStr = inReplyToUserIdStr;
        this.isQuoteStatus = isQuoteStatus;
        this.lang = lang;
        this.place = place;
        this.possiblySensitive = possiblySensitive;
        this.retweetCount = retweetCount;
        this.retweeted = retweeted;
        this.source = source;
        this.text = text;
        this.truncated = truncated;
        this.user = user;
    }

    public Object getContributors() {
        return contributors;
    }

    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public RetweetedStatus withContributors(Object contributors) {
        this.contributors = contributors;
        return this;
    }

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public RetweetedStatus withCoordinates(Object coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RetweetedStatus withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Entities__ getEntities() {
        return entities;
    }

    public void setEntities(Entities__ entities) {
        this.entities = entities;
    }

    public RetweetedStatus withEntities(Entities__ entities) {
        this.entities = entities;
        return this;
    }

    public ExtendedEntities getExtendedEntities() {
        return extendedEntities;
    }

    public void setExtendedEntities(ExtendedEntities extendedEntities) {
        this.extendedEntities = extendedEntities;
    }

    public RetweetedStatus withExtendedEntities(ExtendedEntities extendedEntities) {
        this.extendedEntities = extendedEntities;
        return this;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public RetweetedStatus withFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
        return this;
    }

    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public RetweetedStatus withFavorited(Boolean favorited) {
        this.favorited = favorited;
        return this;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public RetweetedStatus withGeo(Object geo) {
        this.geo = geo;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RetweetedStatus withId(Long id) {
        this.id = id;
        return this;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public RetweetedStatus withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public RetweetedStatus withInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
        return this;
    }

    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public RetweetedStatus withInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
        return this;
    }

    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public RetweetedStatus withInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        return this;
    }

    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public RetweetedStatus withInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
        return this;
    }

    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public RetweetedStatus withInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
        return this;
    }

    public Boolean getIsQuoteStatus() {
        return isQuoteStatus;
    }

    public void setIsQuoteStatus(Boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    public RetweetedStatus withIsQuoteStatus(Boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public RetweetedStatus withLang(String lang) {
        this.lang = lang;
        return this;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public RetweetedStatus withPlace(Place place) {
        this.place = place;
        return this;
    }

    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public RetweetedStatus withPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
        return this;
    }

    public Long getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
    }

    public RetweetedStatus withRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
        return this;
    }

    public Boolean getRetweeted() {
        return retweeted;
    }

    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public RetweetedStatus withRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public RetweetedStatus withSource(String source) {
        this.source = source;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public RetweetedStatus withText(String text) {
        this.text = text;
        return this;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public RetweetedStatus withTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    public User_ getUser() {
        return user;
    }

    public void setUser(User_ user) {
        this.user = user;
    }

    public RetweetedStatus withUser(User_ user) {
        this.user = user;
        return this;
    }

}
