package cn.ac.iie.stu.domain;

public class Academic {
    private long academic_id;
    private long r_id;


    private String title;
    private int status;
    private String authors;
    private String details;
    private int per_num;
    private String per_contribution;
    private int a_index;

    public int getA_index() {
        return a_index;
    }

    public void setA_index(int a_index) {
        this.a_index = a_index;
    }

    public long getAcademic_id() {
        return academic_id;
    }

    public void setAcademic_id(long academic_id) {
        this.academic_id = academic_id;
    }
    public long getR_id() { return r_id; }
    public void setR_id(long r_id) { this.r_id = r_id; }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPer_num() {
        return per_num;
    }

    public void setPer_num(int per_num) {
        this.per_num = per_num;
    }

    public String getPer_contribution() {
        return per_contribution;
    }

    public void setPer_contribution(String per_contribution) {
        this.per_contribution = per_contribution;
    }
}
