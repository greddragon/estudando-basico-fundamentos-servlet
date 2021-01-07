package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresa implements Acao{

	
	public String executar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco.removeEmpresa(id);
		
		//response.sendRedirect("entrada?acao=ListaEmpresas");
		
		return "redirect:entrada?acao=ListaEmpresas";
		
	}
}
