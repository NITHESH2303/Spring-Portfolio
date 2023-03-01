package com.example.nitheshportfolio.entity;

import com.example.nitheshportfolio.common.Roles;
import jakarta.persistence.Id;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.security.core.GrantedAuthority;

public class UserDetails {
    @Id
    private int id;
    private String desc;
    private AuthDetail authDetail;
    private SocialMediaDetails socialMediaDetails;
    private List<ProjectDetail> projectDetails;
    private List<ExperienceDetail> experienceDetails;
    private List<Roles> roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AuthDetail getAuthDetail() {
        return authDetail;
    }

    public void setAuthDetail(AuthDetail authDetail) {
        this.authDetail = authDetail;
    }

    public SocialMediaDetails getSocialMediaDetails() {
        return socialMediaDetails;
    }

    public void setSocialMediaDetails(SocialMediaDetails socialMediaDetails) {
        this.socialMediaDetails = socialMediaDetails;
    }

    public List<ProjectDetail> getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(List<ProjectDetail> projectDetails) {
        this.projectDetails = projectDetails;
    }

    public List<ExperienceDetail> getExperienceDetails() {
        return experienceDetails;
    }

    public void setExperienceDetails(List<ExperienceDetail> experienceDetails) {
        this.experienceDetails = experienceDetails;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public UserDetails(){

    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", authDetail=" + authDetail +
                ", socialMediaDetails=" + socialMediaDetails +
                ", projectDetails=" + projectDetails +
                ", experienceDetails=" + experienceDetails +
                ", roles=" + roles +
                '}';
    }
}
