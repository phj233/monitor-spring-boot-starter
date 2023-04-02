package info.phj233.monitor;

import info.phj233.monitor.annotation.MonitorIp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: monitor-spring-boot-starter
 * @package: info.phj233.monitorspringbootstarter
 * @className: TestController
 * @author: phj233
 * @date: 2023/4/2 0:21
 * @version: 1.0
 */
@RestController
public class TestController {

    @MonitorIp
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
