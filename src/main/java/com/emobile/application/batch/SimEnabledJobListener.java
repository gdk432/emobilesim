package com.emobile.application.batch;

import javax.batch.runtime.BatchStatus;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class SimEnabledJobListener implements JobExecutionListener{

	@Override
	public void beforeJob(JobExecution jobExecution) {
		if(jobExecution.getStatus().equals(BatchStatus.STARTED)) {
			System.out.println("Batch Process Started");
		}
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if(jobExecution.getStatus().equals(BatchStatus.COMPLETED)) {
			System.out.println("Batch Process comleted sucessfully");
		}
	}
}
