package cn.ac.iie.stu.domain;

public class Technology {
    private long technology_id;
    private String project_name;
    private String module_name;
    private int code_amount;
    private int commit_bug;
    private int resolve_bug;
    private int t_index;
    private long r_id;

    public int getT_index() {
        return t_index;
    }

    public void setT_index(int t_index) {
        this.t_index = t_index;
    }



    public long getR_id() {return r_id; }

    public void setR_id(long r_id) {this.r_id = r_id; }
    public long getTechnology_id() {
        return technology_id;
    }

    public void setTechnology_id(long technology_id) {
        this.technology_id = technology_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public int getCode_amount() {
        return code_amount;
    }

    public void setCode_amount(int code_amount) {
        this.code_amount = code_amount;
    }

    public int getCommit_bug() {
        return commit_bug;
    }

    public void setCommit_bug(int commit_bug) {
        this.commit_bug = commit_bug;
    }

    public int getResolve_bug() {
        return resolve_bug;
    }

    public void setResolve_bug(int resolve_bug) {
        this.resolve_bug = resolve_bug;
    }
}
