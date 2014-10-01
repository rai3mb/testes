package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;

@WebFilter(urlPatterns="/*")
public class FiltroDeAuditoria implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest requisicao = (HttpServletRequest) req;
		String uri = requisicao.getRequestURI();
		
		String usuario = getUsuario(requisicao);
		
		System.out.println("Usuario " + usuario + " acessando a URI " + uri);
		chain.doFilter(req, resp);
		
	}

	private String getUsuario(HttpServletRequest requisicao) {
        Usuario usuarioLogado = (Usuario) requisicao.getSession().getAttribute("usuarioLogado");
        if ( usuarioLogado != null )
        	return usuarioLogado.getEmail();
        else
        	return "[nao logado]";
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}


}
