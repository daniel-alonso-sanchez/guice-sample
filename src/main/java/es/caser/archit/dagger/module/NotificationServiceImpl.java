package es.caser.archit.dagger.module;

import javax.inject.Inject;

import es.caser.archit.dagger.component.IMailSender;

public class NotificationServiceImpl implements INotificationService {	
	private IMailSender sender;
	@Inject
	public NotificationServiceImpl(IMailSender sender) {
		super();
		this.sender = sender;
	}

	public void send() {
		sender.send();
	}

}
