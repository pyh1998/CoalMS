package com.stylefeng.guns.modular.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.modular.system.model.TVTrainmain;
import com.stylefeng.guns.modular.system.model.TVTrainmainExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TVTrainmainMapper extends BaseMapper<TVTrainmain> {
    int countByExample(TVTrainmainExample example);

    int deleteByExample(TVTrainmainExample example);



    int insertSelective(TVTrainmain record);

    List<TVTrainmain> selectByExample(TVTrainmainExample example);

    int updateByExampleSelective(@Param("record") TVTrainmain record, @Param("example") TVTrainmainExample example);

    int updateByExample(@Param("record") TVTrainmain record, @Param("example") TVTrainmainExample example);

    List<Map<String, Object>> list(@Param("str_company") String str_company , @Param("dt_start") String dt_start, @Param("dt_end") String dt_end);
}