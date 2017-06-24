package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Laba3Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		
	
		int a = 10;
		int b = 89;
		int[][] matrixA;
		matrixA = new int[8][5];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				int random_number1 = a + (int) (Math.random() * b);
				matrixA[i][j] = random_number1;
				resp.getWriter().println(matrixA[i][j] + "\t");
			}
			resp.getWriter().println("<br>");
		}
	}
}
