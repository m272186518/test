package com.mai.service;

import com.mai.dao.ProductDaoImpl;
import com.mai.enity.Product;



public class ProductService {
	ProductDaoImpl pd=new ProductDaoImpl();
	/*
	 * ��֤��ѯ��Ʒ����<����name>
	 */
	public Product findProductById(String name){
		Product p=pd.findProductByName(name);
		return p;
	}

}
