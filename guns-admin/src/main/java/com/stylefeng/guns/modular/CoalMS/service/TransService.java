package com.stylefeng.guns.modular.CoalMS.service;
import io.swagger.models.HttpMethod;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Elliot
 * @since 2019-08-23
 */
public interface TransService {

    int insert(Map<String, Object> tvShipmain);
    List<Map<String, Object>> client(String url, HttpMethod method, List<Map<String, Object>> params);
    Integer client(String url, HttpMethod method);
}
