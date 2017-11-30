Fragment Product-AlterProductManager { 
   Action: add 
   FragmentationPoint: product-data-collection
   PointBracketsLan: java
   Destination: ProductManager-ProductManager
   SourceCode: [ALTERCODE-FRAG]products = Product.get_all();[/ALTERCODE-FRAG]
}

Fragment Product-AlterProductManager2 { 
   Action: add 
   FragmentationPoint: importing-zone
   PointBracketsLan: java
   Destination: ProductManager-ProductManager
   SourceCode: [ALTERCODE-FRAG]import models.Product;[/ALTERCODE-FRAG]
}