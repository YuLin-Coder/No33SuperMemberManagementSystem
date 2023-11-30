package wyr.servlet;

import wyr.dao.MemberDao;
import wyr.dao.impl.DetailBillDaoImpl;
import wyr.entity.DetailBill;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DetailBillServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDao<DetailBill> md = new DetailBillDaoImpl();
		int did = Integer.parseInt(request.getParameter("did"));
		DetailBill db = md.findById(did);
		request.setAttribute("detailbill", db);
		request.getRequestDispatcher("jsp/detailCount.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
