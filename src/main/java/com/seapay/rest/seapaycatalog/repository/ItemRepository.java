package com.seapay.rest.seapaycatalog.repository;

import com.seapay.rest.seapaycatalog.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
