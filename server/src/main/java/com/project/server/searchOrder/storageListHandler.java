package com.project.server.searchOrder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;

@RestController
public class storageListHandler {

    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping("/storagelist")
    public List<storageListEntity> storagelist(@RequestBody storageRequest storagenum) {
        System.out.println(storagenum.getNum());
        List<storageListEntity> datalist = new ArrayList<>();

        storageListEntity data1=new storageListEntity();
        storageListEntity data2=new storageListEntity();
        storageListEntity data3=new storageListEntity();
        data1.setName("good1");
        data1.setNum("000000021");
        data1.setQuantity("20");
        data1.setType("电子产品");
        data2.setName("good2");
        data2.setNum("000000022");
        data2.setQuantity("20");
        data2.setType("服装");
        data3.setName("good3");
        data3.setNum("000000023");
        data3.setQuantity("20");
        data3.setType("书籍");

        datalist.add(data1);
        datalist.add(data2);
        datalist.add(data3);

        return datalist;
    }
}
