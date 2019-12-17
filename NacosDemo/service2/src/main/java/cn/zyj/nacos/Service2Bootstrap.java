package cn.zyj.nacos;

import cn.zyj.nacos.config.SmsConfig;
import cn.zyj.nacos.config.Test123;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service2Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Service2Bootstrap.class, args);
    }
   // @Value("${common.name}")
    //private String name;
    @Autowired
    private Test123 test123;

    @GetMapping("/configs")
    public void getConfigs() throws NacosException {
        test123.test();
    }

//    @GetMapping("/config2")
//    public String getConfigs2(){
//        String name = applicationContext.getEnvironment().getProperty("common.name");
//        String age = applicationContext.getEnvironment().getProperty("common.age");
//        String address = applicationContext.getEnvironment().getProperty("common.adress");
//        String birthday = applicationContext.getEnvironment().getProperty("common.birthday");
//        String fullname = applicationContext.getEnvironment().getProperty("common.fullname");
//        return name+"+"+age+"+"+address+"+"+birthday+"+"+fullname;
//    }
}
