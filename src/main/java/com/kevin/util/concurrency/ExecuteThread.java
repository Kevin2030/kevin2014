package com.kevin.util.concurrency;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecuteThread {

	public static void main(String[] args) {
		ScheduledExecutorService service = SchedulerServiceFactory.getInstance();
		service.scheduleWithFixedDelay(GiftService.getSendGiftInstance(), 1l, 2l, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(GiftService.getSendGiftInstance(), 1l, 2l, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(GiftService.getSendGiftInstance(), 1l, 2l, TimeUnit.SECONDS);

		service.execute(GiftService.getRecieveGiftInstance());

	}

}
