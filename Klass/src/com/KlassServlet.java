package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class KlassServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");

		
		String name2 = req.getParameter("cat2_name");
		String firm2 = req.getParameter("cat2_firm");
		

		double age2 = Double.parseDouble(req.getParameter("cat2_age"));
		double weight2 = Double.parseDouble(req.getParameter("cat2_weight"));

		
		Abonent cat2 = new Abonent(name2, weight2, firm2, age2);

		int a = 1000000;
		int b = 8999999;
		int result = (a + (int) (Math.random() * b));

		resp.getWriter().println("<html><body>");

		resp.getWriter().println("Ваш номер телефона: " + "8-951-" + result);

		resp.getWriter().println("</body></html>");
	}
}