package hibernateProduct;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Servlet implementation class ProductManager
 */
//@WebServlet("/ProductManager")
public class ProductManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("product-name");
		int stock = Integer.parseInt(request.getParameter("stock"));
		
		Product p1 = new Product();
		p1.setProduct_name(name);
		p1.setStocks(stock);
		
		Configuration config = new Configuration();
		config.addAnnotatedClass(Product.class);
		
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		int isSaved = (Integer)session.save(p1);
		
		session.getTransaction().commit();
		
		if(isSaved > 0) {
			out.println("Record inserted successfully...");
		} else {
			out.println("Record insertion failed...");
		}

		doGet(request, response);
	}

}
