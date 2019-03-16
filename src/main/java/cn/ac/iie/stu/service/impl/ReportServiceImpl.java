package cn.ac.iie.stu.service.impl;

import cn.ac.iie.stu.domain.*;
import cn.ac.iie.stu.mapper.ReportMapper;
import cn.ac.iie.stu.service.ReportService;
import cn.ac.iie.stu.service.SqlSessionServices;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService {
    private static SqlSessionFactory factory = SqlSessionServices.getFactory();

    @Override
    public Report showReport(long r_id) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(ReportMapper.class).showReport(r_id);
        }
    }

    @Override
    public Academic showAcademic(long r_id,int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(ReportMapper.class).showAcademic(r_id,index);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Competition showCompetition(long r_id,int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(ReportMapper.class).showCompetition(r_id,index);
        }
    }

    @Override
    public Course showCourse(long r_id,int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(ReportMapper.class).showCourse(r_id,index);
        }
    }

    @Override
    public Intellectual showIntellectual(long r_id,int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(ReportMapper.class).showIntellectual(r_id,index);
        }
    }

    @Override
    public Research showResearch(long r_id,int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(ReportMapper.class).showResearch(r_id,index);
        }
    }

    @Override
    public cn.ac.iie.stu.domain.Service showService(long r_id, int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(ReportMapper.class).showService(r_id,index);
        }
    }

    @Override
    public Suggestion showSuggestion(long r_id,int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(ReportMapper.class).showSuggestion(r_id,index);
        }
    }

    @Override
    public Technology showTechnology(long r_id,int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(ReportMapper.class).showTechnology(r_id,index);
        }
    }

    @Override
    public void addReport(Report report) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).addReport(report);
        }
    }

    @Override
    public void addAcademic(Academic academic) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).addAcademic(academic);
        }
    }

    @Override
    public void addCompetition(Competition competition) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).addCompetition(competition);
        }
    }

    @Override
    public void addCourse(Course course) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).addCourse(course);
        }
    }

    @Override
    public void addIntellectual(Intellectual intellectual) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).addIntellectual(intellectual);
        }
    }

    @Override
    public void addResearch(Research research) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).addResearch(research);
        }
    }

    @Override
    public void addService(cn.ac.iie.stu.domain.Service service) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).addService(service);
        }
    }

    @Override
    public void addSuggestion(Suggestion suggestion) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).addSuggestion(suggestion);
        }
    }

    @Override
    public void addTechnology(Technology technology) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).addTechnology(technology);
        }
    }

    @Override
    public void upReport(Report report) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).upReport(report);
        }
    }

    @Override
    public void upAcademic(Academic academic) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).upAcademic(academic);
        }
    }

    @Override
    public void upCompetition(Competition competition) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).upCompetition(competition);
        }
    }

    @Override
    public void upCourse(Course course) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).upCourse(course);
        }
    }

    @Override
    public void upIntellectual(Intellectual intellectual) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).upIntellectual(intellectual);
        }
    }

    @Override
    public void upResearch(Research research) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).upResearch(research);
        }
    }

    @Override
    public void upService(cn.ac.iie.stu.domain.Service service) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).upService(service);
        }
    }

    @Override
    public void upSuggestion(Suggestion suggestion) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).upSuggestion(suggestion);
        }
    }

    @Override
    public void upTechnology(Technology technology) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(ReportMapper.class).upTechnology(technology);
        }
    }

    @Override
    public void delAcademic(long r_id, int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            session.getMapper(ReportMapper.class).delAcademic(r_id,index);
        }
    }

    @Override
    public void delCompetition(long r_id, int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            session.getMapper(ReportMapper.class).delCompetition(r_id,index);
        }
    }

    @Override
    public void delCourse(long r_id, int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            session.getMapper(ReportMapper.class).delCourse(r_id,index);
        }
    }

    @Override
    public void delIntellectual(long r_id, int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            session.getMapper(ReportMapper.class).delIntellectual(r_id,index);
        }
    }

    @Override
    public void delResearch(long r_id, int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            session.getMapper(ReportMapper.class).delResearch(r_id,index);
        }
    }

    @Override
    public void delService(long r_id, int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            session.getMapper(ReportMapper.class).delService(r_id,index);
        }
    }

    @Override
    public void delSuggestion(long r_id, int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            session.getMapper(ReportMapper.class).delSuggestion(r_id,index);
        }
    }

    @Override
    public void delTechnology(long r_id, int index) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            session.getMapper(ReportMapper.class).delTechnology(r_id,index);
        }
    }

    @Override
    public Long getReportId(int type, String time) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(ReportMapper.class).getReportId(type, time);
        }
    }

    @Override
    public Long getReportStatus(int type, String time) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            return session.getMapper(ReportMapper.class).getReportStatus(type,time);
        }
    }
}
