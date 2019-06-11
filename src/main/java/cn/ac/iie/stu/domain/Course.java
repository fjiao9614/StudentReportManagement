package cn.ac.iie.stu.domain;

public class Course {
    private long course_id;
    private String title;
    private String grade;
    private long r_id;
    private int c_index;

    public int getC_index() {
        return c_index;
    }

    public void setC_index(int c_index) {
        this.c_index = c_index;
    }

    public long getR_id() {
        return r_id;
    }

    public void setR_id(long r_id) {
        this.r_id = r_id;
    }

    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
