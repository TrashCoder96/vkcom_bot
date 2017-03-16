package com.vkbot.config;

import com.vkbot.services.VkComponent;
import com.vkbot.services.vk.MessagesService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by ivan on 15.03.17.
 */

@Configuration
public class WebConfig {

    @Bean
    public MessagesService vkService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.vk.com/method/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return retrofit.create(MessagesService.class);
    }

    @Bean
    public VkComponent vkComponent() {
        return new VkComponent();
    }

}
