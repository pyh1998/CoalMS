package com.stylefeng.guns.modular.CoalMS.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TVShipmainMapper extends BaseMapper<TVShipmain> {
    List<Map<String, Object>> list_ship1(@Param("dt_start") String dt_start, @Param("dt_end") String dt_end);

    List<Map<String, Object>> list_ship2(@Param("str_company") String str_company, @Param("dt_start") String dt_start, @Param("dt_end") String dt_end);

    List<Map<String, Object>> list_ship3(@Param("str_company") String str_company, @Param("dt_start") String dt_start, @Param("dt_end") String dt_end);
    List<Map<String, Object>> list_ship7(@Param("str_company") String str_company, @Param("str_fshipyearnumvcr") String str_fshipyearnumvcr,@Param("dt_start") String dt_start, @Param("dt_end") String dt_end);
    List<Map<String, Object>> list_ship7_1(@Param("str_company") String str_company, @Param("str_shipno") String str_shipno);
    List<Map<String, Object>> list_ship8(@Param("str_company") String str_company, @Param("str_shipno") String str_shipno);
    List<Map<String, Object>> list_ship4(@Param("str_company") String str_company, @Param("dt_start") String dt_start, @Param("dt_end") String dt_end);

    List<Map<String, Object>> list_ship6(@Param("str_company") String str_company, @Param("dt_year") String dt_year);


    List<Map<String, Object>> list_ship5(@Param("str_company") String str_company, @Param("dt_start") String dt_start, @Param("dt_end") String dt_end);

    List<Map<String, Object>> list_ship5D(@Param("str_company") String str_company, @Param("dt_start") String dt_start, @Param("dt_end") String dt_end,@Param("str_state") String str_state);

}
