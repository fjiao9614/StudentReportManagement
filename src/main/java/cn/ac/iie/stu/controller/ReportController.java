package cn.ac.iie.stu.controller;


import cn.ac.iie.stu.domain.*;

import cn.ac.iie.stu.mapper.ReportMapper;
import cn.ac.iie.stu.service.ReportService;
import cn.ac.iie.stu.utils.ReturnFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/report")

public class ReportController {
    @Autowired
    private ReportMapper reportService;
//    private ReportService reportService;

    /**
     * 根据报告id（r_id）查询报告内容
     */
    @PostMapping(value = "/report",produces = "application/json;charset=UTF-8")
    public String showReport(@RequestParam("r_id") long r_id) {
        try {
            return ReturnFormat.result(reportService.showReport(r_id),"查询报告内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询报告内容失败");
        }
    }

    @PostMapping(value = "/academic",produces = "application/json;charset=UTF-8")
    public String showAcademic(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            return ReturnFormat.result(reportService.showAcademic(r_id,index),"查询学术成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询学术成果内容失败");
        }
    }
    @PostMapping(value = "/competition",produces = "application/json;charset=UTF-8")
    public String showCompetition(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            return ReturnFormat.result(reportService.showCompetition(r_id,index),"查询竞赛成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询竞赛成果内容失败");
        }
    }
    @PostMapping(value = "/course",produces = "application/json;charset=UTF-8")
    public String showCourse(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            return ReturnFormat.result(reportService.showCourse(r_id,index),"查询课程成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询课程成果内容失败");
        }
    }

    @PostMapping(value = "/intellectual",produces = "application/json;charset=UTF-8")
    public String showIntellectual(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            return ReturnFormat.result(reportService.showIntellectual(r_id,index),"查询知识产权成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询知识产权内容失败");
        }
    }

    @PostMapping(value = "/research",produces = "application/json;charset=UTF-8")
    public String showResearch(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            return ReturnFormat.result(reportService.showResearch(r_id,index),"查询调研成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询调研成果内容失败");
        }
    }

    @PostMapping(value = "/service",produces = "application/json;charset=UTF-8")
    public String showService(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            return ReturnFormat.result(reportService.showService(r_id,index),"查询支撑服务成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询支撑服务内容失败");
        }
    }

    @PostMapping(value = "/suggestion",produces = "application/json;charset=UTF-8")
    public String showSuggestion(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            return ReturnFormat.result(reportService.showSuggestion(r_id,index),"查询建议内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询建议内容失败");
        }
    }

    @PostMapping(value = "/technology",produces = "application/json;charset=UTF-8")
    public String showTechnology(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            return ReturnFormat.result(reportService.showTechnology(r_id,index),"查询工程成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("查询工程成果内容失败");
        }
    }


    //增加操作
    @PutMapping(value = "/add_report",produces = "application/json;charset=UTF-8")
    public String addReport(@RequestBody Report report) {
        try {

            reportService.addReport(report);
            return ReturnFormat.success("增加报告内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加报告内容失败");
        }
    }

    //增加操作
    @PutMapping(value = "/add_academic",produces = "application/json;charset=UTF-8")
    public String addAcademic(@RequestBody Academic academic) {
        try {

            reportService.addAcademic(academic);
            return ReturnFormat.success("增加学术成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加学术成果内容失败");
        }
    }
    @PutMapping(value = "/add_competition",produces = "application/json;charset=UTF-8")
    public String addCompetition(@RequestBody Competition competition) {
        try {

            reportService.addCompetition(competition);
            return ReturnFormat.success("增加竞赛成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加竞赛成果内容失败");
        }
    }
    @PutMapping(value = "/add_course",produces = "application/json;charset=UTF-8")
    public String addCourse(@RequestBody Course course) {
        try {

            reportService.addCourse(course);
            return ReturnFormat.success("增加课程学习内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加课程学习内容失败");
        }
    }
    @PutMapping(value = "/add_intellectual",produces = "application/json;charset=UTF-8")
    public String addIntellectual(@RequestBody Intellectual intellectual) {
        try {

            reportService.addIntellectual(intellectual);
            return ReturnFormat.success("增加知识产权内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加知识产权内容失败");
        }
    }
    @PutMapping(value = "/add_research",produces = "application/json;charset=UTF-8")
    public String addResearch(@RequestBody Research research) {
        try {

            reportService.addResearch(research);
            return ReturnFormat.success("增加调研成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加调研成果内容失败");
        }
    }
    @PutMapping(value = "/add_service",produces = "application/json;charset=UTF-8")
    public String addService(@RequestBody Service service) {
        try {

            reportService.addService(service);
            return ReturnFormat.success("增加支撑服务内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加支撑服务内容失败");
        }
    }
    @PutMapping(value = "/add_suggestion",produces = "application/json;charset=UTF-8")
    public String addSuggestion(@RequestBody Suggestion suggestion) {
        try {

            reportService.addSuggestion(suggestion);
            return ReturnFormat.success("增加建议内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加建议内容失败");
        }
    }
    @PutMapping(value = "/add_technology",produces = "application/json;charset=UTF-8")
    public String addTechnology(@RequestBody Technology technology) {
        try {

            reportService.addTechnology(technology);
            return ReturnFormat.success("增加工程成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("增加工程成果内容失败");
        }
    }


    @PutMapping(value = "/up_report",produces = "application/json;charset=UTF-8")
    public String upReport(@RequestBody Report report) {
        try {

            reportService.upReport(report);
            return ReturnFormat.success("更新报告内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新报告内容失败");
        }
    }

    @PutMapping(value = "/up_academic",produces = "application/json;charset=UTF-8")
    public String upAcademic(@RequestBody Academic academic) {
        try {

            reportService.upAcademic(academic);
            return ReturnFormat.success("更新学术成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新学术成果内容失败");
        }
    }

    @PutMapping(value = "/up_competition",produces = "application/json;charset=UTF-8")
    public String upCompetition(@RequestBody Competition competition) {
        try {

            reportService.upCompetition(competition);
            return ReturnFormat.success("更新竞赛成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新竞赛成果内容失败");
        }
    }
    @PutMapping(value = "/up_course",produces = "application/json;charset=UTF-8")
    public String upCourse(@RequestBody Course course) {
        try {

            reportService.upCourse(course);
            return ReturnFormat.success("更新课程学习内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新课程学习内容失败");
        }
    }
    @PutMapping(value = "/up_intellectual",produces = "application/json;charset=UTF-8")
    public String upIntellectual(@RequestBody Intellectual intellectual) {
        try {

            reportService.upIntellectual(intellectual);
            return ReturnFormat.success("更新知识产权内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新知识产权内容失败");
        }
    }
    @PutMapping(value = "/up_research",produces = "application/json;charset=UTF-8")
    public String upResearch(@RequestBody Research research) {
        try {

            reportService.upResearch(research);
            return ReturnFormat.success("更新调研成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新调研成果内容失败");
        }
    }
    @PutMapping(value = "/up_service",produces = "application/json;charset=UTF-8")
    public String upService(@RequestBody Service service) {
        try {

            reportService.upService(service);
            return ReturnFormat.success("更新支撑服务内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新支撑服务内容失败");
        }
    }
    @PutMapping(value = "/up_suggestion",produces = "application/json;charset=UTF-8")
    public String upSuggestion(@RequestBody Suggestion suggestion) {
        try {

            reportService.upSuggestion(suggestion);
            return ReturnFormat.success("更新建议内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新建议内容失败");
        }
    }
    @PutMapping(value = "/up_technology",produces = "application/json;charset=UTF-8")
    public String upTechnology(@RequestBody Technology technology) {
        try {

            reportService.upTechnology(technology);
            return ReturnFormat.success("更新工程成果内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("更新工程成果内容失败");
        }
    }



//    删除操作
    @PostMapping(value = "/del_academic",produces = "application/json;charset=UTF-8")
    public String delAcademic(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportService.delAcademic(r_id,index);
            return ReturnFormat.success("删除学术成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除学术成果内容失败");
        }
    }
    @PostMapping(value = "/del_competition",produces = "application/json;charset=UTF-8")
    public String delCompetition(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportService.delCompetition(r_id,index);
            return ReturnFormat.success("删除竞赛成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除竞赛成果内容失败");
        }
    }
    @PostMapping(value = "/del_course",produces = "application/json;charset=UTF-8")
    public String delCourse(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportService.delCourse(r_id,index);
            return ReturnFormat.success("删除课程成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除课程成果内容失败");
        }
    }

    @PostMapping(value = "/del_intellectual",produces = "application/json;charset=UTF-8")
    public String delIntellectual(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportService.delIntellectual(r_id,index);
            return ReturnFormat.success("删除知识产权成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除知识产权内容失败");
        }
    }

    @PostMapping(value = "/del_research",produces = "application/json;charset=UTF-8")
    public String delResearch(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportService.delResearch(r_id,index);
            return ReturnFormat.success("删除调研成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除调研成果内容失败");
        }
    }

    @PostMapping(value = "/del_service",produces = "application/json;charset=UTF-8")
    public String delService(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportService.delService(r_id,index);
            return ReturnFormat.success("删除支撑服务成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除支撑服务内容失败");
        }
    }

    @PostMapping(value = "/del_suggestion",produces = "application/json;charset=UTF-8")
    public String delSuggestion(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportService.delSuggestion(r_id,index);
            return ReturnFormat.success("删除建议内容成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除建议内容失败");
        }
    }

    @PostMapping(value = "/del_technology",produces = "application/json;charset=UTF-8")
    public String delTechnology(@RequestParam("r_id") long r_id,@RequestParam("index") int index) {
        try {
            reportService.delTechnology(r_id,index);
            return ReturnFormat.success("删除工程成果成功");

        } catch (Exception e) {
            return ReturnFormat.failed("删除工程成果内容失败");
        }
    }








    @PostMapping(value = "/get_reportId",produces = "application/json;charset=UTF-8")
    public String getReportId(@RequestParam("type")int type,@RequestParam("time")String time){
        try{
            return ReturnFormat.result(reportService.getReportId(type,time),"获取报告ID成功");
        }catch (Exception e){
            return ReturnFormat.failed("获取报告ID失败！");
        }
    }

    @PostMapping(value = "/get_reportStatus",produces = "application/json;charset=UTF-8")
    public String getReportStatus(@RequestParam("type")int type,@RequestParam("time")String time){
        try{
            return ReturnFormat.result(reportService.getReportStatus(type,time),"获取报告状态成功");
        }catch (Exception e){
            return ReturnFormat.failed("获取报告状态失败！");
        }
    }

}
