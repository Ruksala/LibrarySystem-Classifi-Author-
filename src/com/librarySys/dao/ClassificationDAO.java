package com.librarySys.dao;

import java.util.List;

import com.sgic.model.Classification;

public interface ClassificationDAO {
	
		 public abstract Classification createClassification(Classification classification);
		 public abstract Integer deleteClassification(Integer ClassificationId);
		 public  abstract Classification updateClassification(Integer ClassificationId,Integer classification);
		// public abstract Integer deleteClassification(Integer ClassificationId);
		 public abstract Classification getclassificationById(Integer classificationId);
		 public abstract List<Classification>getClassificationList();
		 
		 
}
