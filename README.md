# 配置文件

```yaml
monitor:
  enable: false  		#默认启用
  token: xxxxxxxxxxxxxx #默认具有token,用来获取ip信息
  #默认token具有调用限制,请关注douyacun微信公众号 发送 开通IP定位API 获取token
  
```

在controller 接口方法上通过`@MonitorIp`注解启用ip监控

