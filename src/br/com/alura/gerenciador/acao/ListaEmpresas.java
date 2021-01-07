package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao{
	
	public String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresa();
		
        //jsp
        //RequestDispatcher rd = request.getRequestDispatcher("/listagemEmpresas.jsp");
        request.setAttribute("lista", lista);
       // rd.forward(request, response);
        
        return "forward:listagemEmpresas.jsp";
	}

}
