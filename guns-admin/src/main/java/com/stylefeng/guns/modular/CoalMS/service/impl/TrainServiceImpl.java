package com.stylefeng.guns.modular.CoalMS.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.stylefeng.guns.modular.CoalMS.dao.TVTrainmainMapper;
import com.stylefeng.guns.modular.CoalMS.model.TVTrainmain;
import com.stylefeng.guns.modular.CoalMS.service.TrainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TrainServiceImpl extends ServiceImpl<TVTrainmainMapper, TVTrainmain> implements TrainService {
    public List<Map<String, Object>> search1(String str_company, String dt_start, String dt_end) {
        return this.baseMapper.search1(str_company,dt_start,dt_end);
    }
}
