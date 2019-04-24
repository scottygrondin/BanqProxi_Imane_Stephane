package org.gestion.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gestion.model.Conseiller;

/**
 * Servlet implementation class ServletAuthentification QUI AUTORISE UN
 * CONSEILLER A AJOUTER UN CLIENT DANS LA BDD
 * 
 * @auteurs Imane et Stéphane
 *
 *
 */
@WebServlet("/login2")
public class ServletAuthentification2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String NAME = "stef";
	private static final String PSWD = "ngu";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletAuthentification2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("user");
		String pwd = request.getParameter("password");

		Conseiller cs = new Conseiller();

//service.createUser(u);
		request.setAttribute("conseiller", cs);
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ShowUser.jsp");
//		requestDispatcher.forward(request, response);

		RequestDispatcher requestDispatcher;
		if ((NAME.equalsIgnoreCase(login) && (PSWD.equalsIgnoreCase(pwd)))) {
			requestDispatcher = request.getRequestDispatcher("/WEB-INF/formulaireClient.html");
			System.out.println("le motdePasse et le nom sont corrects, OUAIS!!!");
		} else {
			System.out.println("                                   refaites votre demande SVPPPP!!!!");
			requestDispatcher = request.getRequestDispatcher("/WEB-INF/AuthentificationEchec.html");
		}
		requestDispatcher.forward(request, response);
		System.out.println("ici c'est la servlet par exemple nom =" + login + " et le passmot est " + pwd);
		System.out.println("le conseiller reste " + cs);
	}

}
