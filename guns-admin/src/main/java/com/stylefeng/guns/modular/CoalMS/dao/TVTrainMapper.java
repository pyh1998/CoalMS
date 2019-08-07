package com.stylefeng.guns.modular.CoalMS.dao;

import com.stylefeng.guns.modular.CoalMS.model.TVTrain;
import com.stylefeng.guns.modular.CoalMS.model.TVTrainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVTrainMapper {
    int countByExample(TVTrainExample example);

    int deleteByExample(TVTrainExample example);

    int insert(TVTrain record);

    int insertSelective(TVTrain record);

    List<TVTrain> selectByExample(TVTrainExample example);

    int updateByExampleSelective(@Param("record") TVTrain record, @Param("example") TVTrainExample example);

    int updateByExample(@Param("record") TVTrain record, @Param("example") TVTrainExample example);
}