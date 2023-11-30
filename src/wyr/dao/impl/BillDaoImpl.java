package wyr.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import wyr.dao.MemberDao;
import wyr.entity.Bill;
import wyr.util.JdbcUtils;

import java.util.List;

public class BillDaoImpl implements MemberDao<Bill> {
	
	private QueryRunner qr = JdbcUtils.getQueryRunner();;
	
	/**
	 * ��ѯ�����˵�
	 */
	public List<Bill> findAll() {
		String sql = "select * from shop";		
		try{			
			return qr.query(sql, new BeanListHandler<Bill>(Bill.class));
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	public Bill findById(int id){
		//���߱��˹���
		return null;
	}
	
	/**
	 * ������˵�
	 */
	public void add(Bill m) {
		String sql = "insert into shop(did,hid,sdiscount,sallprice,stime) VALUES(?,?,?,?,?)";
		try{
			qr.update(sql,m.getDid(),m.getHid(),m.getSdiscount(),m.getSallprice(),m.getStime());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * �޸�
	 */
	public void update(Bill m) {
		//����Ա�ͻ�Ա�����߱��˹���
	}

	/**
	 * ɾ���˵�
	 */
	public void delete(int id) {
		//����Ա���߱��˹���
		String sql ="delete from shop where did=?";
		try{
			qr.update(sql,id);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
