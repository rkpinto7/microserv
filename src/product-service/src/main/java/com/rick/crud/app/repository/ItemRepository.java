package com.rick.crud.app.repository;

import com.rick.crud.app.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
