package all.yy.cloud.controller;

import all.yy.cloud.feign.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;
    
    @RequestMapping("/kk")
    public String tt(){
        return testService.tt();
    }
    
}
