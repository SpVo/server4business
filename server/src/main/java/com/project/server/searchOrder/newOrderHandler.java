package com.project.server.searchOrder;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
    @RestController
    public class newOrderHandler {
        @CrossOrigin(origins = "http://localhost:8081")
        @RequestMapping("/newOrder")
        public String neworder(@RequestBody Neworder neworder) {
            System.out.println(neworder.toString());

            return neworder.toString();
    }
}

