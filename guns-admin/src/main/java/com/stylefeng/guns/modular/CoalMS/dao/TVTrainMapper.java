package com.stylefeng.guns.modular.CoalMS.dao;

import com.stylefeng.guns.modular.CoalMS.model.TVTrain;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TVTrainMapper extends BaseMapper<TVTrain>{

    List<Map<String, Object>> search1(@Param("str_company") String str_company, @Param("dt_start")String dt_start, @Param("dt_end") String dt_end);
    List<Map<String, Object>> search2(@Param("dt_start")String dt_start, @Param("dt_end") String dt_end);
    List<Map<String, Object>> search2D(@Param("str_company") String str_company,@Param("dt_date") String dt_date);
    List<Map<String, Object>> search4(@Param("str_company") String str_company, @Param("dt_start")String dt_start, @Param("dt_end") String dt_end,@Param("str_ftraincodevcr") String str_ftraincodevcr);
    List<Map<String, Object>> search6(@Param("str_company") String str_company, @Param("dt_start")String dt_start, @Param("dt_end") String dt_end,@Param("str_station")String str_station,@Param("str_first")String str_first,@Param("str_coalname")String str_coalname);
    List<Map<String, Object>> search4D(@Param("str_company") String str_company, @Param("dt_start")String dt_start, @Param("dt_end") String dt_end,@Param("str_trainno") String str_trainno);

    List<Map<String, Object>> search3(@Param("str_company") String str_company, @Param("dt_start")String dt_start, @Param("dt_end") String dt_end);

    List<Map<String, Object>> search3D(@Param("str_company") String str_company, @Param("dt_start")String dt_start, @Param("dt_end") String dt_end,@Param("str_ftraincodevcr") String str_ftraincodevcr);
}