package com.vkbot.services;

import com.vkbot.services.vk.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by ivan on 15.03.17.
 */

@Component
public class VkComponent {

    @Autowired
    private MessagesService messagesService;

    @Value("${vk.token}")
    private String token;

    public void sendMessage(String message, String id) throws IOException {
        messagesService.sendMessage(token, id, null, message).execute();
    }

}
