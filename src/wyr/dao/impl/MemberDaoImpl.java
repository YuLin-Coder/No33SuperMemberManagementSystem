package wyr.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import wyr.dao.MemberDao;
import wyr.entity.Member;
import wyr.util.JdbcUtils;

public class MemberDaoImpl implements MemberDao<Member> {
	
	private QueryRunner qr = JdbcUtils.getQueryRunner();;
	
	/**
	 * 查询所有会员
	 */
	public List<Member> findAll() {
		String sql = "select * from member";		
		try{			
			return qr.query(sql, new BeanListHandler<Member>(Member.class));
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public Member findById(int id){
		String sql = "select * from member where hid=?";		
		try{			
			return qr.query(sql, new BeanHandler<Member>(Member.class),id);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * 添加新会员
	 */
	public void add(Member m) {
		String sql = "insert into member(hpassword,rgrade,hname,hsex,hage,htel,hjob,hintegral) values(?,?,?,?,?,?,?,?)";
		try{
			qr.update(sql,m.getHpassword(),m.getRgrade(),m.getHname(),m.getHsex(),
					      m.getHage(),m.getHtel(),m.getHjob(),m.getHintegral());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * 修改会员信息
	 */
	public void update(Member m) {
		String sql = "UPDATE member SET rgrade=?,hname=?,hsex=?,hage=?,htel=?,hjob=?,hintegral=? WHERE hid=?";
		try{
			qr.update(sql,m.getRgrade(),m.getHname(),m.getHsex(),
				      m.getHage(),m.getHtel(),m.getHjob(),m.getHintegral(),m.getHid());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * 注销会员
	 */
	public void delete(int id) {
		String sql ="delete from member where hid=?";
		try{
			qr.update(sql,id);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
