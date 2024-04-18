package com.koreait.exam.batch_ex_04_24.app.product.entity;

import com.koreait.exam.batch_ex_04_24.app.base.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class ProductOption extends BaseEntity {
    private String color;
    private String size;
    private int price;

    @ManyToOne(fetch = LAZY)
    private Product product;

    private boolean isSoldOut; // 사입처에서의 품절여부
    private int stockQuantity; // 쇼핑몰에서 보유한 물건 갯수

    public ProductOption(String color, String size) {
        this.color = color;
        this.size = size;
    }
}