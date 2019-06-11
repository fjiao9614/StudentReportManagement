package cn.ac.iie.stu.domain;

public class Intellectual {
    private long intellectual_id;
    private String title;
    private int status;
    private String authors;
    private int type;
    private int per_num;
    private String per_contribution;
    private long r_id;
    private int i_index;

    public int getI_index() {
        return i_index;
    }

    public void setI_index(int i_index) {
        this.i_index = i_index;
    }

    public long getR_id() {
        return r_id;
    }

    public void setR_id(long r_id) {
        this.r_id = r_id;
    }

    public long getIntellectual_id() {
        return intellectual_id;
    }

    public void setIntellectual_id(long intellectual_id) {
        this.intellectual_id = intellectual_id;
    }

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
