package com.jsp.notification_service.comm;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Repository;

@Repository
public class Communication {
    private static final String TWILIO_ACC_SID = "<Your Twilio account SID>";
    private static final String TWILIO_AUTH_TOKEN = "<Your Twilio account authentication token>";

    public void sendSMS(String toPhoneNumber) {
        Twilio.init(TWILIO_ACC_SID, TWILIO_AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber(toPhoneNumber), new PhoneNumber("+17372508034"), "sms_appointment_reminders")
                .create();

        System.out.println(message.getSid());
    }
}