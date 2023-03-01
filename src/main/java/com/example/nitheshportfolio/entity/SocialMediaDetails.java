package com.example.nitheshportfolio.entity;

public class SocialMediaDetails {
    private String twitterUrl;
    private String leetcodeUrl;
    private String githubUrl;

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getLeetcodeUrl() {
        return leetcodeUrl;
    }

    public void setLeetcodeUrl(String leetcodeUrl) {
        this.leetcodeUrl = leetcodeUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }
    public SocialMediaDetails(){

    }

    @Override
    public String toString() {
        return "SocialMediaDetails{" +
                "twitterUrl='" + twitterUrl + '\'' +
                ", leetcodeUrl='" + leetcodeUrl + '\'' +
                ", githubUrl='" + githubUrl + '\'' +
                '}';
    }
}
