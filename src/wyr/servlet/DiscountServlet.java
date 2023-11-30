package wyr.servlet;

import wyr.dao.MemberDao;
import wyr.dao.impl.RebateDaoImpl;
import wyr.entity.Discount;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DiscountServlet extends HttpServlet {

	private MemberDao<Discount> md = new RebateDaoImpl();
	
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
		List<Discount> list = md.findAll();
		//存储到HttpServletRequest域对象中
		request.setAttribute("discount", list);
		request.getRequestDispatcher("jsp/discount.jsp").forward(request, response);
	}

	public void query(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取id 
		String rgrade = request.getParameter("rgrade");
		//获取对象
		Discount d = md.findById(Integer.parseInt(rgrade));
		//存储到域对象
		request.setAttribute("discount", d);
		//转发
		request.getRequestDispatcher("jsp/updateDiscount.jsp").forward(request, response);
	}
	
	public void update(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取修改后的值
		int rgrade = Integer.parseInt(request.getParameter("rgrade"));
		double rdiscount = Double.parseDouble(request.getParameter("rdiscount"));
		
		//设置到Member对象中
		Discount d = new Discount();
		d.setRgrade(rgrade);
		d.setRdiscount(rdiscount);		
		//修改
		md.update(d);		
		request.getRequestDispatcher("/DiscountServlet?main=showlist").forward(request, response);		
	}
	
	public void delete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int rgrade = Integer.parseInt(request.getParameter("rgrade"));		
		md.delete(rgrade);	
		request.getRequestDispatcher("/DiscountServlet?main=showlist").forward(request, response);
	}
	
	public void add(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		//获取要添加的值	
		int rgrade = Integer.parseInt(request.getParameter("rgrade"));
		double rdiscount = Double.parseDouble(request.getParameter("rdiscount"));
		
		Discount dis = md.findById(rgrade);
		if(dis==null){	//为空则证明该等级还不存在
			//设置到Member对象中
			Discount d = new Discount();
			d.setRgrade(rgrade);
			d.setRdiscount(rdiscount);	
			//添加
			md.add(d);
			url = "/DiscountServlet?main=showlist";
		}else{	//已经存在该等级
			request.setAttribute("error","很抱歉,该等级已存在!");
			url = "jsp/addDiscount.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
	
}
