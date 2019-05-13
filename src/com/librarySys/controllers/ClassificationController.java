package com.librarySys.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarySys.Service.ClassificationService;
import com.librarySys.impl.ClassificationServiceimpl;
import com.sgic.model.Classification;

/**
 * Servlet implementation class ClassificationController
 */
@WebServlet("/ClassificationController")
public class ClassificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassificationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int classificationId = Integer.parseInt(request.getParameter("classificationId"));
		String classificationName = request.getParameter("classificationName");
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("SpringConfig.xml");
		ClassificationService classificationService =context.getBean("classificationService",ClassificationServiceimpl.class);
				
				Classification classification=new Classification();
		classification.setClassificationId(classificationId);
		classification.setClassificationName(classificationName);
		
		classificationService.addClassification(classification);
		//
		doGet(request, response);
	}

}
