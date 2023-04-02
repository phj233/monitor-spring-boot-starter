# 配置文件

```yaml
monitor:
  enable: false  		#默认启用
  token: xxxxxxxxxxxxxx #默认具有token,用来获取ip信息
  #默认token具有调用限制,请关注douyacun微信公众号 发送 开通IP定位API 获取token
  
```



# 使用

在controller 接口方法上通过`@MonitorIp`注解启用ip监控

## 通过Github仓库引入

添加Github仓库

```groovy
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/phj233/monitor-spring-boot-starter")
        credentials {
            username = "phj233"
            password = "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"
        }
    }
}
```

引入依赖

```groovy
implementation 'info.phj233:monitor-spring-boot-starter:0.0.1-SNAPSHOT'
```



## 本地引入

`build.gradle` 同级新建 `libs`文件夹，后对`build.gradle`进行修改

```groovy
implementation fileTree(dir: 'libs', include: ['*.jar'])
```

[RELEASE下载依赖](https://github.com/phj233/monitor-spring-boot-starter/releases/tag/monitor-spring-boot-starter) 放进 `libs`

