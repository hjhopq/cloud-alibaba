# Spring Cloud Alibaba的简单使用

包括：
* Nacos
    - 服务发现
    - 配置中心
* openFeign
* dubbo

```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-alibaba-dependencies</artifactId>
    <version>2.1.0.RELEASE</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```

## Nacos

### 服务提供者
cloud-provider-8001和cloud-provider-8002
***
__服务发现依赖__
```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
```
启动类使用@EnableDiscoveryClient注解开启服务发现功能。
__application.yml__

配置spring.cloud.nacos相关配置
spring.application.name:名称相同-->集群
更多配置见官方文档

### 服务消费者
cloud-provider-8001/8002和cloud-consumer-80
***
Nacos集成了Ribbon可以实现服务调用与负载均衡

同样于provider的创建，在配置RestTemplate
@Configuration + @Bean + @LoadBalance --> 创建RestTemplate
对于RestTemplate更多的配置，见官方文档。

```java
String url = "http://服务名:端口";
restTemplate.getObject(url + "/test/" + id, String.class);
```
Ribbon默认使用轮询算法进行负载均衡，关于负载均衡算法的设置和自定义，请百度。

### Dubbo
cloud-provider-8001/8002和cloud-dubbo-consumer-80
***
使用dubbo进行服务调用

```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-dubbo</artifactId>
</dependency>
```
该依赖不在spring-cloud-alibaba下


