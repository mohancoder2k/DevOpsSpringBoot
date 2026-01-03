package com.mohan.Inventory.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohan.Inventory.Entity.Inventory;
import com.mohan.Inventory.Repository.InventoryRepository;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public boolean isInStock(String productCode) {
        return inventoryRepository
                .findByProductCode(productCode)
                .map(inv -> (inv.getQuantity() - inv.getReservedQuantity()) > 0)
                .orElse(false);
    }

    public Inventory getProductDetails(String productCode) {
        return inventoryRepository
                .findByProductCode(productCode)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
    public void reduceStock(String productCode, int quantity) {

        Inventory inventory = inventoryRepository
                .findByProductCode(productCode)
                .orElseThrow(() ->
                        new RuntimeException("Product not found: " + productCode)
                );

        if (inventory.getQuantity() < quantity) {
            throw new RuntimeException("Insufficient stock");
        }

        inventory.setQuantity(inventory.getQuantity() - quantity);

        inventoryRepository.save(inventory);
    }
}
