package com.messaging;

import static spark.Spark.*;

import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.messaging.Body;
import com.twilio.twiml.messaging.Message;

public class SendAndReceive {

	public static void main(String[] args) {
		
		get("/", (req, res) -> "Hello User!!");
		
		post("/sms", (req, res) -> {
			System.out.println("We got req from user :"+req.body());
            res.type("application/xml");
            Body body = new Body
                    .Builder("The Robots are coming! Head for the hills!")
                    .build();
            Message sms = new Message
                    .Builder()
                    .body(body)
                    .build();
            MessagingResponse twiml = new MessagingResponse
                    .Builder()
                    .message(sms)
                    .build();
            return twiml.toXml();
        });
		
	}
}
