package com.ChinaMarket.Ecommerce.Model;

import com.ChinaMarket.Ecommerce.Enum.ProductCategory;
import com.ChinaMarket.Ecommerce.Enum.ProductStatus;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String productName;
    private int price;
    private int quantity;
    @Enumerated(EnumType.STRING)
    ProductCategory productCategory;
    @Enumerated(EnumType.STRING)
    ProductStatus productStatus;
    @ManyToOne
    @JoinColumn
    Seller seller;
    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
    Item item;
}
