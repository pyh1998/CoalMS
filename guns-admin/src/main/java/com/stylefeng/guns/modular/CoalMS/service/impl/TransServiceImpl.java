package com.stylefeng.guns.modular.CoalMS.service.impl;

import com.stylefeng.guns.modular.CoalMS.dao.TransMapper;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
import com.stylefeng.guns.modular.CoalMS.service.TransService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.swagger.models.HttpMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public int insert(Map<String, Object> tvShipmain){
        return transMapper.insert(tvShipmain);
    }

    public List<Map<String, Object>> client(String url, HttpMethod method, List<Map<String, Object>> params){
        RestTemplate template = new RestTemplate();
        ResponseEntity<List> response1 = template.getForEntity(url,List.class);
        return response1.getBody();

    }

    public Integer client(String url, HttpMethod method){
        RestTemplate template = new RestTemplate();
        ResponseEntity<Integer> response1 = template.getForEntity(url,int.class);
        return response1.getBody();

    }
}
