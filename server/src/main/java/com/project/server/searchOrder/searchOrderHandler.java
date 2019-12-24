package com.project.server.searchOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
@RestController
public class searchOrderHandler {

    @CrossOrigin
    @RequestMapping(value="/searchOrder")
    public List<orderListEntity> searchorder(@RequestBody searchRequest request) {
        List<orderListEntity> datalist=new ArrayList<>();
        orderListEntity data1=new orderListEntity();
        data1.setNum("01000002");
        data1.setName("testdata");
        data1.setSendtime("2019-12-24");
        data1.setStorage("Chengdu");
        datalist.add(data1);
        orderListEntity data2=new orderListEntity();
        data2.setNum("01000002");
        data2.setName("testdata");
        data2.setSendtime("2019-12-24");
        data2.setStorage("Chengdu");
        datalist.add(data2);

       System.out.println(request.toString());

      /* request中有接受到的查询条件，类定义在searchRequest.java,
        查询结果添加到datalist
       */
        return datalist;
    }
}
