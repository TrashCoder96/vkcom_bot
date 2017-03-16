package com.vkbot.rest;

import com.vkbot.rest.ro.ConfirmationRo;
import com.vkbot.services.VkComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by ivan on 16.03.17.
 */

@RestController
public class CallbackController {

    @Autowired
    private VkComponent vkComponent;

    @RequestMapping(value = "/call", method = RequestMethod.POST)
    public String call(@RequestBody ConfirmationRo request) throws IOException {
        vkComponent.sendMessage(request.getObject().getBody(), request.getObject().getUser_id());
        return "c28219b6";
    }

}
