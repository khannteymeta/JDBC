package model.dao;

import model.entity.Product;

import java.util.List;

public interface ProductDao {
    List<Product> queryAllProduct();
    int updateProductById(Integer id);
    int deleteProductById(Integer id);
    Product searchProductById(Integer id);
    int addNewProduct(Product product);
}
