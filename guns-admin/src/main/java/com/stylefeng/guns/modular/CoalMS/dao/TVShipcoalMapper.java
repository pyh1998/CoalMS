package com.stylefeng.guns.modular.CoalMS.dao;

import com.stylefeng.guns.modular.CoalMS.model.TVShipcoal;
import com.stylefeng.guns.modular.CoalMS.model.TVShipcoalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVShipcoalMapper {
    int countByExample(TVShipcoalExample example);

    int deleteByExample(TVShipcoalExample example);

    int insert(TVShipcoal record);

    int insertSelective(TVShipcoal record);

    List<TVShipcoal> selectByExample(TVShipcoalExample example);

    int updateByExampleSelective(@Param("record") TVShipcoal record, @Param("example") TVShipcoalExample example);

    int updateByExample(@Param("record") TVShipcoal record, @Param("example") TVShipcoalExample example);
}