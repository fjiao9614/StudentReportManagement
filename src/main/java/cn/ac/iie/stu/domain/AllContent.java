package cn.ac.iie.stu.domain;

import java.util.List;

public class AllContent {
    Report report;
    List<Academic> academics;
    List<Competition> competitions;
    List<Course> courses;
    List<Intellectual> intellectuals;
    List<Research> researches;
    List<Service> services;
    List<Suggestion> suggestions;
    List<Technology> technologies;

    public AllContent() {
    }

    public AllContent(Report report, List<Academic> academics, List<Competition> competitions, List<Course> courses, List<Intellectual> intellectuals, List<Research> researches, List<Service> services, List<Suggestion> suggestions, List<Technology> technologies) {
        this.report = report;
        this.academics = academics;
        this.competitions = competitions;
        this.courses = courses;
        this.intellectuals = intellectuals;
        this.researches = researches;
        this.services = services;
        this.suggestions = suggestions;
        this.technologies = technologies;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public List<Academic> getAcademics() {
        return academics;
    }

    public void setAcademics(List<Academic> academics) {
        this.academics = academics;
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Intellectual> getIntellectuals() {
        return intellectuals;
    }

    public void setIntellectuals(List<Intellectual> intellectuals) {
        this.intellectuals = intellectuals;
    }

    public List<Research> getResearches() {
        return researches;
    }

    public void setResearches(List<Research> researches) {
        this.researches = researches;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }
}
