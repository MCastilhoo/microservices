package com.example.PedidosAPI.Models;


import lombok.Data;

@Data
public class OrderedItemsEntity {
    private Long id;
    private ProductEntity product;
    private Integer quantity;
}
