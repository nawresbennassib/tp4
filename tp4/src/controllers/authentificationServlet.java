package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modeles.authentificationBean;

/**
 * Servlet implementation class authentificationServlet
 */
@WebServlet("/authentificationServlet")
public class authentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public authentificationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		 authentificationBean  authentificationBean = new authentificationBean();
		 authentificationBean.setLogin(login);
		 authentificationBean.setPassword(password);

		if( authentificationBean.authentifier(login, password)){
			session.setAttribute("internaute", authentificationBean);
			this.getServletContext().getRequestDispatcher( "/authentification.jsp" ).forward( request, response );
		} else {
			this.getServletContext().getRequestDispatcher( "/authentification.html" ).forward( request, response );
		}
	}
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
