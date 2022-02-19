package com.example.neoflex.Hack30.controller;

import com.example.neoflex.Hack30.dao.CurrencyRate;
import com.example.neoflex.Hack30.repo.CurrencyRateRepo;
import lombok.AllArgsConstructor;
import org.intellij.lang.annotations.Language;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("candles")
public class CurrencyRateController {

//    private final CurrencyRateRepo currencyRateRepo;

    @GetMapping(produces = "application/json")
    public ResponseEntity<String> getAll() {

        return new ResponseEntity<>(
//        @Language("json")
                        """
                        [[
                            1582122600000,
                            80,
                            81.14,
                            80,
                            80.9
                          ],
                          [
                            1582209000000,
                            80.66,
                            81.16,
                            79.55,
                            80.07
                          ],
                          [
                            1582295400000,
                            79.65,
                            80.11,
                            77.63,
                            78.26
                          ],
                          [
                            1582554600000,
                            74.32,
                            76.04,
                            72.31,
                            74.54
                          ],
                          [
                            1582641000000,
                            75.24,
                            75.63,
                            71.53,
                            72.02
                          ],
                          [
                            1582727400000,
                            71.63,
                            74.47,
                            71.63,
                            73.16
                          ],
                          [
                            1582813800000,
                            70.28,
                            71.5,
                            68.24,
                            68.38
                          ],
                          [
                            1582900200000,
                            64.32,
                            69.6,
                            64.09,
                            68.34
                          ],
                          [
                            1583159400000,
                            70.57,
                            75.36,
                            69.43,
                            74.7
                          ],
                          [
                            1583245800000,
                            75.92,
                            76,
                            71.45,
                            72.33
                          ]]""", HttpStatus.OK);
//        return new ResponseEntity<>(currencyRateRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "last", produces = "application/json")
    public ResponseEntity<String> getLast() {
            return new ResponseEntity<>("""
                          [
                            1583245800000,
                            75.92,
                            76,
                            71.45,
                            72.33
                          ]""", HttpStatus.OK);
    }
}
