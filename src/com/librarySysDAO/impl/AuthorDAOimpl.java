package com.librarySysDAO.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.librarySys.dao.AuthorDAO;
import com.sgic.model.Author;
import com.sgic.model.Classification;
public class AuthorDAOimpl implements AuthorDAO {
	private DataSource datasource;
	private DataSource getDatasource() {
		return datasource;
}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	@Override
	public Author createAuthor(Author author) {
		Connection conn=null;
		PreparedStatement ps =null;
		List<Author> authorList=new ArrayList<Author>();
			try {
				conn= datasource.getConnection();
				String SQL ="INSERT INTO author(author_id, author_name)  VALUE(?,?) ";
				ps=conn.prepareStatement(SQL);
				
			//  Author author=new Author();
				ps.setInt(1, author.getAuthorId());
				ps.setString(2,author.getAuthorName() );
				
				
			if(ps.executeUpdate()>0) {
			System.out.println("insert successfully with id:");
		}
			}catch (Exception e) {
				e.printStackTrace();
			
		}
			
		return null;
	}

	@Override
	public Integer deleteAuthor(Integer AuthorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author updateAuthor(Integer AuthorId, Integer author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author getauthorById(Integer authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Author> getAuthorList() {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps =null;
		List<Author>authorList=new ArrayList<Author>();
			try {
				conn=datasource.getConnection();
				String SQL ="SELECTY author_id,author_name FROM author ";
				ps=conn.prepareStatement(SQL);
				
				ResultSet rs =ps.executeQuery();
				while (rs.next()) {
					Author author=new Author();
					author.setAuthorId(rs.getInt("author_id"));
					author.setAuthorName(rs.getString("author_name"));
					authorList.add(author);
			}
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
		return null;
	}

	
	
}