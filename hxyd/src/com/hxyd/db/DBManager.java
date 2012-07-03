package com.hxyd.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.alibaba.druid.pool.DruidDataSource;

public class DBManager {
	final Integer COUNT = 80;
	private String jdbcURL;
	private String user;
	private String password;
	private String DriverClass;
	private DruidDataSource dataSource;

	protected void setUp() {
		jdbcURL = "jdbc:mysql://localhost:3306/test";
		user = "root";
		password = "mzyailqq";
		DriverClass = "com.mysql.jdbc.Driver";
		dataSource = new DruidDataSource();
		dataSource.setDriverClassName(DriverClass);
		dataSource.setUrl(jdbcURL);
		dataSource.setPoolPreparedStatements(true);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
		createTable("test");
	}

	private void createTable(String tName){
		StringBuffer ddl = new StringBuffer();
		ddl.append("CREATE TABLE t_big (FID INT AUTO_INCREMENT PRIMARY KEY ");
		for (int i = 0; i < COUNT; ++i) {
			ddl.append(", ");
			ddl.append("F" + i);
			ddl.append(" BIGINT NULL");
		}
		ddl.append(")");

		Connection conn;
		try {
			conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			stmt.execute(ddl.toString());
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test(){
		try {
			Context ctx = new InitialContext();
			ctx.lookup("java:comp/env/jdbc/druid");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		DBManager dbm=new DBManager();
		dbm.test();
		//dbm.setUp();
	}
}
