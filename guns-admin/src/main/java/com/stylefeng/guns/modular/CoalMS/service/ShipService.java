package com.stylefeng.guns.modular.CoalMS.service;

import com.baomidou.mybatisplus.service.IService;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;

import java.util.List;
import java.util.Map;

public interface ShipService extends IService<TVShipmain> {
    List<Map<String, Object>> list_ship3(String str_company, String dt_start, String dt_end);
    List<Map<String, Object>> list_ship4(String str_company, String dt_start, String dt_end);

}
