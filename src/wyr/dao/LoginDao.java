package wyr.dao;

public interface LoginDao<T> {
	
	/**
	 * 登录时检查用户名和密码
	 */
	public T findUser(String userName,String password);	

}
