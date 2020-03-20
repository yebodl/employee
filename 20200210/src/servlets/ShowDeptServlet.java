package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import pojo.Dept;

/**
 * Servlet implementation class ShowDeptServlet
 */
@WebServlet("/ShowDeptServlet")
public class ShowDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDeptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Dept> list = new ArrayList<Dept>();
		list.add(new Dept(10,"������","����"));
		list.add(new Dept(20,"�г���","����"));
		list.add(new Dept(30,"������2","����"));
		list.add(new Dept(40,"�г���2","����"));
		
		String str = JSON.toJSONString(list);
		//��������Ҫ��������
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print(str);
	}

}
