package wyr.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wyr.dao.MemberDao;
import wyr.dao.impl.GoodsDaoImpl;
import wyr.entity.Goods;

public class GoodsServlet extends HttpServlet {

	private MemberDao<Goods> md = new GoodsDaoImpl();
	
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
		List<Goods> list = md.findAll();
		//存储到HttpServletRequest域对象中
		request.setAttribute("goods", list);
		request.getRequestDispatcher("jsp/goods.jsp").forward(request, response);
	}

	public void query(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取id 
		String gid = request.getParameter("gid");
		//获取对象
		Goods d = md.findById(Integer.parseInt(gid));
		//存储到域对象
		request.setAttribute("goods", d);
		//转发
		request.getRequestDispatcher("jsp/updateGoods.jsp").forward(request, response);
	}
	
	public void update(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取修改后的值
		int gid = Integer.parseInt(request.getParameter("gid"));
		String gname = request.getParameter("gname");
		int gnum = Integer.parseInt(request.getParameter("gnum"));
		String gkind = request.getParameter("gkind");
		
		//设置到Member对象中
		Goods g = new Goods();
		g.setGid(gid);
		g.setGname(gname);
		g.setGnum(gnum);
		g.setGkind(gkind);
		
		//修改
		md.update(g);		
		request.getRequestDispatcher("/GoodsServlet?main=showlist").forward(request, response);		
	}
	
	public void delete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int gid = Integer.parseInt(request.getParameter("gid"));		
		md.delete(gid);	
		request.getRequestDispatcher("/GoodsServlet?main=showlist").forward(request, response);
	}
	
	public void add(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取要添加的值	
		String gname = request.getParameter("gname");
		int gnum = Integer.parseInt(request.getParameter("gnum"));
		String gkind = request.getParameter("gkind");	
		
		//设置到Member对象中
		Goods g = new Goods();
		g.setGname(gname);
		g.setGnum(gnum);
		g.setGkind(gkind);	
		//添加
		md.add(g);
		request.getRequestDispatcher("/GoodsServlet?main=showlist").forward(request, response);
	}
}
