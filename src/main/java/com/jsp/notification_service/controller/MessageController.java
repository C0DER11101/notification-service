package com.jsp.notification_service.controller;

import com.jsp.notification_service.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MessageController {

    MessageService msgService;

    @PostMapping(value = "/sendSMS/{phone}")
    public void sendMessage(@PathVariable("phone") String toPhoneNumber) {
        msgService.processSendMessage(toPhoneNumber);
    }
}