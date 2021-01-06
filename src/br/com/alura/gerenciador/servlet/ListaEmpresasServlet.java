package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
//@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresa();
		/*
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
        out.println("<ul>");
        
        for(Empresa empresa : lista) {
        	out.println("<li> " + empresa.getNome() + "</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");*/
        
        //jsp
        RequestDispatcher rd = request.getRequestDispatcher("/listagemEmpresas.jsp");
        request.setAttribute("lista", lista);
        rd.forward(request, response);
	}

}
