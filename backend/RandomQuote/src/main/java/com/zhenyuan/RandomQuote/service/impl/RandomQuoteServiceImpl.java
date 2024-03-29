package com.zhenyuan.RandomQuote.service.impl;

import com.zhenyuan.RandomQuote.service.IRandomQuoteService;
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
public class RandomQuoteServiceImpl implements IRandomQuoteService {

    private static final String getKeyUrl = "http://localhost:8081/api/v1/GetKey";

    private static final String url = "http://api.forismatic.com/api/1.0/";

    private RestTemplate restTemplate;

    @Override
    public String getQuote() {
        try {

            // get random key
            String key = restTemplate.exchange(getKeyUrl, HttpMethod.GET, new HttpEntity<>(new HttpHeaders()), String.class).getBody();

            // get full url
            String method = "getQuote";
            String format = "json";
            String lang = "en";
            String fullUrl = String.format(url.concat("?method=%s").concat("&key=%s").concat("&format=%s").concat("&lang=%s"), method, key, format, lang);

            // call api
            ResponseEntity<String> response = restTemplate.exchange(fullUrl, HttpMethod.GET, new HttpEntity<>(new HttpHeaders()), String.class);

            return response.getBody();

        } catch (Exception e) {
            log.error("Some thing went wrong when connecting services", e);
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Exception when calling our services",
                    e
            );
        }
    }

}
