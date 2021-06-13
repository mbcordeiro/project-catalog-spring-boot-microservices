package com.matheuscordeiro.projectcatalog.repositories;

import com.matheuscordeiro.projectcatalog.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByName(String name);
}
