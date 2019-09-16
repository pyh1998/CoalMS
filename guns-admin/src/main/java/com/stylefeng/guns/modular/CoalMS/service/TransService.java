package com.stylefeng.guns.modular.CoalMS.service;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
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

    int insert(List<TVShipmain> list);
    List<TVShipmain> listClient(String url, HttpMethod method);
    Integer intClient(String url, HttpMethod method);
}
