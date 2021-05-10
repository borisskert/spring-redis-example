package de.borisskert.spring.springredisexample.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisProperties {
    private Integer port;
    private String host;

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    @Deprecated()
    public void setPort(Integer port) {
        this.port = port;
    }

    @Deprecated()
    public void setHost(String host) {
        this.host = host;
    }
}
