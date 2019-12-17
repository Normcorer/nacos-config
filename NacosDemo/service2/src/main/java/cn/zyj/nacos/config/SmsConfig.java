package cn.zyj.nacos.config;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.client.config.NacosConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class SmsConfig {



    public static String getConfigs(String key){
        return  getMyContext.getApplicationContext().getEnvironment().getProperty(key);
    }
    public static String getAllConfigs() throws NacosException {
        Properties properties = new Properties();
        properties.put("serverAddr","127.0.0.1:8848");
        ConfigService configService = NacosFactory.createConfigService(properties);
        String content = configService.getConfig("smsconfig.yaml", "SMS_CONFIG_GROUP", 5000);
        return content;
    }

}
