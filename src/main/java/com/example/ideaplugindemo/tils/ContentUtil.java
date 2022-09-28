package com.example.ideaplugindemo.tils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

public class ContentUtil {
    public static String getContent() {
        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<Map> forEntity = new RestTemplate().getForEntity("https://api.nextrt.com/V1/Dutang", Map.class);
            HttpStatus statusCode = forEntity.getStatusCode();
            String content = "";
            if (statusCode.is2xxSuccessful()) {
                List data = (List) forEntity.getBody().get("data");
                Map<String, String> contontMap = (Map<String, String>) data.get(0);
                return contontMap.get("content");
            }
        } catch (Exception e) {
            return  "汤碗都碎了";
        }
        return "今天没有鸡汤";
    }
}