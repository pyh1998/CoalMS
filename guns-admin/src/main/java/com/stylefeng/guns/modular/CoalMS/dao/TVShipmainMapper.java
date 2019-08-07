package com.stylefeng.guns.modular.CoalMS.dao;

import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVShipmainMapper {
    int countByExample(TVShipmainExample example);

    int deleteByExample(TVShipmainExample example);

    int insert(TVShipmain record);

    int insertSelective(TVShipmain record);

    List<TVShipmain> selectByExample(TVShipmainExample example);

    int updateByExampleSelective(@Param("record") TVShipmain record, @Param("example") TVShipmainExample example);

    int updateByExample(@Param("record") TVShipmain record, @Param("example") TVShipmainExample example);
}