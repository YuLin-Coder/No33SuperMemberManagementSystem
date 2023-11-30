package wyr.dao;

import java.util.List;

public interface MemberDao<T> {
	
	/**
	 * ²éÕÒ
	 */
	public List<T> findAll();
	
	public T findById(int id);
	
	/**
	 * Ìí¼Ó
	 */
	public void add(T t);
	
	/**
	 * ĞŞ¸Ä
	 */
	public void update(T t);
	
	/**
	 * É¾³ı
	 */
	public void delete(int id);
}
