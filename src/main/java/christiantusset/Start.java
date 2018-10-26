package christiantusset;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Start
{
	private static final String ACCOUNT_SID = "";
	private static final String AUTH_TOKEN = "";
	
	public static void main(String[] args) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		for (int i = 0; i < 2; i++)
		{
			Message message = Message.creator(
				new PhoneNumber("whatsapp:+yourNumber"),
				new PhoneNumber("whatsapp:+14155238886"),
				"! " + i)
				.create();
			
			System.out.println(message.getSid());
		}
		
	}
}
