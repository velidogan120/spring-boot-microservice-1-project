package org.sha.springbootmicroservice1project.service;

import org.sha.springbootmicroservice1project.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
