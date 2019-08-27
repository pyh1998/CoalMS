package com.stylefeng.guns.modular.CoalMS.controller;

import com.stylefeng.guns.modular.CoalMS.service.HttpService;
import io.swagger.models.HttpMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/http")
public class HttpController {

    @Autowired
    HttpService httpService;
    @RequestMapping(value = "/http1")
    public List<Map<String, Object>> HTTP(){
        String url = "http://localhost:8081/data/select";
        HttpMethod method = HttpMethod.GET;
        List<Map<String, Object>> params = new ArrayList<>();
        System.out.println(httpService.client(url,method,params));
        return httpService.client(url,method,params);
    }
}
