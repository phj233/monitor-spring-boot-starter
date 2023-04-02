package info.phj233.monitor.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @projectName: monitor-spring-boot-starter
 * @package: info.phj233.monitorspringbootstarter.annotation
 * @className: MonitorIp
 * @author: phj233
 * @date: 2023/4/1 22:08
 * @version: 1.0
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MonitorIp {

}
