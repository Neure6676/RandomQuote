package com.zhenyuan.GetKey.controller;

import com.zhenyuan.GetKey.service.IGetKeyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class GetKeyController {

    private IGetKeyService iGetKeyService;

    @GetMapping(value = "/GetKey")
    public ResponseEntity<?> getWeather() {
        return ResponseEntity.ok(iGetKeyService.getKey());
    }

}
