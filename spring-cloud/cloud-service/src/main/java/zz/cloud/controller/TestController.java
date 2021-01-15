package zz.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/dd")
    public String tt(){
        System.out.println("uuuuuiiiii");
        return "oooo";
    }

}
