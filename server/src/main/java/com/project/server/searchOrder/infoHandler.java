package com.project.server.searchOrder;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@RestController
public class infoHandler {
    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping("/info")
    public List<infoEntity> info(@RequestBody infoRequest request) {
        List<infoEntity> datalist= new ArrayList<>();
        System.out.print(request.getNum());
        infoEntity data1=new infoEntity();
        data1.setContent("发货");
        data1.setTimestamp("2019-12-24");
        infoEntity data2=new infoEntity();
        data2.setContent("中转");
        data2.setTimestamp("2019-12-25");
        infoEntity data3=new infoEntity();
        data3.setContent("收货");
        data3.setTimestamp("2019-12-26");
        datalist.add(data1);
        datalist.add(data2);
        datalist.add(data3);
        return datalist;
    }
}
