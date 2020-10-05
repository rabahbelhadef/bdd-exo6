package cnam.bdd.models;

import java.util.Date;

public class Statistics {
    private Integer count;
    private Date gender;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    public Date getGender() {
        return gender;
    }

    public void setGender(Date gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "count=" + count +
                ", gender=" + gender +
                '}';
    }
}
