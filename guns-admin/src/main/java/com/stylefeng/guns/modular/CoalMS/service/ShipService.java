package com.stylefeng.guns.modular.CoalMS.service;

import com.baomidou.mybatisplus.service.IService;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;

import java.util.List;
import java.util.Map;

public interface ShipService extends IService<TVShipmain> {
    List<Map<String, Object>> list_ship1(String dt_start, String dt_end);
    List<Map<String, Object>> list_ship2(String str_company, String dt_start, String dt_end);
    List<Map<String, Object>> list_ship3(String str_company, String dt_start, String dt_end);
    List<Map<String, Object>> list_ship4(String str_company, String dt_start, String dt_end);
    List<Map<String, Object>> list_ship6(String str_company, String dt_year);

    List<Map<String, Object>> list_ship7(String str_company, String str_fshipyearnumvcr, String dt_start, String dt_end);
    List<Map<String, Object>> list_ship7_1(String str_company, String str_shipno);
    List<Map<String, Object>> list_ship8(String str_company, String str_shipno,String dt_start,String dt_end);

    @Override
    boolean insert(TVShipmain tvShipmain);

    List<Map<String, Object>> list_ship5(String str_company, String dt_start, String dt_end);

    List<Map<String, Object>> list_ship5D(String str_company, String dt_start, String dt_end, String str_state);
}
