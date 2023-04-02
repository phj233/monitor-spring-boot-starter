package info.phj233.monitor.common;

import info.phj233.monitor.config.MonitorProp;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @projectName: monitor-spring-boot-starter
 * @package: info.phj233.monitorspringbootstarter.common
 * @className: IpUtil
 * @author: phj233
 * @date: 2023/4/1 22:58
 * @version: 1.0
 */
@Component
public class IpUtil {
    @Resource
    private MonitorProp monitorProp;
    public String getIpInfo(String ip) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.douyacun.com/api/openapi/geo/location?ip=" + ip+"&token="+ monitorProp.getToken();
        return restTemplate.getForObject(url, String.class);
    }

    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
