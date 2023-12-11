package com.rick.crud.app.controller;

import com.rick.crud.app.model.Item;
import com.rick.crud.app.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class CatalogController {

    @Autowired
    ItemService itemService;
    @GetMapping("")
    public List<Item> getItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Integer id) {
        return itemService.getItemById(id);
    }

    @PostMapping("/store")
    public Item saveItem(@RequestBody Item item) {
        return itemService.create(item);
    }

    @PutMapping("/update")
    public Item updateItem(@RequestBody Item item) {
        return itemService.update(item);

    }

    @DeleteMapping("/delete/{id}")
        public String deleteItem(@PathVariable Integer id) {
            return itemService.deleteItem(id);
        }


}

