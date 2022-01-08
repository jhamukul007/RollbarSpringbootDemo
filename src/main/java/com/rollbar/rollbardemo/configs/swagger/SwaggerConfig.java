package com.rollbar.rollbardemo.configs.swagger;

import com.rollbar.rollbardemo.configs.properties.AppProperties;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class SwaggerConfig {

    private final AppProperties appProperties;

    @Bean
    public OpenAPI getOpenAPI() {
        return new OpenAPI().info( new Info()
                .title(appProperties.getSwaggerConfig().getTitle())
                .description(appProperties.getSwaggerConfig().getDescription())
                .version(appProperties.getSwaggerConfig().getVersion())
        );
    }
}
