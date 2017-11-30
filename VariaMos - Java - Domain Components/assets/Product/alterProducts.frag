Fragment Product-AlterProducts { 
   Action: add 
   FragmentationPoint: product-data-collection
   PointBracketsLan: java
   Destination: ListOfProducts-Products
   SourceCode: [ALTERCODE-FRAG]products = Product.get_all();[/ALTERCODE-FRAG]
}

Fragment Product-AlterProducts2 { 
   Action: add 
   FragmentationPoint: importing-zone
   PointBracketsLan: java
   Destination: ListOfProducts-Products
   SourceCode: [ALTERCODE-FRAG]import models.Product;[/ALTERCODE-FRAG]
}