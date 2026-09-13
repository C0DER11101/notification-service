package com.jsp.notification_service.service.impl;

import com.jsp.notification_service.comm.Communication;
import com.jsp.notification_service.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {

    Communication communication;

    @Override
    public void processSendMessage(String toPhoneNumber) {
        communication.sendSMS(toPhoneNumber);
    }
}
