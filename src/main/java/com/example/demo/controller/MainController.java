package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity<List<PayerDto>> root() {

        List<PayerDto> payers = Arrays.asList(
                new PayerDto(1, "Banana"),
                new PayerDto(2, "Allied Bank"),
                new PayerDto(3, "Apple"),
                new PayerDto(4, "All American"),
                new PayerDto(5, "Orange"),
                new PayerDto(6, "All Star")
        );

        List<PayerDto> sortedPayers = payers.stream()
                .sorted(Comparator.comparing((PayerDto p) -> !p.getPayerName().startsWith("All"))
                        .thenComparing(PayerDto::getPayerName))
                .collect(Collectors.toList());

        return new ResponseEntity<>(sortedPayers, HttpStatus.OK);
    }
}
