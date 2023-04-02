package info.phj233.monitor.config;

import info.phj233.monitor.aspect.MonitorIpAspect;
import info.phj233.monitor.common.IpUtil;
import info.phj233.monitor.service.MonitorService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @projectName: monitor-spring-boot-starter
 * @package: info.phj233.monitorspringbootstarter.config
 * @className: MonitorAutoConfigure
 * @author: phj233
 * @date: 2023/4/1 21:44
 * @version: 1.0
 */
@Configuration
@EnableConfigurationProperties(MonitorProp.class)
@EnableAspectJAutoProxy
@Import({MonitorIpAspect.class})
public class MonitorAutoConfigure {
    @Bean
    public MonitorService monitorService() {
        return new MonitorService();
    }
    @Bean
    public IpUtil ipUtil() {
        return new IpUtil();
    }
}
