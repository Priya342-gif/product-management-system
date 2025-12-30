package com.example.productmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productmanagement.entity.Product;
import com.example.productmanagement.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product addProduct(Product p) {
        return repo.save(p);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product updateProduct(Long id, Product p) {
        p.setId(id);
        return repo.save(p);
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
}
