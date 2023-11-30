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
		List<Discount> list = md.findAll();
		//�洢��HttpServletRequest�������
		request.setAttribute("discount", list);
		request.getRequestDispatcher("jsp/discount.jsp").forward(request, response);
	}

	public void query(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//��ȡid 
		String rgrade = request.getParameter("rgrade");
		//��ȡ����
		Discount d = md.findById(Integer.parseInt(rgrade));
		//�洢�������
		request.setAttribute("discount", d);
		//ת��
		request.getRequestDispatcher("jsp/updateDiscount.jsp").forward(request, response);
	}
	
	public void update(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�޸ĺ��ֵ
		int rgrade = Integer.parseInt(request.getParameter("rgrade"));
		double rdiscount = Double.parseDouble(request.getParameter("rdiscount"));
		
		//���õ�Member������
		Discount d = new Discount();
		d.setRgrade(rgrade);
		d.setRdiscount(rdiscount);		
		//�޸�
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
		//��ȡҪ��ӵ�ֵ	
		int rgrade = Integer.parseInt(request.getParameter("rgrade"));
		double rdiscount = Double.parseDouble(request.getParameter("rdiscount"));
		
		Discount dis = md.findById(rgrade);
		if(dis==null){	//Ϊ����֤���õȼ���������
			//���õ�Member������
			Discount d = new Discount();
			d.setRgrade(rgrade);
			d.setRdiscount(rdiscount);	
			//���
			md.add(d);
			url = "/DiscountServlet?main=showlist";
		}else{	//�Ѿ����ڸõȼ�
			request.setAttribute("error","�ܱ�Ǹ,�õȼ��Ѵ���!");
			url = "jsp/addDiscount.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
	
}
