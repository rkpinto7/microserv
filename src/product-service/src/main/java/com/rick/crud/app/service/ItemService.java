package com.rick.crud.app.service;

import com.rick.crud.app.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
     public Item create(Item item);

     List<Item> getAllItems();


     Item getItemById(Integer id);

     Item update(Item item);

     String deleteItem(Integer id);

}
