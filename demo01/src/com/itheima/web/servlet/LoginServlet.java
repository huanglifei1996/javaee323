package com.itheima.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.User;
import com.itheima.service.UserService;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           request.setCharacterEncoding("UTF-8");
           
           String username = request.getParameter("username");
           String password = request.getParameter("password");
	        
           UserService service = new  UserService();
            User user = null;
			try {
				user = service.login(username,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            if (user== null) {
				request.getSession().setAttribute("msg", "用户名和密码错误");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			    return;
            }else{
            	request.getSession().setAttribute("user", user);
            	response.sendRedirect(request.getContextPath());
            }
            
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}