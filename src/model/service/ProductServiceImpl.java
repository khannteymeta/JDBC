package model.service;

import model.dto.ProductDto;

import java.util.List;

public class ProductServiceImpl implements  ProductService{

    @Override
    public void addNewProduct(ProductDto productDto) {

    }

    @Override
    public List<ProductDto> queryAllProduct() {
        return List.of();
    }

    @Override
    public ProductDto updateProdcutById(Integer id) {
        return null;
    }

    @Override
    public ProductDto deleteProductById(Integer id) {
        return null;
    }

    @Override
    public ProductDto searchProductById(Integer id) {
        return null;
    }
}
