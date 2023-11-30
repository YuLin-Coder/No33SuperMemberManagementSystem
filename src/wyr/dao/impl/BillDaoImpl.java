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
	 * 查询所有账单
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
		//不具备此功能
		return null;
	}
	
	/**
	 * 添加新账单
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
	 * 修改
	 */
	public void update(Bill m) {
		//管理员和会员都不具备此功能
	}

	/**
	 * 删除账单
	 */
	public void delete(int id) {
		//管理员不具备此功能
		String sql ="delete from shop where did=?";
		try{
			qr.update(sql,id);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
