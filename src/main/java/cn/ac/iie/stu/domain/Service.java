package cn.ac.iie.stu.domain;

public class Service {
    private long service_id;
    private int type;
    private String content;
    private int status;
    private int spend_time;
    private int per_num;
    private String per_contribution;
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

    public long getService_id() {
        return service_id;
    }

    public void setService_id(long service_id) {
        this.service_id = service_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSpend_time() {
        return spend_time;
    }

    public void setSpend_time(int spend_time) {
        this.spend_time = spend_time;
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
