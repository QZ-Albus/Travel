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

import dao.linedao;
import entity.Line;

/**
 * Servlet implementation class linelist
 */
@WebServlet("/linelist")
public class linelist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public linelist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setHeader("content-type","text/html;charset=UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter outs=resp.getWriter();
		HttpSession session = req.getSession();
		resp.setCharacterEncoding("UTF-8");
		linedao td = new linedao();
		int start;
		if(session.getAttribute("linestart")!=null)
		{
			start=(int) session.getAttribute("linestart");
			
		}
		else
		{
			start=0;
			session.setAttribute("linestart", start);
		}
		int pic=0;
		if(session.getAttribute("linepic")!=null)
		{
			start=(int) session.getAttribute("linepic");
			
		}
		else
		{
			pic=0;
			session.setAttribute("linepic", pic);
		}
		List<Line> linelist=td.getLineList(start, 5);
		session.setAttribute("linelist", linelist);
		session.setAttribute("linepic", 0);
		req.getRequestDispatcher("/linelist.jsp").forward(req, resp);
	}

}
