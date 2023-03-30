package com.ChinaMarket.Ecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item")
@Builder
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int requiredQuantity;
    @ManyToOne
    @JoinColumn
    Cart cart;

    @OneToOne
    @JoinColumn
    Product product;
    @ManyToOne
    @JoinColumn
    Ordered order;

}
