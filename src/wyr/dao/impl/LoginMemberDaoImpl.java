package wyr.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import wyr.dao.LoginDao;
import wyr.entity.Member;
import wyr.util.JdbcUtils;

public class LoginMemberDaoImpl implements LoginDao<Member> {
	
	private QueryRunner qr;
	
	public Member findUser(String userName, String password) {
		String sql = "select * from member where hname=? and hpassword=?";
		try{
			qr = JdbcUtils.getQueryRunner();
			return qr.query(sql,new BeanHandler<Member>(Member.class),userName,password);			
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
