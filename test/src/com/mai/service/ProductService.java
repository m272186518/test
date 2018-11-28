package com.mai.service;

import com.mai.dao.ProductDaoImpl;
import com.mai.enity.Product;



public class ProductService {
	ProductDaoImpl pd=new ProductDaoImpl();
	/*
	 * 验证查询商品方法<根据name>
	 */
	public Product findProductById(String name){
		Product p=pd.findProductByName(name);
		return p;
	}

}
