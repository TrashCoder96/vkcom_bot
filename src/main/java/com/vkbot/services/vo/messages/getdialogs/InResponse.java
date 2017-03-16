package com.vkbot.services.vo.messages.getdialogs;

import java.util.List;

/**
 * Created by ivan on 16.03.17.
 */
public class InResponse {

    private String count;

    private List<Message> items;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<Message> getItems() {
        return items;
    }

    public void setItems(List<Message> items) {
        this.items = items;
    }
}
