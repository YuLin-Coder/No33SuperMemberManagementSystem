package wyr.util;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 使用 DBUtils 和 C3P0连接池技术
 * @author Administrator
 *
 */
public class JdbcUtils {
	
	private static DataSource ds;

	static{
		//会自动加载
		ds = new ComboPooledDataSource();
	}
	
	/**
	 * 获取QueryRunner对象
	 * 在调用query()方法中不需传入连接对象参数
	 */
	public static QueryRunner getQueryRunner(){
		return new QueryRunner(ds);
	}
}
