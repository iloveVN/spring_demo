package com.garen.domain;

public class BaseQuery {

    private String projectid;
    private int page;
    private int numPerPage;

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNumPerPage() {
        return numPerPage;
    }

    public void setNumPerPage(int numPerPage) {
        this.numPerPage = numPerPage;
    }

    @Override
    public String toString() {
        return "BaseQuery{" +
                "projectid='" + projectid + '\'' +
                ", page=" + page +
                ", numPerPage=" + numPerPage +
                '}';
    }
}
