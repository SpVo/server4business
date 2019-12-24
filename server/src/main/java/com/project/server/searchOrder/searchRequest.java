package com.project.server.searchOrder;

import com.fasterxml.jackson.annotation.JsonProperty;




public class searchRequest {

    @JsonProperty(value="num")
    private String num;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "type")
    private String type;
    @JsonProperty(value = "storage")
    private String stor;
    @JsonProperty(value = "date1")
    private String data1;
    @JsonProperty(value = "date2")
    private  String data2;
    @JsonProperty(value = "province")
    private  String province;
    @JsonProperty(value = "city")
    private String city;
    @JsonProperty(value = "district")
    private  String district;
    @JsonProperty(value = "address")
    private String address;
    @JsonProperty(value = "desc")
    private  String note;


    public String toString(){
        return "num:"+num+" name:"+name+" type:"+type+" storage:"+stor+" date1:"+data1+" data2:"+data2;
    }
}

