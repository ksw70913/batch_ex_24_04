package com.koreait.exam.batch_ex_04_24.app.cart.repostiory;

import com.koreait.exam.batch_ex_04_24.app.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    Optional<CartItem> findByMemberIdAndProductOptionId(long memberId, long cartOptionId);
}