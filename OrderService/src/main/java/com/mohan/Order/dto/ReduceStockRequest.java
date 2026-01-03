package com.mohan.Order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReduceStockRequest {
    private String productCode;
    private int quantity;
}
