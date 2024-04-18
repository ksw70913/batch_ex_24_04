package com.koreait.exam.batch_ex_04_24.app.product.repository;

import com.koreait.exam.batch_ex_04_24.app.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}