package com.ravi.ex;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	
	@Scheduled(cron = "0 0 0 * * *")
	public void showReport() {
		System.out.println("ReportGenerator.showReport()");
	}

}
