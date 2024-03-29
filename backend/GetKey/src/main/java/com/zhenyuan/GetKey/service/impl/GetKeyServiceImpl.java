package com.zhenyuan.GetKey.service.impl;

import com.zhenyuan.GetKey.service.IGetKeyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.Random;

@Service
@AllArgsConstructor
@Slf4j
public class GetKeyServiceImpl implements IGetKeyService {

    @Override
    public String getKey() {

        // get random key
        Random rand = new Random();

        String key = String.valueOf(rand.nextInt(1000000));

        return key;

    }

}
