package com.hxyd.control;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import javax.management.JMException;
import javax.management.openmbean.TabularData;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.stat.JdbcStatManager;

/**
 * Servlet implementation class Control
 */
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Control() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Context ctx;
		try {
			ctx = new InitialContext();
			DataSource dataSource=(DataSource) ctx.lookup("java:comp/env/jdbc/hxyd");
			System.out.println(dataSource);
			try {
				Connection conn = dataSource.getConnection();
				System.out.println(conn.getMetaData().getDatabaseProductName()+" ");
				String sql="insert into user(username,password) values('mzy','mzyailqq')";
				Statement st=conn.createStatement();
				st.execute(sql);
				/*while(rs.next()){
					System.out.println(rs.getString(0));
				}*/
				conn.close();
				try {
					TabularData td = JdbcStatManager.getInstance().getDataSourceList();
					Iterator iterator=td.keySet().iterator();
					
					while(iterator.hasNext()){
						Object str = iterator.next();
						
						System.out.println(str);
						
					}
				} catch (JMException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
			
	}
	public void delete(HttpServletRequest request, HttpServletResponse response){
		
	}

}
