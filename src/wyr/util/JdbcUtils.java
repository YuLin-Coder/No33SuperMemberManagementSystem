package wyr.util;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * ʹ�� DBUtils �� C3P0���ӳؼ���
 * @author Administrator
 *
 */
public class JdbcUtils {
	
	private static DataSource ds;

	static{
		//���Զ�����
		ds = new ComboPooledDataSource();
	}
	
	/**
	 * ��ȡQueryRunner����
	 * �ڵ���query()�����в��贫�����Ӷ������
	 */
	public static QueryRunner getQueryRunner(){
		return new QueryRunner(ds);
	}
}
