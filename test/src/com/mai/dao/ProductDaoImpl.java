package com.mai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mai.enity.Product;

public class ProductDaoImpl {
	public Product findProductByName(String name) {
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from product where name=?");
			pstm.setString(1, name);
			ResultSet rs=pstm.executeQuery();
			Product p=null;
			while(rs.next()){
				p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setDescription(rs.getString(3));
				p.setListimg(rs.getString(4));
				p.setPrice(rs.getInt(5));
				p.setDiscountprice(rs.getInt(6));
			}
			return p;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
