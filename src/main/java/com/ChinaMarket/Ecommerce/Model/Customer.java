package com.ChinaMarket.Ecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String name;
    private int age;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String mobNo;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Card> cards=new ArrayList<>();
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    Cart cart;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Ordered> ordereds=new ArrayList<>();

}
