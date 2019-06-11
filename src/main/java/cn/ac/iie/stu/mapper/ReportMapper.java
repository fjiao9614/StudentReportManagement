package cn.ac.iie.stu.mapper;

import cn.ac.iie.stu.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReportMapper {
    /**
     * 查询报告内容
     * @param r_id
     * @return
     * @throws Exception
     */
    Report showReport(@Param("r_id")long r_id) throws Exception;

    List<Academic> showAcademic(@Param("r_id") long r_id) throws Exception;
    List<Competition> showCompetition(@Param("r_id") long r_id) throws Exception;
    List<Course> showCourse(@Param("r_id") long r_id) throws Exception;
    List<Intellectual> showIntellectual(@Param("r_id")long r_id) throws Exception;
    List<Research> showResearch(@Param("r_id") long r_id) throws Exception;
    List<Service> showService(@Param("r_id") long r_id) throws Exception;
    List<Suggestion> showSuggestion(@Param("r_id") long r_id) throws Exception;
    List<Technology> showTechnology(@Param("r_id") long r_id) throws Exception;

    void addReport(@Param("report") Report report)throws Exception;
    void addAcademic(@Param("academic") Academic academic)throws Exception;
    void addCompetition(@Param("competition") Competition competition)throws Exception;
    void addCourse(@Param("course") Course course)throws Exception;
    void addIntellectual(@Param("intellectual") Intellectual intellectual)throws Exception;
    void addResearch(@Param("research") Research research)throws Exception;
    void addService(@Param("service") Service service)throws Exception;
    void addSuggestion(@Param("suggestion") Suggestion suggestion)throws Exception;
    void addTechnology(@Param("technology") Technology technology)throws Exception;

    void upAcademic(@Param("academic") Academic academic)throws Exception;
    void upReport(@Param("report") Report report)throws Exception;
    void upCompetition(@Param("competition") Competition competition)throws Exception;
    void upCourse(@Param("course") Course course)throws Exception;
    void upIntellectual(@Param("intellectual") Intellectual intellectual)throws Exception;
    void upResearch(@Param("research") Research research)throws Exception;
    void upService(@Param("service") Service service)throws Exception;
    void upSuggestion(@Param("suggestion") Suggestion suggestion)throws Exception;
    void upTechnology(@Param("technology") Technology technology)throws Exception;

    void delAcademic(@Param("r_id") long r_id, @Param("index")int index) throws Exception;
    void delCompetition(@Param("r_id") long r_id, @Param("index")int index) throws Exception;
    void delCourse(@Param("r_id") long r_id, @Param("index")int index) throws Exception;
    void delIntellectual(@Param("r_id")long r_id, @Param("index")int index ) throws Exception;
    void delResearch(@Param("r_id") long r_id, @Param("index")int index) throws Exception;
    void delService(@Param("r_id") long r_id, @Param("index")int index) throws Exception;
    void delSuggestion(@Param("r_id") long r_id, @Param("index")int index) throws Exception;
    void delTechnology(@Param("r_id") long r_id, @Param("index")int index) throws Exception;

    Long getReportId(@Param("type")int type, @Param("time")String time)throws Exception;
    Long getReportStatus(@Param("type")int type, @Param("time")String time)throws Exception;




}
