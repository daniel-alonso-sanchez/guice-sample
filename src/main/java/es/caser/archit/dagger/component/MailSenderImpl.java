package es.caser.archit.dagger.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MailSenderImpl implements IMailSender {
	private static final Logger logger = LoggerFactory.getLogger(MailSenderImpl.class);
	public void send() {
		logger.info("ola ke ase");
	}

}
