package com.stylefeng.guns.modular.CoalMS.service;

import com.baomidou.mybatisplus.service.IService;
import com.stylefeng.guns.modular.system.model.TVTrainmain;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//要改对应的实体类！！！！！！！！！改TVTrainmain！！！！！！！

public interface ShipService extends IService<TVTrainmain> {

    List<Map<String, Object>> list(@Param("str_company") String str_company, @Param("dt_start") String dt_start, @Param("dt_end") String dt_end);

}