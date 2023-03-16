package com.mtit.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PublisherServiceActivator implements BundleActivator {
	ServiceRegistration<?> publiServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("SPORT STATS SERVICE STARTED");
		ServicePublish publisherService = new ServicePublishImpl();
		publiServiceRegistration = context.registerService(ServicePublish.class.getName(), publisherService, null);
	}
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Publisher stoped!");
		publiServiceRegistration.unregister();	
	} 
}
