package com.zhenyuan.RandomQuote.controller;

import com.zhenyuan.RandomQuote.service.IRandomQuoteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class RandomQuoteController {

    private IRandomQuoteService iRandomQuoteService;

    @GetMapping(value = "/RandomQuote")
    public ResponseEntity<?> getWeather() {
        return ResponseEntity.ok(iRandomQuoteService.getQuote());
    }

}
