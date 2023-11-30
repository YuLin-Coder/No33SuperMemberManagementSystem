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
		//��ֹ����
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
		//��ȡ���е�Member����
		List<Member> list = md.findAll();
		//�洢��HttpServletRequest�������
		request.setAttribute("member", list);
		request.getRequestDispatcher("jsp/member.jsp").forward(request, response);
	}

	public void query(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//��ȡid 
		String hid = request.getParameter("hid");
		//��ȡ����
		Member m = md.findById(Integer.parseInt(hid));
		//�洢�������
		request.setAttribute("member", m);
		//ת��
		request.getRequestDispatcher("jsp/updateMember.jsp").forward(request, response);
	}
	
	public void update(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�޸ĺ��ֵ
		int hid = Integer.parseInt(request.getParameter("hid"));
		String hpassword = request.getParameter("hpassword");
		int rgrade = Integer.parseInt(request.getParameter("rgrade"));
		String hname = request.getParameter("hname");
		String hsex = request.getParameter("hsex");
		int hage = Integer.parseInt(request.getParameter("hage"));
		String htel = request.getParameter("htel");
		String hjob = request.getParameter("hjob");
		int hintegral = Integer.parseInt(request.getParameter("hintegral"));
		//���õ�Member������
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
		
		//�޸�
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
		//��ȡҪ��ӵ�ֵ
		String hpassword = request.getParameter("hpassword");
		int rgrade = Integer.parseInt(request.getParameter("rgrade"));
		String hname = request.getParameter("hname");
		String hsex = request.getParameter("hsex");
		int hage = Integer.parseInt(request.getParameter("hage"));
		String htel = request.getParameter("htel");
		String hjob = request.getParameter("hjob");
		int hintegral = Integer.parseInt(request.getParameter("hintegral"));
		//���õ�Member������
		Member m = new Member();
		m.setHpassword(hpassword);
		m.setRgrade(rgrade);
		m.setHname(hname);
		m.setHsex(hsex);
		m.setHage(hage);
		m.setHtel(htel);
		m.setHjob(hjob);
		m.setHintegral(hintegral);		
		//���
		md.add(m);
		request.getRequestDispatcher("/MemberServlet?main=showlist").forward(request, response);
	}
}
