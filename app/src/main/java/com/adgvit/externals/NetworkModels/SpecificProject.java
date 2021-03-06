package com.adgvit.externals.NetworkModels;

public class SpecificProject {

    public String _id;
    public String title;
    public String description;
    public String shortDescription;
    public String features;
    public String mockup;
    public String thumbnail;
    public String websiteLink;
    public String iosLink;
    public String androidLink;
    public boolean isItUnderDevelopment;
    public long releaseDate;
    public int __v;

    public SpecificProject(String _id, String title, String description, String shortDescription, String features, String mockup, String thumbnail, String websiteLink, String iosLink, String androidLink, boolean isItUnderDevelopment, long releaseDate, int __v) {
        this._id = _id;
        this.title = title;
        this.description = description;
        this.shortDescription = shortDescription;
        this.features = features;
        this.mockup = mockup;
        this.thumbnail = thumbnail;
        this.websiteLink = websiteLink;
        this.iosLink = iosLink;
        this.androidLink = androidLink;
        this.isItUnderDevelopment = isItUnderDevelopment;
        this.releaseDate = releaseDate;
        this.__v = __v;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getMockup() {
        return mockup;
    }

    public void setMockup(String mockup) {
        this.mockup = mockup;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public void setWebsiteLink(String websiteLink) {
        this.websiteLink = websiteLink;
    }

    public String getIosLink() {
        return iosLink;
    }

    public void setIosLink(String iosLink) {
        this.iosLink = iosLink;
    }

    public String getAndroidLink() {
        return androidLink;
    }

    public void setAndroidLink(String androidLink) {
        this.androidLink = androidLink;
    }

    public boolean isItUnderDevelopment() {
        return isItUnderDevelopment;
    }

    public void setItUnderDevelopment(boolean itUnderDevelopment) {
        isItUnderDevelopment = itUnderDevelopment;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(long releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
