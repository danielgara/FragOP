package clothingstores.complete.controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import clothingstores.complete.models.Product;
/*** added by dProducts* modified by dAlterProducts
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Products() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse
		response) throws ServletException, IOException {
		request.setAttribute("title", "Products");
		request.setAttribute("products", products);
		RequestDispatcher view = request.getRequestDispatcher("list_products.jsp");
		view.forward(request, response);
	}
	/*** added by dAlterProducts
	 */
	List<Product> products = Product.get_all();
}