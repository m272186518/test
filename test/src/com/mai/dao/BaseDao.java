package com.mai.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
	//加载数据库驱�?-->数据库连�?-->执行Sql语句-->返回结果记录�?
	static{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Connection getCon(){
		try{
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/product?useUnicode=true&characterEncoding=UTF-8&useSSL = false&serverTimezone = GMT","root","useroot");
			return con;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
