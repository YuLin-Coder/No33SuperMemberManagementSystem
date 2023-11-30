package wyr.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import wyr.dao.MemberDao;
import wyr.entity.DetailBill;
import wyr.entity.Member;
import wyr.util.JdbcUtils;

public class DetailBillDaoImpl implements MemberDao<DetailBill> {
	
	private QueryRunner qr = JdbcUtils.getQueryRunner();;
	
	/**
	 * ��ѯ������ϸ��
	 */
	public List<DetailBill> findAll() {
		String sql = "select * from detail";		
		try{			
			return qr.query(sql, new BeanListHandler<DetailBill>(DetailBill.class));
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
   
	public DetailBill findById(int id){
		String sql = "select * from detail where did=?";		
		try{			
			return qr.query(sql, new BeanHandler<DetailBill>(DetailBill.class),id);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public List<DetailBill> findByHid(int hid){
		String sql = "SELECT * FROM detail WHERE detail.did  = ANY(SELECT did FROM shop WHERE hid=?)";		
		try{			
			return qr.query(sql, new BeanListHandler<DetailBill>(DetailBill.class),hid);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * �����ϸ��
	 */
	public void add(DetailBill m) {
		String sql = "insert into detail(gid,dname,dkind,dprice,dmoney,dcount) VALUES(?,?,?,?,?,?)";
		try{
			qr.update(sql,m.getGid(),m.getDname(),m.getDkind(),
					      m.getDprice(),m.getDmoney(),m.getDcount());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * �޸���ϸ��
	 */
	public void update(DetailBill m) {
		//����Ա�ͻ�Ա�����߱��˹���
	}

	/**
	 * ɾ����ϸ��
	 */
	public void delete(int id) {
		String sql1 ="delete from shop where did=?";
		String sql2 ="delete from detail where did=?";
		try{
			qr.update(sql1,id);
			qr.update(sql2,id);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
