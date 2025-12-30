package com.example.productmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.productmanagement.entity.Item;
import com.example.productmanagement.repository.ItemRepository;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    // CREATE / UPDATE
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    // READ ALL
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    // READ BY ID
    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    // DELETE
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
