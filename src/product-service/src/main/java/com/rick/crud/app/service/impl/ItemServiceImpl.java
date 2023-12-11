package com.rick.crud.app.service.impl;

import com.rick.crud.app.model.Item;
import com.rick.crud.app.repository.ItemRepository;
import com.rick.crud.app.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository  itemRepository;

    @Override
    public Item create(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Integer id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public Item update(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public String deleteItem(Integer id) {
        itemRepository.deleteById(id);
        return "Deleted ID  " + String.valueOf(id);
    }


}
