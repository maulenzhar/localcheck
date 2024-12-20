package com.example.demo.controller;

import java.util.*;
import java.util.stream.Collectors;

class PayerDto {
    private Integer payerId;
    private String payerName;

    // Конструктор
    public PayerDto(Integer payerId, String payerName) {
        this.payerId = payerId;
        this.payerName = payerName;
    }

    // Геттеры
    public Integer getPayerId() {
        return payerId;
    }

    public String getPayerName() {
        return payerName;
    }

    @Override
    public String toString() {
        return payerName;
    }
}