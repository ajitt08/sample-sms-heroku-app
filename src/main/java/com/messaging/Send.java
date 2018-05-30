package com.messaging;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Send {

	public static final String ACCOUNT_SID =
            "ACce85de673336e8b1324a92242e4ea9cc";
    public static final String AUTH_TOKEN =
            "7deadfabd45013ffa79f474ba231e289";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+919972993763"), // to
                        new PhoneNumber("+61428314248"), // from
                        "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}
