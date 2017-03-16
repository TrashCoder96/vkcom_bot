package com.vkbot.rest.ro;

/**
 * Created by ivan on 16.03.17.
 */
public class ConfirmationRo {

    private String type;

    private String group_id;

    private Message object;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public Message getObject() {
        return object;
    }

    public void setObject(Message object) {
        this.object = object;
    }
}
