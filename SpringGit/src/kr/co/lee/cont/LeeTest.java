package kr.co.lee.cont;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LeeTest extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//1. init
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		// 초기화 단계 다 1번만 요청 올시 처음으로 실행됨
	}
	//2.service
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	//3.destroy
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	
	}
	
}
