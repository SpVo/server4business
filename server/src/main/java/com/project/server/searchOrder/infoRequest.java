package com.project.server.searchOrder;

import com.fasterxml.jackson.annotation.JsonProperty;


public class infoRequest {
    @JsonProperty(value="num")
    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
