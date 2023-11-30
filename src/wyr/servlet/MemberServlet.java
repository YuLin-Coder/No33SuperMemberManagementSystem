package wyr.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wyr.dao.MemberDao;
import wyr.dao.impl.MemberDaoImpl;
import wyr.entity.Member;

public class MemberServlet extends HttpServlet {
	
	private MemberDao<Member> md = new MemberDaoImpl();
	
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
		}else if("query".equals(main)){
			query(request,response);
		}else if("update".endsWith(main)){
			update(request,response);
		}else if("delete".equals(main)){
			delete(request,response);
		}else{
			add(request,response);
		}
		
				
	}

	public void showList(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取所有的Member对象
		List<Member> list = md.findAll();
		//存储到HttpServletRequest域对象中
		request.setAttribute("member", list);
		request.getRequestDispatcher("jsp/member.jsp").forward(request, response);
	}

	public void query(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取id 
		String hid = request.getParameter("hid");
		//获取对象
		Member m = md.findById(Integer.parseInt(hid));
		//存储到域对象
		request.setAttribute("member", m);
		//转发
		request.getRequestDispatcher("jsp/updateMember.jsp").forward(request, response);
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
		
		//修改
		md.update(m);		
		request.getRequestDispatcher("/MemberServlet?main=showlist").forward(request, response);		
	}
	
	public void delete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int hid = Integer.parseInt(request.getParameter("hid"));		
		md.delete(hid);	
		request.getRequestDispatcher("/MemberServlet?main=showlist").forward(request, response);
	}
	
	public void add(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取要添加的值
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
		m.setHpassword(hpassword);
		m.setRgrade(rgrade);
		m.setHname(hname);
		m.setHsex(hsex);
		m.setHage(hage);
		m.setHtel(htel);
		m.setHjob(hjob);
		m.setHintegral(hintegral);		
		//添加
		md.add(m);
		request.getRequestDispatcher("/MemberServlet?main=showlist").forward(request, response);
	}
}
