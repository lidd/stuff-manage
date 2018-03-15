package com.feifan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class StuffManageApplication {


	public static void main(String[] args) {
		/*ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
		executor.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out.println("执行了...");
			}
		},5,10, TimeUnit.SECONDS);*/
		SpringApplication.run(StuffManageApplication.class, args);
	}
}
