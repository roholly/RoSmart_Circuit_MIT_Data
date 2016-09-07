package edu.acc.java;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestDataSrc
 */
@WebServlet("/HouseIDs")
public class ListHouseIDsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 
	@Resource(name = "jdbc/redd_low_freq")
	 private DataSource ds;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HouseManager houseMgr = new HouseManager(ds);
    	try {
    	request.setAttribute("houses", houseMgr.getHouseIds());
		getServletContext().getRequestDispatcher("/HouseIDs.jsp").forward(request,  response);
    	} catch(Exception ex) {
    		throw new ServletException(ex);
    	}
	}


}
