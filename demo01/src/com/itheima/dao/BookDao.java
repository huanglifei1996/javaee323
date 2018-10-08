package com.itheima.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.itheima.domain.Book;
import com.itheima.utils.DataSourceUtils;

public class BookDao {

	public void save(Book book) throws SQLException {
	    QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		 String sql = "insert into book values(null,?,?,?,?)";
	     qr.update(sql,book.getBook_name(),book.getBook_author(),book.getBook_sort(),book.getBook_price());
	}

}
