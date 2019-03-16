package cn.ac.iie.stu.domain;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Report {
    private long r_id;
    private int status;
    private int type;
    private String time;
    private String academic_overview;
    //    private List<Academic> academic_result;
    private String technology_overview;
    //    private List<Technology> technology_result;
    //    private List<Intellectual> intellectual_result;
    private String research_overview;
    //    private List<Research> research_result;
    //    private List<Service> service_result;
    private String course_overview;
    //    private List<Course> course_result;
    //    private List<Competition> competition_result;
    private String experience;
    private String lacking;
    private String measure;
    private String plan;
    //    private List<Suggestion> suggestions;
    private String teacher_option;
    private String stu_response;

    public long getR_id() {
        return r_id;
    }

    public void setR_id(long r_id) {
        this.r_id = r_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTime() { return time; }

    public void setTime(String time) { this.time = time; }

    public String getAcademic_overview() {
        return academic_overview;
    }

    public void setAcademic_overview(String academic_overview) {
        this.academic_overview = academic_overview;
    }

    public String getTechnology_overview() {
        return technology_overview;
    }

    public void setTechnology_overview(String technology_overview) {
        this.technology_overview = technology_overview;
    }

    public String getResearch_overview() {
        return research_overview;
    }

    public void setResearch_overview(String research_overview) {
        this.research_overview = research_overview;
    }

    public String getCourse_overview() {
        return course_overview;
    }

    public void setCourse_overview(String course_overview) {
        this.course_overview = course_overview;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLacking() {
        return lacking;
    }

    public void setLacking(String lacking) {
        this.lacking = lacking;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getTeacher_option() {
        return teacher_option;
    }

    public void setTeacher_option(String teacher_option) {
        this.teacher_option = teacher_option;
    }

    public String getStu_response() {
        return stu_response;
    }

    public void setStu_response(String stu_response) {
        this.stu_response = stu_response;
    }
}
