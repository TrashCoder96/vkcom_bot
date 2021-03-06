package com.vkbot.rest.ro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ivan on 16.03.17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

    private String id;

    private String user_id;

    private String body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
