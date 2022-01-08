package com.rollbar.rollbardemo.configs.rollbar;

import com.rollbar.notifier.Rollbar;
import com.rollbar.notifier.config.Config;
import com.rollbar.notifier.config.ConfigBuilder;
import com.rollbar.rollbardemo.configs.properties.AppProperties;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class RollbarConfiguration {

    private final AppProperties appProperties;

    @Bean(name = "rollbar")
    public Rollbar getRollbar() {
        return new Rollbar(getConfig());
    }

    public Config getConfig() {
        String token = appProperties.getRollbarConfig().getAccessToken();
        return ConfigBuilder.withAccessToken(token)
                .environment(appProperties.getRollbarConfig().getEnvironment()).build();
    }

}
