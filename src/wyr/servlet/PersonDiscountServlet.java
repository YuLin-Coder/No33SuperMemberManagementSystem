package wyr.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wyr.dao.MemberDao;
import wyr.dao.impl.RebateDaoImpl;
import wyr.entity.Discount;

public class PersonDiscountServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDao<Discount> md = new RebateDaoImpl();
		//��ȡ���е�Member����
		List<Discount> list = md.findAll();
		//�洢��HttpServletRequest�������
		request.setAttribute("discount", list);
		request.getRequestDispatcher("jsp/personDiscount.jsp").forward(request, response);		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
