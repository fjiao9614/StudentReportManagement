package cn.ac.iie.stu.domain;

/**
 * 定义用户
 * @author fujiaojiao
 * @date 2019/03/10 10:47
 */
public class User {
    private long user_id;
    private String name;
    private String passwd;
    private String email;
    private int role;
    private int sex;
    private long birthday;
    private String level;
    private int type;
    private String card_id;
    private String teacher_1;
    private String teacher_2;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getTeacher_1() {
        return teacher_1;
    }

    public void setTeacher_1(String teacher_1) {
        this.teacher_1 = teacher_1;
    }

    public String getTeacher_2() {
        return teacher_2;
    }

    public void setTeacher_2(String teacher_2) {
        this.teacher_2 = teacher_2;
    }
}
