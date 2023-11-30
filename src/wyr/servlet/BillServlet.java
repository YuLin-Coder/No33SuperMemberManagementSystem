package wyr.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wyr.dao.MemberDao;
import wyr.dao.impl.BillDaoImpl;
import wyr.entity.Bill;


public class BillServlet extends HttpServlet {
	
	private MemberDao<Bill> md = new BillDaoImpl();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//防止乱码
		request.setCharacterEncoding("utf-8");
		String main = request.getParameter("main");
		if("showlist".equals(main)){
			showList(request, response);
		}else{
			add(request,response);
		}				
	}

	public void showList(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取所有的Bill对象
		List<Bill> list = md.findAll();
		//存储到HttpServletRequest域对象中
		request.setAttribute("bill", list);
		request.getRequestDispatcher("jsp/shop.jsp").forward(request, response);
	}

	public void add(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//用户刷卡添加,此处暂时不处理
	}
}
