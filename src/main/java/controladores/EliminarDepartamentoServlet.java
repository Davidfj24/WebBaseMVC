package controladores;

import java.io.IOException;

import dao.DepartamentoDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EliminarDepartamentoServlet
 */
public class EliminarDepartamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarDepartamentoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Si viene desde aquí lo envíamos a mostrar
		response.sendRedirect("mostrar");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Hay que eliminar el departamento.
		String codDepto = request.getParameter("codDepto");
		
		DepartamentoDAO daoDpto = new DepartamentoDAO();
		
		daoDpto.eliminarDepartamento(codDepto);
	}

}
