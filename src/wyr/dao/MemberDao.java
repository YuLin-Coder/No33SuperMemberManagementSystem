package wyr.dao;

import java.util.List;

public interface MemberDao<T> {
	
	/**
	 * ����
	 */
	public List<T> findAll();
	
	public T findById(int id);
	
	/**
	 * ���
	 */
	public void add(T t);
	
	/**
	 * �޸�
	 */
	public void update(T t);
	
	/**
	 * ɾ��
	 */
	public void delete(int id);
}
