package com.rollbar.rollbardemo.configs.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class AppProperties {

    private final RollbarConfig rollbarConfig = new RollbarConfig();
    private final SwaggerConfig swaggerConfig = new SwaggerConfig();

    @Getter
    @Setter
    public static class RollbarConfig {
        private String accessToken;
        private String environment;
    }

    @Getter
    @Setter
    public static class SwaggerConfig {
        private String title;
        private String description;
        private String version;
    }
}
