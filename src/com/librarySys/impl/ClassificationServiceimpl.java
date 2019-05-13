package com.librarySys.impl;

import java.util.List;

import com.librarySys.Service.ClassificationService;
import com.librarySys.dao.ClassificationDAO;
import com.sgic.model.Classification;

public class ClassificationServiceimpl implements ClassificationService{
	private ClassificationDAO classificationDAO;

	public void setClassificationDAO(ClassificationDAO classificationDAO) {
		this.classificationDAO = classificationDAO;
	}

	@Override
	public Classification addClassification(Classification classification) {
		return classificationDAO.createClassification(classification);
	}

	@Override
	public Integer deleteClassification(Integer ClassificationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification updateClassification(Integer ClassificationId, Integer classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification getclassificationById(Integer classificationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Classification> fetchClassificationList() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
