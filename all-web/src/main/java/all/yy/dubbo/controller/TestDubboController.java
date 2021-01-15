package all.yy.dubbo.controller;

import dd.api.TestDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDubboController {
    
    @DubboReference
    private TestDubboService testDubboService;
    
    @RequestMapping("/dd")
    public String dd(){
        
        return testDubboService.dd();
    }
    
}
