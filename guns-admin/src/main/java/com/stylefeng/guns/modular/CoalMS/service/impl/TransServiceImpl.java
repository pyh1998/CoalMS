package com.stylefeng.guns.modular.CoalMS.service.impl;

import com.alibaba.fastjson.JSON;
import com.stylefeng.guns.modular.CoalMS.dao.TransMapper;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
import com.stylefeng.guns.modular.CoalMS.service.TransService;
import io.swagger.models.HttpMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Elliot
 * @since 2019-08-23
 */
@Service
public class TransServiceImpl implements TransService {

    @Autowired
    private TransMapper transMapper;

    public int insert(List<TVShipmain> list){
        return transMapper.insert(list);
    }

    public List<TVShipmain> listClient(String url, HttpMethod method){
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> response1 = template.getForEntity(url,String.class);
        String jsonString = response1.getBody();
        List<TVShipmain> tvShipmain = JSON.parseArray(jsonString,TVShipmain.class);
        return tvShipmain;
    }

    public Integer intClient(String url, HttpMethod method){
        RestTemplate template = new RestTemplate();
        ResponseEntity<Integer> response1 = template.getForEntity(url,int.class);
        return response1.getBody();
    }
}
