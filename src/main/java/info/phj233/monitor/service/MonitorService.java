package info.phj233.monitor.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import info.phj233.monitor.common.IpUtil;
import info.phj233.monitor.config.MonitorProp;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @projectName: monitor-spring-boot-starter
 * @package: info.phj233.monitorspringbootstarter.service
 * @className: MonitorService
 * @author: phj233
 * @date: 2023/4/1 23:28
 * @version: 1.0
 */
@Service
public class MonitorService {
    @Resource
    ObjectMapper objectMapper;
    @Resource
    MonitorProp monitorProp;
    @Resource
    IpUtil ipUtil;
    public void sendDetails(String ip, String url) throws JsonProcessingException {
        if (monitorProp.isEnable()) {
            String ipInfo = ipUtil.getIpInfo(ip);
            JsonNode jsonNode = objectMapper.readTree(ipInfo);
            String country = jsonNode.get("data").get("country").asText();
            String city = jsonNode.get("data").get("city").asText();
            String message =
                    """
                    在%s-%s的%s访问了%s
                    """.formatted(country, city, ip, url);
            System.out.println(message);
        }
    }

}
