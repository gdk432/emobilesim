package com.emobile.application.batch;

import javax.persistence.EntityManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

public class SimEnableWriter<UserRequest> extends JpaItemWriter<UserRequest>{

	private static final Logger logger = LoggerFactory.getLogger(SimEnableWriter.class);

	@Autowired
	EntityManagerFactory entityManagerFactory;
	

}
