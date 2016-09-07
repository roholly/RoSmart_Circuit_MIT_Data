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
 * Servlet implementation class HouseServlet
 */
@WebServlet("/House")
public class HouseServlet extends HttpServlet {
	
	
	@Resource(name = "jdbc/redd_low_freq")
	 private DataSource ds;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HouseManager houseMgr = new HouseManager(ds);
		String id = request.getParameter("id");
		for (House h : houseMgr.getHouses(id)) {
			request.setAttribute("house", h);
		}
		//New Code here until forward to House.jsp.  Above works.
		for (HouseDailyAverages houseAvgs : houseMgr.getDailyAverages(id)) {
			request.setAttribute("houseAvgs", houseAvgs);
		}

		getServletContext().getRequestDispatcher("/HouseOverview.jsp").forward(request,  response);
		//getServletContext().getRequestDispatcher("/Testing.jsp").forward(request,  response);
	}
	

}
