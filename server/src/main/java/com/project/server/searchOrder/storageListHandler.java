package com.project.server.searchOrder;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

public class storageListHandler {

    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping("/storagelist")
    public List<storageListEntity> storagelist(@RequestParam int storagenum) {
        System.out.println(storagenum);
        List<storageListEntity> datalist = new ArrayList<>();

        //datalist.add(data1); 测试
       // datalist.add(data2);
        return datalist;
    }
}
