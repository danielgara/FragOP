package clothingstores.complete.controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import clothingstores.complete.models.Product;
/*** added by dProductManager* modified by dAlterProductManager
 */
@WebServlet("/ProductManager")
public class ProductManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ProductManager() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse
		response) throws ServletException, IOException {
		request.setAttribute("title", "Product Manager");
		request.setAttribute("products", products);
		RequestDispatcher view =
		request.getRequestDispatcher("product_manager.jsp");
		view.forward(request, response);
	}
	/*** added by dAlterProductManager
	 */
	List<Product> products = Product.get_all();
}