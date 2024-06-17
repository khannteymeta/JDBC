package model.service;
import model.dto.ProductDto;
import java.util.List;

public interface ProductService {
    void addNewProduct(ProductDto productDto);
    List<ProductDto> queryAllProduct();
    ProductDto updateProdcutById(Integer id);
    ProductDto deleteProductById(Integer id);
    ProductDto searchProductById(Integer id);
}
