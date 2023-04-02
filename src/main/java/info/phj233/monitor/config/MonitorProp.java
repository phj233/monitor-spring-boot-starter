package info.phj233.monitor.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @projectName: monitor-spring-boot-starter
 * @package: info.phj233.monitorspringbootstarter.config
 * @className: MonitorProp
 * @author: phj233
 * @date: 2023/4/1 22:36
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "monitor")
public class MonitorProp {
    private boolean enable = true;
    private String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJBY2NvdW50SWQiOiJlZWQ4ZmQ1ODBmYTRmNjkyIn0.d7qF_mjdXMC0R5M6f04Lnh6x61kaU4lqHT0Axt9xUOY";

    public boolean isEnable() {
        return enable;
    }
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
}
