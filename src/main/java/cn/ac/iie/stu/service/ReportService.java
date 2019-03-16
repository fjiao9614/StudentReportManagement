package cn.ac.iie.stu.service;

import cn.ac.iie.stu.domain.*;

import java.util.List;


public interface ReportService {
    /**
     * 查询报告内容
     */
    Report showReport(long r_id) throws Exception;
    Academic showAcademic(long r_id, int index) throws Exception;
    Competition showCompetition(long r_id,int index) throws Exception;
    Course showCourse(long r_id,int index) throws Exception;
    Intellectual showIntellectual(long r_id,int index) throws Exception;
    Research showResearch(long r_id,int index) throws Exception;
    Service showService(long r_id,int index) throws Exception;
    Suggestion showSuggestion(long r_id,int index) throws Exception;
    Technology showTechnology(long r_id,int index) throws Exception;

    void addReport(Report report)throws Exception;
    void addAcademic(Academic academic)throws Exception;
    void addCompetition(Competition competition)throws Exception;
    void addCourse( Course course)throws Exception;
    void addIntellectual(Intellectual intellectual)throws Exception;
    void addResearch(Research research)throws Exception;
    void addService(Service service)throws Exception;
    void addSuggestion(Suggestion suggestion)throws Exception;
    void addTechnology(Technology technology)throws Exception;

    void upReport(Report report)throws Exception;
    void upAcademic(Academic academic)throws Exception;
    void upCompetition(Competition competition)throws Exception;
    void upCourse( Course course)throws Exception;
    void upIntellectual(Intellectual intellectual)throws Exception;
    void upResearch(Research research)throws Exception;
    void upService(Service service)throws Exception;
    void upSuggestion(Suggestion suggestion)throws Exception;
    void upTechnology(Technology technology)throws Exception;

    void delAcademic(long r_id, int index) throws Exception;
    void delCompetition(long r_id,int index) throws Exception;
    void delCourse(long r_id,int index) throws Exception;
    void delIntellectual(long r_id,int index) throws Exception;
    void delResearch(long r_id,int index) throws Exception;
    void delService(long r_id,int index) throws Exception;
    void delSuggestion(long r_id,int index) throws Exception;
    void delTechnology(long r_id,int index) throws Exception;

    Long getReportId(int type, String time)throws Exception;
    Long getReportStatus(int type,String time)throws Exception;

}
