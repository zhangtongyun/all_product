package all.yy.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "cloud-service")
public interface TestService {
    
    @RequestMapping("/dd")
    String tt();
}
