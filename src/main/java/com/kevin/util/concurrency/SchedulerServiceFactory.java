package com.kevin.util.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class SchedulerServiceFactory {

	private static final int corePoolSize = 30;
	private static ScheduledExecutorService instance = Executors.newScheduledThreadPool(corePoolSize);

	public static ScheduledExecutorService getInstance() {
		return instance;
	}

}
