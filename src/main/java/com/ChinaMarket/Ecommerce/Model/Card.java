package com.ChinaMarket.Ecommerce.Model;

import com.ChinaMarket.Ecommerce.Enum.CardType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "card")
@Builder
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(unique = true)
    private String cardNo;
    private int CVV;
    @Enumerated(EnumType.STRING)
    private CardType cardType;
    @ManyToOne
    @JoinColumn
    Customer customer;

}
