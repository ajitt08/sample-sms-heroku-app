package com.messaging;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Send {

	public static final String ACCOUNT_SID =
            "AC0d713691076371f028f013779b757ebd";
    public static final String AUTH_TOKEN =
            "e6ecbbb4a907cf921de805dcdff8a6de";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+919740869068"), // to
                        new PhoneNumber("+19498294890"), // from
                        "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}
