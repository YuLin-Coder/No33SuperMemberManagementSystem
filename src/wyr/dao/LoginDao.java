package wyr.dao;

public interface LoginDao<T> {
	
	/**
	 * ��¼ʱ����û���������
	 */
	public T findUser(String userName,String password);	

}
