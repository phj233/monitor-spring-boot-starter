package info.phj233.monitor.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

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
public class MonitorAutoConfigure {
}
