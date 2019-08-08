package com.stylefeng.guns.modular.CoalMS.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.modular.CoalMS.model.TVTrainmain;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TVTrainmainMapper extends BaseMapper<TVTrainmain> {

    List<Map<String, Object>> search1(@Param("str_company") String str_company, @Param("dt_start")String dt_start, @Param("dt_end") String dt_end);

}
