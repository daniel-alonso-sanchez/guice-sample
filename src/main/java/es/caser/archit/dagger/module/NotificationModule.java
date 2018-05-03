package es.caser.archit.dagger.module;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import es.caser.archit.dagger.component.IMailSender;
import es.caser.archit.dagger.component.MailSenderImpl;


public class NotificationModule extends AbstractModule {
	@Provides
	@Singleton
	INotificationService provideBackendService(IMailSender sender) {
		return new NotificationServiceImpl(sender);
	}
	@Provides
	IMailSender provideSender(){
		return new MailSenderImpl();
	}
	
}
