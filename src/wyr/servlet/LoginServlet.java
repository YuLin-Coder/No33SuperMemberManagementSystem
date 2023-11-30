package wyr.servlet;

import wyr.entity.Manage;
import wyr.entity.Member;
import wyr.service.LoginService;
import wyr.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ֹ����
		request.setCharacterEncoding("utf-8");
		
		LoginService ls = new LoginServiceImpl();
		Member me = null;
		Manage ma = null;
		//��ȡ����
		String status = request.getParameter("status");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		//���÷�����ȡ����
		Object obj = ls.loginUser(status, userName, password);
		if(obj instanceof Member){
			me = (Member)obj;
		}else{
			ma = (Manage)obj;
		}
		//�ж��Ƿ��¼��ȷ
		if(me == null && ma==null){
			//��¼����
			request.setAttribute("loginError", "��¼����,�����µ�¼");
			request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
		}else{
			//��¼�ɹ���ҳ����ת
			if(me!=null){
				HttpSession session = request.getSession();
				session.setAttribute("member", me);				
				request.getRequestDispatcher("jsp/indexM.jsp").forward(request, response);
			}
			if(ma!=null){
				request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
