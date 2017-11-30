package controllers;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*B-importing-zone*/

@WebServlet("/ProductManager")
public class ProductManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Product> products;
       
    public ProductManager() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*B-login-point*/
		
		/*B-product-data-collection*/
	
		request.setAttribute("title", "Product Manager");
		request.setAttribute("products", products);
		RequestDispatcher view = request.getRequestDispatcher("product_manager.jsp");
		view.forward(request, response);

	}

}
