package com.stylefeng.guns.modular.CoalMS.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.stylefeng.guns.modular.CoalMS.dao.TVTrainMapper;
import com.stylefeng.guns.modular.CoalMS.model.TVTrain;
import com.stylefeng.guns.modular.CoalMS.service.TrainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TrainServiceImpl extends ServiceImpl<TVTrainMapper,TVTrain> implements TrainService {
    public List<Map<String, Object>> search1(String str_company, String dt_start, String dt_end) {
        return this.baseMapper.search1(str_company,dt_start,dt_end);
    }
    public List<Map<String, Object>> search2(String dt_start, String dt_end) {
        return this.baseMapper.search2(dt_start,dt_end);
    }
    public List<Map<String, Object>> search2D(String str_company, String dt_date) {
        return this.baseMapper.search2D(str_company,dt_date);
    }
    public List<Map<String, Object>> search3(String str_company, String dt_start, String dt_end) {
        return this.baseMapper.search3(str_company,dt_start,dt_end);
    }

    public List<Map<String, Object>> search3D(String str_company, String dt_start, String dt_end,String str_ftraincodevcr) {
        return this.baseMapper.search3D(str_company, dt_start, dt_end,str_ftraincodevcr);
    }
    public List<Map<String, Object>> search4(String str_company, String dt_start, String dt_end,String str_ftraincodevcr) {
        return this.baseMapper.search4(str_company, dt_start, dt_end,str_ftraincodevcr);
    }
    public List<Map<String, Object>> search5(String str_company, String dt_year) {
        return this.baseMapper.search5(str_company,dt_year);
    }
    public List<Map<String, Object>> search6(String str_company,String dt_start,String dt_end,String str_station,String str_first,String str_coalname) {
        return this.baseMapper.search6(str_company,dt_start,dt_end,str_station,str_first,str_coalname);
    }
    public List<Map<String, Object>> search4D(String str_company,String dt_start,String dt_end,String str_trainno) {
        return this.baseMapper.search4D(str_company,dt_start,dt_end,str_trainno);
    }

    public List<Map<String, Object>> search77(String str_company, String dt_start, String dt_end,String str_ftraincodevcr,String str_status,String str_trainno) {
        return this.baseMapper.search77(str_company, dt_start, dt_end,str_ftraincodevcr,str_status,str_trainno);
    }

    public List<Map<String, Object>> search8(String str_company, String dt_year, String str_station, String str_coalname) {
        return this.baseMapper.search8(str_company,dt_year,str_station,str_coalname);
    }
}
