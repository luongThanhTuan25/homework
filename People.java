
package Ass10_Home_Work;

import java.util.*;

public class People {
    private String name;
    private Date date;
    private String sex;
    private int id;

    public People(String name, Date date, String sex, int id) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.id = id;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void input(){
        
    }
}
