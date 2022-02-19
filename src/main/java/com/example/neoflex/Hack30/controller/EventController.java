package com.example.neoflex.Hack30.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.websocket.server.PathParam;
import java.util.*;

@RestController
@RequestMapping("events")
public class EventController {

    Map<String, List<Double>> cache = new HashMap<>();

    @PostMapping("{currencyName}/{currencyRate}")
    public ResponseEntity<String> add(@PathVariable String currencyName,
                                      @PathVariable double currencyRate) {

        cache.compute(currencyName, (s, v) -> {
            if (v == null)
                return new ArrayList(Collections.singleton(currencyRate));
            v.add(currencyRate);
            return v;
        });

        // TODO: 19.02.2022 добавить в БД запись о подписке на валюту и rate
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{currencyName}/{currencyRate}")
    public ResponseEntity<String> delete(@PathVariable String currencyName,
                                         @PathVariable double currencyRate) {

        cache.compute(currencyName, (s, v) -> {
            if (v == null)
                return null;

            if (v.contains(currencyRate))
                v.add(currencyRate);

            return v;
        });

        // TODO: 19.02.2022 удалить из БД запись о подписке на валюту и rate
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<String> getAll() {
        return new ResponseEntity<>(cache.toString(), HttpStatus.OK);
    }
}
