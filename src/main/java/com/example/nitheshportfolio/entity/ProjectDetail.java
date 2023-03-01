package com.example.nitheshportfolio.entity;

public class ProjectDetail {
    private String projectname;
    private String projectdesc;

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjectdesc() {
        return projectdesc;
    }

    public void setProjectdesc(String projectdesc) {
        this.projectdesc = projectdesc;
    }
    public ProjectDetailModel(){

    }

    @Override
    public String toString() {
        return "ProjectDetail{" +
                "projectname='" + projectname + '\'' +
                ", projectdesc='" + projectdesc + '\'' +
                '}';
    }
}
