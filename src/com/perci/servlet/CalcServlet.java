package com.perci.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.perci.service.Calculadora;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalcServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calculadora c=new Calculadora();
		double resultado=0.0;
		// Parametros
		double numero1 = Double.parseDouble(request.getParameter("numero1"));
		double numero2 = Double.parseDouble(request.getParameter("numero2"));
		String opcion= request.getParameter("operacion");
		// Proceso
		if(opcion.equals("suma"))
		resultado=c.sumar(numero1, numero2);
		else if(opcion.equals("resta"))
		resultado=c.restar(numero1, numero2);
		else if(opcion.equals("multiplicacion"))
		resultado=c.multiplicar(numero1, numero2);
		else if(opcion.equals("division"))
		resultado=c.dividir(numero1, numero2);
		else if(opcion.equals("resto"))
		resultado=c.resto(numero1, numero2);		
			
		// Enviar datos al JSP
				request.setAttribute("res", resultado);
				RequestDispatcher rd = request.getRequestDispatcher("res.jsp");
				rd.forward(request, response);
		
	}

}
