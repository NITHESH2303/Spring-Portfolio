package com.example.nitheshportfolio.models;

public class UserDetailsModel {
    private int id;
    private String description;
    private AuthDetailModel authDetailModel;
    private SocialMediaDetailsModel socialMediaDetailsModel;
    private List<ServiceDetailModel> serviceDetailModels;
    private List<ProjectDetailModel> projectDetailModels;
    private List<ExperienceDetailModel> experienceDetailModels;
    private List<Roles> roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AuthDetailModel getAuthDetailModel() {
        return authDetailModel;
    }

    public void setAuthDetailModel(AuthDetailModel authDetailModel) {
        this.authDetailModel = authDetailModel;
    }

    public SocialMediaDetailsModel getSocialMediaDetailsModel() {
        return socialMediaDetailsModel;
    }

    public void setSocialMediaDetailsModel(SocialMediaDetailsModel socialMediaDetailsModel) {
        this.socialMediaDetailsModel = socialMediaDetailsModel;
    }

    public List<ServiceDetailModel> getServiceDetailModels() {
        return serviceDetailModels;
    }

    public void setServiceDetailModels(List<ServiceDetailModel> serviceDetailModels) {
        this.serviceDetailModels = serviceDetailModels;
    }

    public List<ProjectDetailModel> getProjectDetailModels() {
        return projectDetailModels;
    }

    public void setProjectDetailModels(List<ProjectDetailModel> projectDetailModels) {
        this.projectDetailModels = projectDetailModels;
    }

    public List<ExperienceDetailModel> getExperienceDetailModels() {
        return experienceDetailModels;
    }

    public void setExperienceDetailModels(List<ExperienceDetailModel> experienceDetailModels) {
        this.experienceDetailModels = experienceDetailModels;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public UserDetailsModel(){

    }
}
