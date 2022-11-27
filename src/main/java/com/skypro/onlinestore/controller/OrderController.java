package com.skypro.onlinestore.controller;

import com.skypro.onlinestore.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/Store/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping ("/add")
    public void addItems (@RequestParam("id")List<Integer> idsToAdd){
        this.orderService.addToCart(idsToAdd);
    }

    @GetMapping ("/get")
    public List<Integer> getItems (){
        return this.orderService.getItems();
    }
}
