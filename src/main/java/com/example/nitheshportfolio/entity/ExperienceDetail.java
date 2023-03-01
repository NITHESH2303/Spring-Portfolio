package com.example.nitheshportfolio.entity;

public class ExperienceDetail {
    private int from;
    private int to;
    private String companyname;
    private String workdesc;

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getWorkdesc() {
        return workdesc;
    }

    public void setWorkdesc(String workdesc) {
        this.workdesc = workdesc;
    }
    public ExperienceDetailModel(){

    }

    @Override
    public String toString() {
        return "ExperienceDetail{" +
                "from=" + from +
                ", to=" + to +
                ", companyname='" + companyname + '\'' +
                ", workdesc='" + workdesc + '\'' +
                '}';
    }
}
