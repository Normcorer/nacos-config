package cn.zyj.nacos.config;

import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Test123 {
    public void test() throws NacosException {
        String configs = SmsConfig.getConfigs("common.name");
        String allConfigs = SmsConfig.getAllConfigs();
        System.out.println(configs);
        System.out.println(allConfigs);
    }
}
