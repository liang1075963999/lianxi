package com.example.liang.lianxi;

import java.util.List;

/**
 * Created by liang on 2018/3/8.
 */

public class CeShiBean {

    private int status;
    private String msg;
    private List<Datashiti> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Datashiti> getData() {
        return data;
    }

    public void setData(List<Datashiti> data) {
        this.data = data;
    }

    public static class Datashiti {

        private int id;
        private String name;
        private String picSmall;
        private String picBig;
        private String description;
        private int learner;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPicSmall() {
            return picSmall;
        }

        public void setPicSmall(String picSmall) {
            this.picSmall = picSmall;
        }

        public String getPicBig() {
            return picBig;
        }

        public void setPicBig(String picBig) {
            this.picBig = picBig;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getLearner() {
            return learner;
        }

        public void setLearner(int learner) {
            this.learner = learner;
        }
    }
}
