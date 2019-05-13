package com.librarySysDAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import com.librarySys.dao.ClassificationDAO;
import com.sgic.model.Classification;

public class ClassificationDAOimpl implements ClassificationDAO {
	
	private DataSource datasource;
	private DataSource getDatasource() {
		return datasource;
		
	}
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public Classification createClassification(Classification classification) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps =null;
		List<Classification> classificationList=new ArrayList<Classification>();
			try {
				conn=datasource.getConnection();
				String SQL ="INSERT INTO classification(classification_id, classification_name)  VALUE(?,?) ";
				ps=conn.prepareStatement(SQL);
		//		Classification classification=new Classification();
				ps.setInt(2, classification.getClassificationId());
				ps.setString(2,classification.getClassificationName() );
				
				if(ps.executeUpdate()>0) {
			System.out.println("insert successfully with id:");
			}
			}catch (Exception e) {
				e.printStackTrace();
				
			}
			
		return null;
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
	public List<Classification> getClassificationList() {
		// TODO Auto-generated method stub 
		Connection conn=null;
		PreparedStatement ps =null;
		List<Classification> classificationList=new ArrayList<Classification>();
			try {
				conn=datasource.getConnection();
				String SQL ="SELECTY classification_id,classification_name FROM classification ";
				ps=conn.prepareStatement(SQL);
				
				ResultSet rs =ps.executeQuery();
				while (rs.next()) {
					Classification classification=new Classification();
					classification.setClassificationId(rs.getInt("classification_id"));
					classification.setClassificationName(rs.getString("classification_name"));
					classificationList.add(classification);
			}
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
			
		return classificationList;
	}

}
