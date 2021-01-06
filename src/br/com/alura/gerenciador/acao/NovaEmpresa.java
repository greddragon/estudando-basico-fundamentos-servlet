package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa {
	public void executar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 
		 String nomeEmpresa = request.getParameter("nome");
		 Empresa empresa = new Empresa();
		 empresa.setNome(nomeEmpresa);
		 
		 Banco banco = new Banco();
		 banco.adiciona(empresa);
		 
		 response.sendRedirect("entrada?acao=ListaEmpresas");
	}
}
