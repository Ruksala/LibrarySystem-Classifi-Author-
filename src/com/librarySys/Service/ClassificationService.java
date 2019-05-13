package com.librarySys.Service;

import java.util.List;

import com.sgic.model.Classification;

public interface ClassificationService {
	 public abstract Classification addClassification(Classification classification);
	 public abstract Integer deleteClassification(Integer ClassificationId);
	 public  abstract Classification updateClassification(Integer ClassificationId,Integer classification);
	// public abstract Integer deleteClassification(Integer ClassificationId);
	 public abstract Classification getclassificationById(Integer classificationId);
	 public abstract List<Classification>fetchClassificationList();
	 
}
