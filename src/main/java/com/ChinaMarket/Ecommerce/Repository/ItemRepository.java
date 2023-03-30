package com.ChinaMarket.Ecommerce.Repository;

import com.ChinaMarket.Ecommerce.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
