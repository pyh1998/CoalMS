package com.stylefeng.guns.modular.CoalMS.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.stylefeng.guns.modular.CoalMS.dao.TVShipmainMapper;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
import com.stylefeng.guns.modular.CoalMS.service.ShipService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ShipServiceImpl extends ServiceImpl<TVShipmainMapper, TVShipmain> implements ShipService {
    public List<Map<String, Object>> list_ship1(String dt_start, String dt_end) {
        return this.baseMapper.list_ship1(dt_start,dt_end);
    }

    public List<Map<String, Object>> list_ship2(String str_company, String dt_start, String dt_end) {
        return this.baseMapper.list_ship2(str_company,dt_start,dt_end);
    }

    public List<Map<String, Object>> list_ship3(String str_company, String dt_start, String dt_end) {
        return this.baseMapper.list_ship3(str_company,dt_start,dt_end);
    }

    public List<Map<String, Object>> list_ship7(String str_company,String str_fshipyearnumvcr, String dt_start, String dt_end) {
        return this.baseMapper.list_ship7(str_company,str_fshipyearnumvcr,dt_start,dt_end);
    }

    public List<Map<String, Object>> list_ship7_1(String str_company, String str_shipno) {
        return this.baseMapper.list_ship7_1(str_company,str_shipno);
    }

    public List<Map<String, Object>> list_ship8(String str_company, String str_shipno) {
        return this.baseMapper.list_ship8(str_company,str_shipno);
    }
    public List<Map<String, Object>> list_ship4(String str_company, String dt_start, String dt_end) {
        return this.baseMapper.list_ship4(str_company,dt_start,dt_end);
    }
}
