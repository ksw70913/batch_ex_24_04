package com.koreait.exam.batch_ex_04_24.app.cart.service;

import com.koreait.exam.batch_ex_04_24.app.cart.entity.CartItem;
import com.koreait.exam.batch_ex_04_24.app.cart.repostiory.CartItemRepository;
import com.koreait.exam.batch_ex_04_24.app.member.entity.Member;
import com.koreait.exam.batch_ex_04_24.app.product.entity.ProductOption;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartItemRepository cartItemRepository;

    public CartItem addItem(Member member, ProductOption productOption, int quantity) {
        CartItem oldCartItem = cartItemRepository.findByMemberIdAndProductOptionId(member.getId(),productOption.getId()).orElse(null);

        if(oldCartItem != null){
            oldCartItem.setQuantity(oldCartItem.getQuantity()+quantity);
            cartItemRepository.save(oldCartItem);

            return oldCartItem;
        }
        CartItem cartItem = CartItem.builder()
                .member(member)
                .productOption(productOption)
                .quantity(quantity)
                .build();

        cartItemRepository.save(cartItem);

        return cartItem;
    }
}