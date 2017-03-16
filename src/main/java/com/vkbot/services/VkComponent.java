package com.vkbot.services;

import com.vkbot.services.vk.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

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

    public void sendMessageToUsers(String message, List<String> ids) {
        String user_ids = "";
        for (String id: ids) {
            user_ids += id;
        }
        messagesService.sendMessage(token, null, user_ids, message);
    }

}
