package wyr.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import wyr.dao.impl.DetailBillDaoImpl;
import wyr.entity.DetailBill;
import wyr.entity.Member;

public class PersonDetailCountServlet extends HttpServlet {
  
	private DetailBillDaoImpl md = new DetailBillDaoImpl();

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ֹ����
		request.setCharacterEncoding("utf-8");
			
		String main = request.getParameter("main");
		if("personDetailBill".equals(main)){
			personDetailBill(request, response);
		}else if("delete".equals(main)){
			delete(request, response);
		}				
	}

	public void delete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {		
		int did = Integer.parseInt(request.getParameter("did"));
		md.delete(did);	
		request.getRequestDispatcher("/PersonDetailCountServlet?main=personDetailBill").forward(request, response);
	}

	public void personDetailBill(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//��ȡ��¼�����Ļ�Ա��Ϣ
		HttpSession session = request.getSession();
		Member me = (Member)session.getAttribute("member");
		//��ȡ���е�Member����
		List<DetailBill> list = md.findByHid(me.getHid());
		//�洢��HttpServletRequest�������
		request.setAttribute("detailbill", list);	
		request.getRequestDispatcher("jsp/personDetailCount.jsp").forward(request, response);	
	}	
}
