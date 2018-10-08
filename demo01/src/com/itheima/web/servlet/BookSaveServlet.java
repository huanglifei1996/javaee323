package com.itheima.web.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
public class BookSaveServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        	request.setCharacterEncoding("UTF-8");
        	 response.setContentType("text/html charset = utf-8");
        	 Map<String, String[]> map = request.getParameterMap();
    	     Book book = new Book();
    	     BeanUtils.populate(book, map);
        	 BookService service = new BookService();
    	     service.save(book);
    	     response.getWriter().print("±£´æ³É¹¦");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
