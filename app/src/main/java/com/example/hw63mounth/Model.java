package com.example.hw63mounth;

public class Model {
    private String text1;

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    private String text2;
    private String name;
    private String time;
    private Integer keyId;

    public Model(String text1, String name, String time , String text2) {
        this.text1 = text1;
        this.text2 = text2;
        this.name = name;
        this.time = time;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }
}
