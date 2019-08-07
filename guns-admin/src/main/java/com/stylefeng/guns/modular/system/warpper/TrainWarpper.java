package com.stylefeng.guns.modular.system.warpper;

import com.stylefeng.guns.core.base.warpper.BaseControllerWarpper;


import java.util.Map;


public class TrainWarpper extends BaseControllerWarpper {

    public TrainWarpper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        map.put("addFile", "warpperName");
    }

}