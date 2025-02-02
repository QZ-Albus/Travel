package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.tipsdao;
import entity.Tip;

/**
 * Servlet implementation class subPageServlet
 */
@WebServlet("/subPageServlet")
public class subTipPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public subTipPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setHeader("content-type","text/html;charset=UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter outs=resp.getWriter();
		HttpSession session = req.getSession();
		resp.setCharacterEncoding("UTF-8");
		tipsdao td = new tipsdao();
		long total=td.getCount();
		int start;
		if(session.getAttribute("tipstart")!=null)
		{
			start=(int) session.getAttribute("tipstart");
			
		}
		else
		{
			start=0;
			
		}
		if(start-5>=0)
		{
			start-=5;
			session.setAttribute("tipstart", start);
		}
		List<Tip> tiplist=td.getTipList(start, 5);
		session.setAttribute("tiplist", tiplist);
		req.getRequestDispatcher("/tiplist.jsp").forward(req, resp);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
