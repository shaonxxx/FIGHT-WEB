package nacos.http;

import nacos.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service1",path = "user")
public interface UserApiHttpClient {

    @RequestMapping("getUser")
    User getUser();
}
