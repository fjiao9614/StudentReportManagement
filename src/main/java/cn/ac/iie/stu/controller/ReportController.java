package cn.ac.iie.stu.controller;


import cn.ac.iie.stu.domain.*;

import cn.ac.iie.stu.mapper.ReportMapper;
import cn.ac.iie.stu.utils.ReturnFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/report")

public class ReportController {
    @Autowired
    private ReportMapper reportMapper;

    /**
     * 根据报告id（r_id）查询报告内容
     */
    @GetMapping(value = "/allcontent",produces = "application/json;charset=UTF-8")
    public String AllContent(@RequestParam("r_id") long r_id) {
        try {
            Report report = reportMapper.showReport(r_id);
            List<Academic> academics = reportMapper.showAcademic(r_id);
            List<Competition> competitions = reportMapper.showCompetition(r_id);
            List<Course> courses = reportMapper.showCourse(r_id);
            List<Intellectual> intellectuals = reportMapper.showIntellectual(r_id);
            List<Research> researches = reportMapper.showResearch(r_id);
            List<Service> services = reportMapper.showService(r_id);
            List<Suggestion> suggestions = reportMapper.showSuggestion(r_id);
            List<Technology> technologies = reportMapper.showTechnology(r_id);
            AllContent content = new AllContent(report,academics,competitions,courses,intellectuals,researches,services,suggestions,technologies);

            return ReturnFormat.result(content,"查询报告内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询报告内容失败");
        }
    }

    @PostMapping(value="/addcontent",produces = "application/json;charset=UTF-8")
    public String addContent(@RequestBody AllContent content){
        try {
            Report report = content.getReport();
            List<Academic> academics = content.getAcademics();
            List<Competition> competitions = content.getCompetitions();
            List<Course> courses = content.getCourses();
            List<Intellectual> intellectuals = content.getIntellectuals();
            List<Research> researches = content.getResearches();
            List<Service> services = content.getServices();
            List<Suggestion> suggestions = content.getSuggestions();
            List<Technology> technologies = content.getTechnologies();
            reportMapper.addReport(report);
            if(academics!=null && !academics.isEmpty()){
                for(Academic academic:academics){
                    reportMapper.addAcademic(academic);
                }
            }
            if(competitions!=null && !competitions.isEmpty()){
                for(Competition competition:competitions){
                    reportMapper.addCompetition(competition);
                }
            }
            if(courses != null && !courses.isEmpty()){
                for(Course course:courses){
                    reportMapper.addCourse(course);
                }
            }
            if(intellectuals != null && !intellectuals.isEmpty()){
                for(Intellectual intellectual:intellectuals){
                    reportMapper.addIntellectual(intellectual);
                }
            }

            if(researches != null && !researches.isEmpty()){
                for(Research research:researches){
                    reportMapper.addResearch(research);
                }
            }

            if(services != null && !services.isEmpty()){
                for(Service service:services){
                    reportMapper.addService(service);
                }
            }

            if(suggestions != null && suggestions.isEmpty()){
                for(Suggestion suggestion:suggestions){
                    reportMapper.addSuggestion(suggestion);
                }
            }
            if(technologies != null && technologies.isEmpty()){
                for(Technology technology:technologies){
                    reportMapper.addTechnology(technology);
                }
            }

            return ReturnFormat.success("增加全部内容成功");

        } catch (Exception e) {
            e.printStackTrace();
            return ReturnFormat.failed("增加报告内容失败");
        }
    }

    @PostMapping(value = "/report",produces = "application/json;charset=UTF-8")
    public String showReport(@RequestParam("r_id") long r_id) {
        try {
            return ReturnFormat.result(reportMapper.showReport(r_id),"查询报告内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询报告内容失败");
        }
    }

    @PostMapping(value = "/academic",produces = "application/json;charset=UTF-8")
    public String showAcademic(@RequestParam("r_id") long r_id) {
        try {
            return ReturnFormat.result(reportMapper.showAcademic(r_id),"查询学术成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询学术成果内容失败");
        }
    }
    @PostMapping(value = "/competition",produces = "application/json;charset=UTF-8")
    public String showCompetition(@RequestParam("r_id") long r_id) {
        try {
            return ReturnFormat.result(reportMapper.showCompetition(r_id),"查询竞赛成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询竞赛成果内容失败");
        }
    }
    @PostMapping(value = "/course",produces = "application/json;charset=UTF-8")
    public String showCourse(@RequestParam("r_id") long r_id) {
        try {
            return ReturnFormat.result(reportMapper.showCourse(r_id),"查询课程成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询课程成果内容失败");
        }
    }

    @PostMapping(value = "/intellectual",produces = "application/json;charset=UTF-8")
    public String showIntellectual(@RequestParam("r_id") long r_id) {
        try {
            return ReturnFormat.result(reportMapper.showIntellectual(r_id),"查询知识产权成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询知识产权内容失败");
        }
    }

    @PostMapping(value = "/research",produces = "application/json;charset=UTF-8")
    public String showResearch(@RequestParam("r_id") long r_id) {
        try {
            return ReturnFormat.result(reportMapper.showResearch(r_id),"查询调研成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询调研成果内容失败");
        }
    }

    @PostMapping(value = "/service",produces = "application/json;charset=UTF-8")
    public String showService(@RequestParam("r_id") long r_id) {
        try {
            return ReturnFormat.result(reportMapper.showService(r_id),"查询支撑服务成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询支撑服务内容失败");
        }
    }

    @PostMapping(value = "/suggestion",produces = "application/json;charset=UTF-8")
    public String showSuggestion(@RequestParam("r_id") long r_id) {
        try {
            return ReturnFormat.result(reportMapper.showSuggestion(r_id),"查询建议内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询建议内容失败");
        }
    }

    @PostMapping(value = "/technology",produces = "application/json;charset=UTF-8")
    public String showTechnology(@RequestParam("r_id") long r_id) {
        try {
            return ReturnFormat.result(reportMapper.showTechnology(r_id),"查询工程成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询工程成果内容失败");
        }
    }


    //增加操作
    @PutMapping(value = "/add_report",produces = "application/json;charset=UTF-8")
    public String addReport(@RequestBody Report report) {
        try {

            reportMapper.addReport(report);
            return ReturnFormat.success("增加报告内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加报告内容失败");
        }
    }

    //增加操作
    @PutMapping(value = "/add_academic",produces = "application/json;charset=UTF-8")
    public String addAcademic(@RequestBody Academic academic) {
        try {

            reportMapper.addAcademic(academic);
            return ReturnFormat.success("增加学术成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加学术成果内容失败");
        }
    }
    @PutMapping(value = "/add_competition",produces = "application/json;charset=UTF-8")
    public String addCompetition(@RequestBody Competition competition) {
        try {

            reportMapper.addCompetition(competition);
            return ReturnFormat.success("增加竞赛成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加竞赛成果内容失败");
        }
    }
    @PutMapping(value = "/add_course",produces = "application/json;charset=UTF-8")
    public String addCourse(@RequestBody Course course) {
        try {

            reportMapper.addCourse(course);
            return ReturnFormat.success("增加课程学习内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加课程学习内容失败");
        }
    }
    @PutMapping(value = "/add_intellectual",produces = "application/json;charset=UTF-8")
    public String addIntellectual(@RequestBody Intellectual intellectual) {
        try {

            reportMapper.addIntellectual(intellectual);
            return ReturnFormat.success("增加知识产权内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加知识产权内容失败");
        }
    }
    @PutMapping(value = "/add_research",produces = "application/json;charset=UTF-8")
    public String addResearch(@RequestBody Research research) {
        try {

            reportMapper.addResearch(research);
            return ReturnFormat.success("增加调研成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加调研成果内容失败");
        }
    }
    @PutMapping(value = "/add_service",produces = "application/json;charset=UTF-8")
    public String addService(@RequestBody Service service) {
        try {

            reportMapper.addService(service);
            return ReturnFormat.success("增加支撑服务内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加支撑服务内容失败");
        }
    }
    @PutMapping(value = "/add_suggestion",produces = "application/json;charset=UTF-8")
    public String addSuggestion(@RequestBody Suggestion suggestion) {
        try {

            reportMapper.addSuggestion(suggestion);
            return ReturnFormat.success("增加建议内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加建议内容失败");
        }
    }
    @PutMapping(value = "/add_technology",produces = "application/json;charset=UTF-8")
    public String addTechnology(@RequestBody Technology technology) {
        try {

            reportMapper.addTechnology(technology);
            return ReturnFormat.success("增加工程成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加工程成果内容失败");
        }
    }


    @PutMapping(value = "/up_report",produces = "application/json;charset=UTF-8")
    public String upReport(@RequestBody Report report) {
        try {

            reportMapper.upReport(report);
            return ReturnFormat.success("更新报告内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新报告内容失败");
        }
    }

    @PutMapping(value = "/up_academic",produces = "application/json;charset=UTF-8")
    public String upAcademic(@RequestBody Academic academic) {
        try {

            reportMapper.upAcademic(academic);
            return ReturnFormat.success("更新学术成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新学术成果内容失败");
        }
    }

    @PutMapping(value = "/up_competition",produces = "application/json;charset=UTF-8")
    public String upCompetition(@RequestBody Competition competition) {
        try {

            reportMapper.upCompetition(competition);
            return ReturnFormat.success("更新竞赛成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新竞赛成果内容失败");
        }
    }
    @PutMapping(value = "/up_course",produces = "application/json;charset=UTF-8")
    public String upCourse(@RequestBody Course course) {
        try {

            reportMapper.upCourse(course);
            return ReturnFormat.success("更新课程学习内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新课程学习内容失败");
        }
    }
    @PutMapping(value = "/up_intellectual",produces = "application/json;charset=UTF-8")
    public String upIntellectual(@RequestBody Intellectual intellectual) {
        try {

            reportMapper.upIntellectual(intellectual);
            return ReturnFormat.success("更新知识产权内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新知识产权内容失败");
        }
    }
    @PutMapping(value = "/up_research",produces = "application/json;charset=UTF-8")
    public String upResearch(@RequestBody Research research) {
        try {

            reportMapper.upResearch(research);
            return ReturnFormat.success("更新调研成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新调研成果内容失败");
        }
    }
    @PutMapping(value = "/up_service",produces = "application/json;charset=UTF-8")
    public String upService(@RequestBody Service service) {
        try {

            reportMapper.upService(service);
            return ReturnFormat.success("更新支撑服务内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新支撑服务内容失败");
        }
    }
    @PutMapping(value = "/up_suggestion",produces = "application/json;charset=UTF-8")
    public String upSuggestion(@RequestBody Suggestion suggestion) {
        try {

            reportMapper.upSuggestion(suggestion);
            return ReturnFormat.success("更新建议内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新建议内容失败");
        }
    }
    @PutMapping(value = "/up_technology",produces = "application/json;charset=UTF-8")
    public String upTechnology(@RequestBody Technology technology) {
        try {

            reportMapper.upTechnology(technology);
            return ReturnFormat.success("更新工程成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新工程成果内容失败");
        }
    }



//    删除操作
    @PostMapping(value = "/del_academic",produces = "application/json;charset=UTF-8")
    public String delAcademic(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportMapper.delAcademic(r_id,index);
            return ReturnFormat.success("删除学术成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除学术成果内容失败");
        }
    }
    @PostMapping(value = "/del_competition",produces = "application/json;charset=UTF-8")
    public String delCompetition(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportMapper.delCompetition(r_id,index);
            return ReturnFormat.success("删除竞赛成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除竞赛成果内容失败");
        }
    }
    @PostMapping(value = "/del_course",produces = "application/json;charset=UTF-8")
    public String delCourse(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportMapper.delCourse(r_id,index);
            return ReturnFormat.success("删除课程成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除课程成果内容失败");
        }
    }

    @PostMapping(value = "/del_intellectual",produces = "application/json;charset=UTF-8")
    public String delIntellectual(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportMapper.delIntellectual(r_id,index);
            return ReturnFormat.success("删除知识产权成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除知识产权内容失败");
        }
    }

    @PostMapping(value = "/del_research",produces = "application/json;charset=UTF-8")
    public String delResearch(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportMapper.delResearch(r_id,index);
            return ReturnFormat.success("删除调研成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除调研成果内容失败");
        }
    }

    @PostMapping(value = "/del_service",produces = "application/json;charset=UTF-8")
    public String delService(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportMapper.delService(r_id,index);
            return ReturnFormat.success("删除支撑服务成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除支撑服务内容失败");
        }
    }

    @PostMapping(value = "/del_suggestion",produces = "application/json;charset=UTF-8")
    public String delSuggestion(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportMapper.delSuggestion(r_id,index);
            return ReturnFormat.success("删除建议内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除建议内容失败");
        }
    }

    @PostMapping(value = "/del_technology",produces = "application/json;charset=UTF-8")
    public String delTechnology(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportMapper.delTechnology(r_id,index);
            return ReturnFormat.success("删除工程成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除工程成果内容失败");
        }
    }


    @GetMapping(value = "/get_reportId",produces = "application/json;charset=UTF-8")
    public String getReportId(@RequestParam("type")int type,@RequestParam("time")String time){
        try{
            return ReturnFormat.result(reportMapper.getReportId(type,time),"获取报告ID成功");
        }catch (Exception e){
            return ReturnFormat.failed("获取报告ID失败！");
        }
    }

    @GetMapping(value = "/get_reportStatus",produces = "application/json;charset=UTF-8")
    public String getReportStatus(@RequestParam("type")int type,@RequestParam("time")String time){
        try{
            return ReturnFormat.result(reportMapper.getReportStatus(type,time),"获取报告状态成功");
        }catch (Exception e){
            return ReturnFormat.failed("获取报告状态失败！");
        }
    }

}
