package com.stylefeng.guns.modular.CoalMS.service;

import com.baomidou.mybatisplus.service.IService;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
import com.stylefeng.guns.modular.CoalMS.model.TVTrain;

public interface TransService extends IService<TVShipmain>{
    boolean insert(TVShipmain tvShipmain);
}
