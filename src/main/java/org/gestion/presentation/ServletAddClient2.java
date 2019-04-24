package org.gestion.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gestion.model.Client;
import org.gestion.persistance.ClientPersist;

/**
 * Servlet implementation class ServletAddClient2 permettant à un conseiller
 * authentifié de rajouter un client automatiquement à la BDD
 * 
 * @auteurs Imane et Stéphane
 *
 */
@WebServlet("/AddClient2")
public class ServletAddClient2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ClientPersist dao = new ClientPersist();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletAddClient2() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      
	 *      NON UTILISE
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      
	 *      RECUPERATION DU NOM ET DU PRENOM RENTRES DANS LA PAGE formulaireClient
	 *      PUIS ILS SONT AJOUTES A LA BDD CLIENT
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");

		Client cli = new Client(nom, prenom);

		System.out.println(cli);

//		Client cli2 = new Client("Alfred", "BiBLO");

//		cliper.addclient(cli2);
		dao.addclient(cli);

	}
}
