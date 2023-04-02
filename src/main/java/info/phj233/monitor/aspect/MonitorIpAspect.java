package info.phj233.monitor.aspect;

import info.phj233.monitor.common.IpUtil;
import info.phj233.monitor.service.MonitorService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @projectName: monitor-spring-boot-starter
 * @package: info.phj233.monitorspringbootstarter.aspect
 * @className: MonitorIpAspect
 * @author: phj233
 * @date: 2023/4/1 22:19
 * @version: 1.0
 */
@Aspect
@Component
public class MonitorIpAspect {
    @Resource
    private MonitorService monitorService;
    @Pointcut("@annotation(info.phj233.monitor.annotation.MonitorIp)")
    public void pointcut() {
    }
    Logger logger = org.slf4j.LoggerFactory.getLogger(MonitorIpAspect.class);

    @Around("pointcut()")
    public Object doAfterReturning(ProceedingJoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            HttpServletRequest request = attributes.getRequest();
            String ip = IpUtil.getIpAddr(request);
            String url = request.getRequestURL().toString();
            monitorService.sendDetails(ip, url);
            logger.info("ip: " + ip + " url: " + url);

        }else {
            System.out.println("未获取到attributes");
        }
        return joinPoint.proceed();
    }

}
