package wyr.service.impl;

import wyr.dao.LoginDao;
import wyr.dao.impl.LoginManageDaoImpl;
import wyr.dao.impl.LoginMemberDaoImpl;
import wyr.entity.Manage;
import wyr.entity.Member;
import wyr.service.LoginService;

public class LoginServiceImpl implements LoginService {
 
	private LoginDao<Member> me = new LoginMemberDaoImpl();
	private LoginDao<Manage> ma = new LoginManageDaoImpl();
	
	public Object loginUser(String status,String userName,String password) {
		if("member".equals(status)){
			return me.findUser(userName, password);			
		}else{
			return ma.findUser(userName, password);
		}
	}

}
