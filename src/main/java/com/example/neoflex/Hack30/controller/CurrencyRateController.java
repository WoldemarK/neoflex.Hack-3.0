package com.example.neoflex.Hack30.controller;

import com.example.neoflex.Hack30.entity.CurrencyRate;
import com.example.neoflex.Hack30.repo.CurrencyRateRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("rates")
public class CurrencyRateController {
    private final CurrencyRateRepo currencyRateRepo;

    @GetMapping
    public ResponseEntity<List<CurrencyRate>> getRates(){
        return new ResponseEntity<>(currencyRateRepo.findAll(), HttpStatus.OK);
    }

    
}
