
package edu.glyndwr.twitterjson.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User_ implements Serializable
{

    @SerializedName("contributors_enabled")
    @Expose
    private Boolean contributorsEnabled;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("default_profile")
    @Expose
    private Boolean defaultProfile;
    @SerializedName("default_profile_image")
    @Expose
    private Boolean defaultProfileImage;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("entities")
    @Expose
    private Entities___ entities;
    @SerializedName("favourites_count")
    @Expose
    private Long favouritesCount;
    @SerializedName("follow_request_sent")
    @Expose
    private Boolean followRequestSent;
    @SerializedName("followers_count")
    @Expose
    private Long followersCount;
    @SerializedName("following")
    @Expose
    private Boolean following;
    @SerializedName("friends_count")
    @Expose
    private Long friendsCount;
    @SerializedName("geo_enabled")
    @Expose
    private Boolean geoEnabled;
    @SerializedName("has_extended_profile")
    @Expose
    private Boolean hasExtendedProfile;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("is_translation_enabled")
    @Expose
    private Boolean isTranslationEnabled;
    @SerializedName("is_translator")
    @Expose
    private Boolean isTranslator;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("listed_count")
    @Expose
    private Long listedCount;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("notifications")
    @Expose
    private Boolean notifications;
    @SerializedName("profile_background_color")
    @Expose
    private String profileBackgroundColor;
    @SerializedName("profile_background_image_url")
    @Expose
    private String profileBackgroundImageUrl;
    @SerializedName("profile_background_image_url_https")
    @Expose
    private String profileBackgroundImageUrlHttps;
    @SerializedName("profile_background_tile")
    @Expose
    private Boolean profileBackgroundTile;
    @SerializedName("profile_banner_url")
    @Expose
    private String profileBannerUrl;
    @SerializedName("profile_image_url")
    @Expose
    private String profileImageUrl;
    @SerializedName("profile_image_url_https")
    @Expose
    private String profileImageUrlHttps;
    @SerializedName("profile_link_color")
    @Expose
    private String profileLinkColor;
    @SerializedName("profile_sidebar_border_color")
    @Expose
    private String profileSidebarBorderColor;
    @SerializedName("profile_sidebar_fill_color")
    @Expose
    private String profileSidebarFillColor;
    @SerializedName("profile_text_color")
    @Expose
    private String profileTextColor;
    @SerializedName("profile_use_background_image")
    @Expose
    private Boolean profileUseBackgroundImage;
    @SerializedName("protected")
    @Expose
    private Boolean _protected;
    @SerializedName("screen_name")
    @Expose
    private String screenName;
    @SerializedName("statuses_count")
    @Expose
    private Long statusesCount;
    @SerializedName("time_zone")
    @Expose
    private Object timeZone;
    @SerializedName("translator_type")
    @Expose
    private String translatorType;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("utc_offset")
    @Expose
    private Object utcOffset;
    @SerializedName("verified")
    @Expose
    private Boolean verified;
    private final static long serialVersionUID = -4654666816528901171L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User_() {
    }

    /**
     * 
     * @param isTranslator
     * @param isTranslationEnabled
     * @param friendsCount
     * @param profileUseBackgroundImage
     * @param profileBackgroundColor
     * @param followRequestSent
     * @param location
     * @param profileBannerUrl
     * @param favouritesCount
     * @param screenName
     * @param hasExtendedProfile
     * @param timeZone
     * @param profileImageUrl
     * @param profileSidebarBorderColor
     * @param defaultProfileImage
     * @param lang
     * @param id
     * @param profileSidebarFillColor
     * @param following
     * @param verified
     * @param description
     * @param createdAt
     * @param name
     * @param contributorsEnabled
     * @param profileBackgroundImageUrlHttps
     * @param profileImageUrlHttps
     * @param geoEnabled
     * @param listedCount
     * @param entities
     * @param url
     * @param _protected
     * @param idStr
     * @param profileBackgroundTile
     * @param profileLinkColor
     * @param translatorType
     * @param notifications
     * @param utcOffset
     * @param followersCount
     * @param profileTextColor
     * @param statusesCount
     * @param profileBackgroundImageUrl
     * @param defaultProfile
     */
    public User_(Boolean contributorsEnabled, String createdAt, Boolean defaultProfile, Boolean defaultProfileImage, String description, Entities___ entities, Long favouritesCount, Boolean followRequestSent, Long followersCount, Boolean following, Long friendsCount, Boolean geoEnabled, Boolean hasExtendedProfile, Long id, String idStr, Boolean isTranslationEnabled, Boolean isTranslator, String lang, Long listedCount, String location, String name, Boolean notifications, String profileBackgroundColor, String profileBackgroundImageUrl, String profileBackgroundImageUrlHttps, Boolean profileBackgroundTile, String profileBannerUrl, String profileImageUrl, String profileImageUrlHttps, String profileLinkColor, String profileSidebarBorderColor, String profileSidebarFillColor, String profileTextColor, Boolean profileUseBackgroundImage, Boolean _protected, String screenName, Long statusesCount, Object timeZone, String translatorType, String url, Object utcOffset, Boolean verified) {
        super();
        this.contributorsEnabled = contributorsEnabled;
        this.createdAt = createdAt;
        this.defaultProfile = defaultProfile;
        this.defaultProfileImage = defaultProfileImage;
        this.description = description;
        this.entities = entities;
        this.favouritesCount = favouritesCount;
        this.followRequestSent = followRequestSent;
        this.followersCount = followersCount;
        this.following = following;
        this.friendsCount = friendsCount;
        this.geoEnabled = geoEnabled;
        this.hasExtendedProfile = hasExtendedProfile;
        this.id = id;
        this.idStr = idStr;
        this.isTranslationEnabled = isTranslationEnabled;
        this.isTranslator = isTranslator;
        this.lang = lang;
        this.listedCount = listedCount;
        this.location = location;
        this.name = name;
        this.notifications = notifications;
        this.profileBackgroundColor = profileBackgroundColor;
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
        this.profileBackgroundTile = profileBackgroundTile;
        this.profileBannerUrl = profileBannerUrl;
        this.profileImageUrl = profileImageUrl;
        this.profileImageUrlHttps = profileImageUrlHttps;
        this.profileLinkColor = profileLinkColor;
        this.profileSidebarBorderColor = profileSidebarBorderColor;
        this.profileSidebarFillColor = profileSidebarFillColor;
        this.profileTextColor = profileTextColor;
        this.profileUseBackgroundImage = profileUseBackgroundImage;
        this._protected = _protected;
        this.screenName = screenName;
        this.statusesCount = statusesCount;
        this.timeZone = timeZone;
        this.translatorType = translatorType;
        this.url = url;
        this.utcOffset = utcOffset;
        this.verified = verified;
    }

    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public User_ withContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public User_ withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public User_ withDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
        return this;
    }

    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    public User_ withDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User_ withDescription(String description) {
        this.description = description;
        return this;
    }

    public Entities___ getEntities() {
        return entities;
    }

    public void setEntities(Entities___ entities) {
        this.entities = entities;
    }

    public User_ withEntities(Entities___ entities) {
        this.entities = entities;
        return this;
    }

    public Long getFavouritesCount() {
        return favouritesCount;
    }

    public void setFavouritesCount(Long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public User_ withFavouritesCount(Long favouritesCount) {
        this.favouritesCount = favouritesCount;
        return this;
    }

    public Boolean getFollowRequestSent() {
        return followRequestSent;
    }

    public void setFollowRequestSent(Boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public User_ withFollowRequestSent(Boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
        return this;
    }

    public Long getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
    }

    public User_ withFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
        return this;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public User_ withFollowing(Boolean following) {
        this.following = following;
        return this;
    }

    public Long getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(Long friendsCount) {
        this.friendsCount = friendsCount;
    }

    public User_ withFriendsCount(Long friendsCount) {
        this.friendsCount = friendsCount;
        return this;
    }

    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public User_ withGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
        return this;
    }

    public Boolean getHasExtendedProfile() {
        return hasExtendedProfile;
    }

    public void setHasExtendedProfile(Boolean hasExtendedProfile) {
        this.hasExtendedProfile = hasExtendedProfile;
    }

    public User_ withHasExtendedProfile(Boolean hasExtendedProfile) {
        this.hasExtendedProfile = hasExtendedProfile;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User_ withId(Long id) {
        this.id = id;
        return this;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public User_ withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    public Boolean getIsTranslationEnabled() {
        return isTranslationEnabled;
    }

    public void setIsTranslationEnabled(Boolean isTranslationEnabled) {
        this.isTranslationEnabled = isTranslationEnabled;
    }

    public User_ withIsTranslationEnabled(Boolean isTranslationEnabled) {
        this.isTranslationEnabled = isTranslationEnabled;
        return this;
    }

    public Boolean getIsTranslator() {
        return isTranslator;
    }

    public void setIsTranslator(Boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    public User_ withIsTranslator(Boolean isTranslator) {
        this.isTranslator = isTranslator;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public User_ withLang(String lang) {
        this.lang = lang;
        return this;
    }

    public Long getListedCount() {
        return listedCount;
    }

    public void setListedCount(Long listedCount) {
        this.listedCount = listedCount;
    }

    public User_ withListedCount(Long listedCount) {
        this.listedCount = listedCount;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User_ withLocation(String location) {
        this.location = location;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User_ withName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getNotifications() {
        return notifications;
    }

    public void setNotifications(Boolean notifications) {
        this.notifications = notifications;
    }

    public User_ withNotifications(Boolean notifications) {
        this.notifications = notifications;
        return this;
    }

    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public User_ withProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
        return this;
    }

    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public User_ withProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
        return this;
    }

    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    public User_ withProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
        return this;
    }

    public Boolean getProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    public User_ withProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
        return this;
    }

    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    public User_ withProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
        return this;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public User_ withProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
        return this;
    }

    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    public User_ withProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
        return this;
    }

    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public User_ withProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
        return this;
    }

    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public User_ withProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
        return this;
    }

    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public User_ withProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
        return this;
    }

    public String getProfileTextColor() {
        return profileTextColor;
    }

    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public User_ withProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
        return this;
    }

    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public User_ withProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
        return this;
    }

    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public User_ withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public User_ withScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public Long getStatusesCount() {
        return statusesCount;
    }

    public void setStatusesCount(Long statusesCount) {
        this.statusesCount = statusesCount;
    }

    public User_ withStatusesCount(Long statusesCount) {
        this.statusesCount = statusesCount;
        return this;
    }

    public Object getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Object timeZone) {
        this.timeZone = timeZone;
    }

    public User_ withTimeZone(Object timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public String getTranslatorType() {
        return translatorType;
    }

    public void setTranslatorType(String translatorType) {
        this.translatorType = translatorType;
    }

    public User_ withTranslatorType(String translatorType) {
        this.translatorType = translatorType;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User_ withUrl(String url) {
        this.url = url;
        return this;
    }

    public Object getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(Object utcOffset) {
        this.utcOffset = utcOffset;
    }

    public User_ withUtcOffset(Object utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public User_ withVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }

}
