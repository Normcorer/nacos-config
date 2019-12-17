package cn.zyj.nacos.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class getMyContext implements ApplicationContextAware {
    @Autowired
    private static ConfigurableApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext= (ConfigurableApplicationContext) applicationContext;
    }
    public static ConfigurableApplicationContext getApplicationContext(){
        return applicationContext;
    }
}
