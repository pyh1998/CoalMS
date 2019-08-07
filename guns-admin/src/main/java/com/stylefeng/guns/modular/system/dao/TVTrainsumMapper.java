package com.stylefeng.guns.modular.system.dao;

import com.stylefeng.guns.modular.system.model.TVTrainsum;
import com.stylefeng.guns.modular.system.model.TVTrainsumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVTrainsumMapper {
    int countByExample(TVTrainsumExample example);

    int deleteByExample(TVTrainsumExample example);

    int insert(TVTrainsum record);

    int insertSelective(TVTrainsum record);

    List<TVTrainsum> selectByExample(TVTrainsumExample example);

    int updateByExampleSelective(@Param("record") TVTrainsum record, @Param("example") TVTrainsumExample example);

    int updateByExample(@Param("record") TVTrainsum record, @Param("example") TVTrainsumExample example);
}