package com.project.server.searchOrder;

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
    public String searchorder(@RequestBody searchRequest request) {
        System.out.println(request.toString());
        return request.toString();
    }
}
