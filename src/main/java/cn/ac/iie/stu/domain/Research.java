package cn.ac.iie.stu.domain;

public class Research {
    private long research_id;
    private String title;
    private String chapter;
    private int status;
    private String authors;
    private int per_num;
    private String per_contribution;
    private long r_id;
    private int r_index;

    public int getR_index() {
        return r_index;
    }

    public void setR_index(int r_index) {
        this.r_index = r_index;
    }

    public long getR_id() {
        return r_id;
    }

    public void setR_id(long r_id) {
        this.r_id = r_id;
    }

    public long getResearch_id() {
        return research_id;
    }

    public void setResearch_id(long research_id) {
        this.research_id = research_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
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
