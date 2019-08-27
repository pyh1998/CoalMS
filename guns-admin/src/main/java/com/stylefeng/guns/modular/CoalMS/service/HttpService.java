package com.stylefeng.guns.modular.CoalMS.service;
import io.swagger.models.HttpMethod;
import org.springframework.http.ResponseEntity;
import  org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.List;


@Service
public class HttpService {

    public  List<Map<String, Object>> client(String url, HttpMethod method, List<Map<String, Object>> params){
        RestTemplate template = new RestTemplate();
        ResponseEntity<List> response1 = template.getForEntity(url,List.class);
        List<Map<String, Object>> list = response1.getBody();
        for (int i = 0; i < list.size(); i++) {
            Map map = list.get(i);
            System.out.println(list.get(i));
        }

        System.out.println(response1.getBody());
        return response1.getBody();

    }
}
