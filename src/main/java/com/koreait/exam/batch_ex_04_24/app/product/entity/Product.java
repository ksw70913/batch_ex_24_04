package com.koreait.exam.batch_ex_04_24.app.product.entity;

import com.koreait.exam.batch_ex_04_24.app.base.entity.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Getter

@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Product extends BaseEntity {
    private int salePrice;
    private int price;
    private int wholesalePrice;
    private String name;
    private String makerShopName;
    private boolean isSoldOut; // 관련 옵션들이 전부 판매불가 상태

    @Builder.Default
    @OneToMany(mappedBy = "product", cascade = ALL, orphanRemoval = true)
    private List<ProductOption> productOptions = new ArrayList<>();

    public void addOption(ProductOption option) {
        option.setProduct(this);
        option.setPrice(getPrice());
        option.setSalePrice(getSalePrice());
        option.setWholesalePrice(getWholesalePrice());

        productOptions.add(option);
    }
}