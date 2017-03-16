package com.vkbot.services.vo.messages.getdialogs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ivan on 16.03.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

    private InMessage message;

    public InMessage getMessage() {
        return message;
    }

    public void setMessage(InMessage message) {
        this.message = message;
    }
}
