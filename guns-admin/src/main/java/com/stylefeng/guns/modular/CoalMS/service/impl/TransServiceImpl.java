package com.stylefeng.guns.modular.CoalMS.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.stylefeng.guns.modular.CoalMS.dao.TVShipmainMapper;
import com.stylefeng.guns.modular.CoalMS.model.TVShipmain;
import com.stylefeng.guns.modular.CoalMS.service.TransService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransServiceImpl extends ServiceImpl<TVShipmainMapper, TVShipmain> implements TransService {

}
