package dd.impl;


import dd.api.TestDubboService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TestDubboServiceImpl implements TestDubboService {
    
    @Override
    public String dd() {
        
        return "DDDdddd";
    }
}
