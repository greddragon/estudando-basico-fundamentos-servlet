package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.Acao;
import br.com.alura.gerenciador.acao.AlterarEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresaForm;
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
		
		//String nome = null;
		
		
		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
		
		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse);
			Object obj = classe.newInstance();
			Acao acao = (Acao) obj;
			nome = acao.executar(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			
			throw new ServletException(e);
		}
		
        String[] tipoEEndereco = nome.split(":");
        if(tipoEEndereco[0].equals("forward")) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + tipoEEndereco[1]);
            rd.forward(request, response);
        } else {
            response.sendRedirect(tipoEEndereco[1]);

        }

        /*if(paramAcao.equals("ListaEmpresas")) {
     
            
            ListaEmpresas listagem = new ListaEmpresas();
            nome = listagem.executar(request, response);
            
        } else if(paramAcao.equals("RemoveEmpresa")) {
            
            RemoveEmpresa acao = new RemoveEmpresa();
            nome = acao.executar(request, response);
            
            
        } else if(paramAcao.equals("MostraEmpresa")) {
            
            MostraEmpresa acao = new MostraEmpresa();
            nome = acao.executar(request, response);
            
        } else if(paramAcao.equals("AlterarEmpresa")) {
            
            AlterarEmpresa acao = new AlterarEmpresa();
            nome = acao.executar(request, response);
            
        } else if(paramAcao.equals("NovaEmpresa")) {
        	
            System.out.println("criando dados da empresa");
            
            NovaEmpresa acao = new NovaEmpresa();
            nome = acao.executar(request, response);
            
        }else if (paramAcao.equals("NovaEmpresaForm")) {

            NovaEmpresaForm acao = new NovaEmpresaForm();
            nome = acao.executa(request, response);
        }
        */
        
}
        
		
	

}
