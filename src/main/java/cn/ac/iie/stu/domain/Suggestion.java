package cn.ac.iie.stu.domain;

public class Suggestion {
    private long sug_id;
    private String content;
    private long r_id;
    private int s_index;

    public int getS_index() {
        return s_index;
    }

    public void setS_index(int s_index) {
        this.s_index = s_index;
    }

    public long getR_id() {return r_id; }

    public void setR_id(long r_id) {this.r_id = r_id; }
    public long getSug_id() {
        return sug_id;
    }

    public void setSug_id(long sug_id) {
        this.sug_id = sug_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
