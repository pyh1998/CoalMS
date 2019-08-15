package com.stylefeng.guns.modular.CoalMS.service;

import com.baomidou.mybatisplus.service.IService;
import com.stylefeng.guns.modular.CoalMS.model.TVTrain;

import java.util.List;
import java.util.Map;


public interface TrainService extends IService<TVTrain> {
    List<Map<String, Object>> search1(String str_company, String dt_start, String dt_end);
    List<Map<String, Object>> search2(String dt_start, String dt_end);
    List<Map<String, Object>> search2D(String str_company, String dt_date);
    List<Map<String, Object>> search3(String str_company, String dt_start, String dt_end);
    List<Map<String, Object>> search4(String str_company, String dt_start, String dt_end,String str_ftraincodevcr);
    List<Map<String, Object>> search6(String str_company,String dt_start,String dt_end,String str_station,String str_first,String str_coalname);
    List<Map<String, Object>> search4D(String str_company,String dt_start,String dt_end,String str_trainno);

    List<Map<String, Object>> search3D(String str_company, String dt_start, String dt_end, String str_ftraincodevcr);


    //List<Map<String, Object>> list(@Param("str_company") String str_company, @Param("dt_start") String dt_start, @Param("dt_end") String dt_end);

}
