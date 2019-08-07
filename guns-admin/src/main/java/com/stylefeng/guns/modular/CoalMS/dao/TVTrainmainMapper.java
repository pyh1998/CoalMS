package com.stylefeng.guns.modular.CoalMS.dao;

import com.stylefeng.guns.modular.CoalMS.model.TVTrainmain;
import com.stylefeng.guns.modular.CoalMS.model.TVTrainmainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVTrainmainMapper {
    int countByExample(TVTrainmainExample example);

    int deleteByExample(TVTrainmainExample example);

    int insert(TVTrainmain record);

    int insertSelective(TVTrainmain record);

    List<TVTrainmain> selectByExample(TVTrainmainExample example);

    int updateByExampleSelective(@Param("record") TVTrainmain record, @Param("example") TVTrainmainExample example);

    int updateByExample(@Param("record") TVTrainmain record, @Param("example") TVTrainmainExample example);
}