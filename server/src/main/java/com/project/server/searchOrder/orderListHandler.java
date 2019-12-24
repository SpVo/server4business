package com.project.server.searchOrder;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
@RestController
public class orderListHandler {
    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping("/orderlist")
    public List<orderListEntity> orderlist() {
        List<orderListEntity> datalist=new ArrayList<>();
        orderListEntity data1=new orderListEntity();
        data1.setNum("0000000123");
        data1.setName("good1");
        data1.setSendtime("2019-12-20");
        data1.setStorage("Chengdu Local Storage");

        orderListEntity data2=new orderListEntity();
        data2.setNum("0000000125");
        data2.setName("good2");
        data2.setSendtime("2019-12-20");
        data2.setStorage("Beijing Local Storage");
        datalist.add(data1);
        datalist.add(data2);
        return datalist;
    }
}

