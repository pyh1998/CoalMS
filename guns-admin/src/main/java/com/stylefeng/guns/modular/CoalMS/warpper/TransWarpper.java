package com.stylefeng.guns.modular.CoalMS.warpper;

import com.stylefeng.guns.core.base.warpper.BaseControllerWarpper;

import java.util.Map;

public class TransWarpper extends BaseControllerWarpper  {
    public TransWarpper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        map.put("addFile", "warpperName");
    }
}
