package com.itheima.service;

import java.sql.SQLException;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;

public class BookService {

	public void save(Book book) throws SQLException {
		   new BookDao().save(book);
		
	}
	
}
