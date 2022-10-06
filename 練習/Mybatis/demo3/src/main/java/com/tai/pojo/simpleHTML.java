package com.tai.pojo;

public class simpleHTML {
    private int id;
    private String partnumber;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "simpleHTML{" +
                "id=" + id +
                ", partnumber='" + partnumber + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
