package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import java.util.List;
import java.util.UUID;

public interface ProductService {
    public Product createProduct(Product product);
    public List<Product> findAll();
    public Product findProductById(UUID id);
    public Product editProduct(Product product);
    public Product deleteProduct(Product product);
}