package com.stylefeng.guns.modular.CoalMS.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TVShipmainMapper extends BaseMapper<TVShipmain> {

    List<Map<String, Object>> list_ship3(@Param("str_company") String str_company, @Param("dt_start") String dt_start, @Param("dt_end") String dt_end);
    List<Map<String, Object>> list_ship4(@Param("str_company") String str_company, @Param("dt_start") String dt_start, @Param("dt_end") String dt_end);
}
