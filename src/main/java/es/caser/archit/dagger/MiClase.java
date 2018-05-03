package es.caser.archit.dagger;

import com.google.inject.Guice;
import com.google.inject.Injector;

import es.caser.archit.dagger.module.INotificationService;
import es.caser.archit.dagger.module.NotificationModule;

public class MiClase {
	
	public static void main(String[] args) {
		 Injector injector = Guice.createInjector(new NotificationModule());
		 INotificationService billingService = injector.getInstance(INotificationService.class);
		 billingService.send();
	}
}
