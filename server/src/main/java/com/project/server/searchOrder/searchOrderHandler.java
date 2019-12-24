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


        return datalist;
    }
}
