package cn.ac.iie.stu.domain;


public class Competition {
    private long competition_id;
    private String title;
    private String award;
    private String rank;
    private int per_num;
    private long r_id;
    private int c_index;

    public int getC_index() {
        return c_index;
    }

    public void setC_index(int c_index) {
        this.c_index = c_index;
    }

    public long getR_id() {return r_id; }

    public void setR_id(long r_id) {this.r_id = r_id; }

    public long getCompetition_id() {
        return competition_id;
    }

    public void setCompetition_id(long competition_id) {
        this.competition_id = competition_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getPer_num() {
        return per_num;
    }

    public void setPer_num(int per_num) {
        this.per_num = per_num;
    }
}
