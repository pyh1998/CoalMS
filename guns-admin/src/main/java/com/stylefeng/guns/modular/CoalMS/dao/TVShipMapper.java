package com.stylefeng.guns.modular.CoalMS.dao;

import com.stylefeng.guns.modular.CoalMS.model.TVShip;
import com.stylefeng.guns.modular.CoalMS.model.TVShipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVShipMapper {
    int countByExample(TVShipExample example);

    int deleteByExample(TVShipExample example);

    int insert(TVShip record);

    int insertSelective(TVShip record);

    List<TVShip> selectByExample(TVShipExample example);

    int updateByExampleSelective(@Param("record") TVShip record, @Param("example") TVShipExample example);

    int updateByExample(@Param("record") TVShip record, @Param("example") TVShipExample example);
}