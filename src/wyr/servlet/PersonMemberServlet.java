package wyr.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import wyr.dao.MemberDao;
import wyr.dao.impl.MemberDaoImpl;
import wyr.entity.Member;

public class PersonMemberServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//防止乱码
		request.setCharacterEncoding("utf-8");
		String main = request.getParameter("main");
		if("personMember".equals(main)){
			personMember(request, response);
		}else if("update".equals(main)){
			update(request, response);
		}
	}

	public void personMember(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession();
		Member m = (Member) s.getAttribute("member");
		request.setAttribute("m", m);
		//页面跳转
		request.getRequestDispatcher("jsp/personMember.jsp").forward(request, response);
	}

	public void update(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		//获取修改后的值
		int hid = Integer.parseInt(request.getParameter("hid"));
		String hpassword = request.getParameter("hpassword");
		int rgrade = Integer.parseInt(request.getParameter("rgrade"));
		String hname = request.getParameter("hname");
		String hsex = request.getParameter("hsex");
		int hage = Integer.parseInt(request.getParameter("hage"));
		String htel = request.getParameter("htel");
		String hjob = request.getParameter("hjob");
		int hintegral = Integer.parseInt(request.getParameter("hintegral"));
		//设置到Member对象中
		Member m = new Member();
		m.setHid(hid);
		m.setHpassword(hpassword);
		m.setRgrade(rgrade);
		m.setHname(hname);
		m.setHsex(hsex);
		m.setHage(hage);
		m.setHtel(htel);
		m.setHjob(hjob);
		m.setHintegral(hintegral);
		
		MemberDao<Member> md = new MemberDaoImpl();
		//修改
		md.update(m);		
		HttpSession s = request.getSession();
		s.setAttribute("member", m);
		request.getRequestDispatcher("jsp/updateSuccess.jsp").forward(request, response);			
	}

}
