package com.mohan.Order.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohan.Order.Service.OrderService;
import com.mohan.Order.dto.OrderRequest;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest request) {
        return orderService.placeOrder(request);
    }
}

