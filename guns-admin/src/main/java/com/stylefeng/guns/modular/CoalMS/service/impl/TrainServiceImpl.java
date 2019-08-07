package com.stylefeng.guns.modular.CoalMS.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.stylefeng.guns.modular.system.dao.TVTrainmainMapper;
import com.stylefeng.guns.modular.system.model.TVTrainmain;
import com.stylefeng.guns.modular.system.service.TrainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TrainServiceImpl extends ServiceImpl<TVTrainmainMapper , TVTrainmain> implements TrainService {

    @Override
    public List<Map<String, Object>> list(String str_company,String dt_start,String dt_end) {
        return this.baseMapper.list(str_company,dt_start,dt_end);
    }
}