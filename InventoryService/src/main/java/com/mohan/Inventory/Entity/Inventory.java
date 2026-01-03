package com.mohan.Inventory.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data; // Ensure this import exists
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name = "inventory")
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_code", nullable = false, unique = true)
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    private String category;

    private int quantity;

    @Column(name = "reserved_quantity")
    private int reservedQuantity;

    private BigDecimal price;

    private String status;

    @Column(name = "warehouse_location")
    private String warehouseLocation;

    @UpdateTimestamp
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;
}
