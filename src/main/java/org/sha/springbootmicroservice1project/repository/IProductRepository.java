package org.sha.springbootmicroservice1project.repository;

import org.sha.springbootmicroservice1project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
