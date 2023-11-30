package wyr.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import wyr.dao.MemberDao;
import wyr.entity.Goods;
import wyr.util.JdbcUtils;

public class GoodsDaoImpl implements MemberDao<Goods> {
	
	private QueryRunner qr = JdbcUtils.getQueryRunner();;
	
	/**
	 * 查询所有商品
	 */
	public List<Goods> findAll() {
		String sql = "select * from goods";		
		try{			
			return qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public Goods findById(int id){
		String sql = "select * from goods where gid=?";		
		try{			
			return qr.query(sql, new BeanHandler<Goods>(Goods.class),id);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * 添加新商品
	 */
	public void add(Goods m) {
		String sql = "insert into goods(gname,gnum,gkind) VALUES(?,?,?)";
		try{
			qr.update(sql,m.getGname(),m.getGnum(),m.getGkind());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * 修改商品信息
	 */
	public void update(Goods m) {
		String sql = "UPDATE goods SET gname=?,gnum=?,gkind=? WHERE gid=?";
		try{
			qr.update(sql,m.getGname(),m.getGnum(),m.getGkind(),m.getGid());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * 注销会员
	 */
	public void delete(int id) {
		String sql ="delete from goods where gid=?";
		try{
			qr.update(sql,id);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
