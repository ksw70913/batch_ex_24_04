package com.koreait.exam.batch_ex_04_24.app.product.repository;

import com.koreait.exam.batch_ex_04_24.app.product.entity.Product;
import com.koreait.exam.batch_ex_04_24.app.product.entity.ProductBackup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductBackupRepository extends JpaRepository<ProductBackup, Long> {

    Optional<ProductBackup> findByProductId(Long productId);
}