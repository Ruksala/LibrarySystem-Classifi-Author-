package com.librarySys;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarySys.Service.ClassificationService;
import com.sgic.model.Classification;


public class Test {
public static void main(String args[]) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
//	
	ClassificationService classificationService = context.getBean("classificationService",ClassificationService.class);

 Classification classification= new Classification();
	classification.setClassificationId(1);
	classification.setClassificationName("maths");
	
	//classificationService.addClassification(classification);
	
	for(Classification classificationList:classificationService.fetchClassificationList()) {
		System.out.println(classificationList.getClassificationId()+ " " + classificationList.getClassificationName());
	}
	}
}

