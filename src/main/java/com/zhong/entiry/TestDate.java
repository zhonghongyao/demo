package com.zhong.entiry;

import java.io.Serializable;
import java.util.Date;

public class TestDate implements Serializable {
    private int id;
    private Date create_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
