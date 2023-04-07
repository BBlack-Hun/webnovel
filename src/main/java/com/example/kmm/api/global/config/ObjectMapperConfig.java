package com.example.kmm.api.global.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * ObjectMapperConfig class.
 *
 * <p>
 * date: 2023-02-14
 * </p>
 *
 * @author : 김정훈 파트장
 * @version : V1.0.0
 */
@Component
public class ObjectMapperConfig {

    @Bean
    public static ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
