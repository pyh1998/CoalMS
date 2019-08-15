package com.stylefeng.guns.modular.CoalMS.service;

import com.baomidou.mybatisplus.service.IService;
import com.stylefeng.guns.modular.CoalMS.model.TVTrainmain;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface TrainService extends IService<TVTrainmain> {
    List<Map<String, Object>> search1(String str_company, String dt_start, String dt_end);



}
