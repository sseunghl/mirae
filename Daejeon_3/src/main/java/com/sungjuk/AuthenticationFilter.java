package com.sungjuk;



import java.io.IOException;



import javax.servlet.Filter;

import javax.servlet.FilterChain;

import javax.servlet.FilterConfig;

import javax.servlet.ServletContext;

import javax.servlet.ServletException;

import javax.servlet.ServletRequest;

import javax.servlet.ServletResponse;

import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpFilter;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;



//filter : servlet 실행전에 작동

//공통 기능을 정의하는데 사용(인증, 권한 부여, 압축)

@WebFilter("/AuthenticationFilter")

public class AuthenticationFilter extends HttpFilter implements Filter {

	private ServletContext context;

    public AuthenticationFilter() {

        super();

    }

    //초기화 동작

    public void init(FilterConfig fConfig) throws ServletException{

    	this.context = fConfig.getServletContext();

    	this.context.log("로깅 필터가 초기화되었습니다.");

    }

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		HttpServletResponse res = (HttpServletResponse) response;

		String uri = req.getRequestURI();

		this.context.log("Requestd Resource : "+uri);

		HttpSession session = req.getSession(false);

		//html 통과

		//jsp와 servlet은 통과시키지 않음

		//세션은 jsp와 servlet을 사용할 때 생성

		if(session==null && !(uri.endsWith("html") || uri.endsWith("LoginServlet"))) { 

			this.context.log("인증되지 않은 요청입니다.");

			res.sendRedirect("login.html");			

		}

		else {

			chain.doFilter(request, response);

		}

	}

}