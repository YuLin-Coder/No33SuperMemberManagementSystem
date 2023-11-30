package wyr.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import wyr.dao.LoginDao;
import wyr.entity.Manage;
import wyr.util.JdbcUtils;

public class LoginManageDaoImpl implements LoginDao<Manage> {
	
	private QueryRunner qr;
	
	public Manage findUser(String userName, String password) {
		String sql = "select * from manage where userName=? and password=?";
		try{
			qr = JdbcUtils.getQueryRunner();
			return qr.query(sql,new BeanHandler<Manage>(Manage.class),userName,password);			
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
