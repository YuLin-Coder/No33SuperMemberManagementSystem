package wyr.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import wyr.dao.MemberDao;
import wyr.entity.Discount;
import wyr.util.JdbcUtils;

public class RebateDaoImpl implements MemberDao<Discount> {
	
	private QueryRunner qr = JdbcUtils.getQueryRunner();;
	
	/**
	 * 查询所有等级折扣
	 */
	public List<Discount> findAll() {
		String sql = "select * from rebate";		
		try{			
			return qr.query(sql, new BeanListHandler<Discount>(Discount.class));
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public Discount findById(int id){
		String sql = "select * from rebate where rgrade=?";		
		try{			
			return qr.query(sql, new BeanHandler<Discount>(Discount.class),id);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * 添加等级折扣
	 */
	public void add(Discount m) {
		String sql = "insert into rebate(rgrade,rdiscount) values(?,?)";
		try{
			qr.update(sql,m.getRgrade(),m.getRdiscount());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * 修改等级折扣
	 */
	public void update(Discount m) {
		String sql = "UPDATE rebate SET rdiscount=? WHERE rgrade=?";
		try{
			qr.update(sql,m.getRdiscount(),m.getRgrade());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * 删除等级折扣
	 */
	public void delete(int id) {
		String sql ="delete from rebate where rgrade=?";
		try{
			qr.update(sql,id);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
