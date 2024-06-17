package model.service;
import model.dto.ProductDto;
import java.util.List;

public interface ProductService {
    void addNewProduct(ProductDto productDto);
    List<ProductDto> queryAllProduct();
    ProductDto updateProdcutById(ProductDto productDto);
    ProductDto deleteProductById(ProductDto productDto);
    ProductDto searchProductById(ProductDto productDto);
}
