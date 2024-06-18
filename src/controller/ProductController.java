package controller;

import model.dto.ProductDto;
import model.service.ProductService;
import model.service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductService productService = new ProductServiceImpl();

    public  void addNewProduct(ProductDto productDto){
        productService.addNewProduct(productDto);
    }

    public List<ProductDto> queryAllProduct(){
        return productService.queryAllProduct();
    }

    public ProductDto updateProductById(Integer id ){
        return productService.updateProdcutById(id);
    }

    public ProductDto deletedProductById(Integer id){
        return productService.deleteProductById(id);
    }

    public ProductDto searchProductById(Integer id){
        return  productService.searchProductById(id);
    }
}
