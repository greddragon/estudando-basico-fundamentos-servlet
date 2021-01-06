package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlterarEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao"); 

        if(paramAcao.equals("ListaEmpresas")) {
     
            
            ListaEmpresas listagem = new ListaEmpresas();
            listagem.executar(request, response);
            
        } else if(paramAcao.equals("RemoveEmpresa")) {
        	
            System.out.println("removendo empresa");
            
           RemoveEmpresa acao = new RemoveEmpresa();
           acao.executar(request, response);
            
            
        } else if(paramAcao.equals("MostraEmpresa")) {
        	
            System.out.println("mostrando dados da empresa");
            
            MostraEmpresa acao = new MostraEmpresa();
            acao.executar(request, response);
            
        } else if(paramAcao.equals("AlterarEmpresa")) {
        	
            System.out.println("Alterando dados da empresa");
            
            AlterarEmpresa acao = new AlterarEmpresa();
            acao.executar(request, response);
            
        } else if(paramAcao.equals("NovaEmpresa")) {
        	
            System.out.println("criando dados da empresa");
            
            NovaEmpresa acao = new NovaEmpresa();
            acao.executar(request, response);
        }
        
		
	}

}
