package my.edu.taruc.lab4;

public class Course {

    private String code;
    private String title;
    private String credit;

    //create a instant of this class without assigning any attribute ,eg:no need to create the baby's name unless one week after birth
    public Course() {
    }

    public Course(String code, String title, String credit) {
        this.code = code;
        this.title = title;
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}