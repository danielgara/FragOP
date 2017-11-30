Fragment Login-AlterProductManager { 
   Action: add 
   FragmentationPoint: login-point
   PointBracketsLan: java
   Destination: ProductManager-ProductManager
   SourceCode: [ALTERCODE-FRAG]HttpSession session = request.getSession();
		String admin = (String) session.getAttribute("admin");
		
		if(admin != "1"){
			response.sendRedirect("Home");
			return;
		}[/ALTERCODE-FRAG]
}