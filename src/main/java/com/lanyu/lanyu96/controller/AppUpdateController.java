package com.lanyu.lanyu96.controller;

import com.lanyu.lanyu96.bean.AppUpdateBean;
import com.lanyu.lanyu96.mapper.AppUpdateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/app_update_zhou"})
public class AppUpdateController {

    @Autowired
    private AppUpdateMapper updateMapper;

    @RequestMapping(value="/app_update_zhou")
    @ResponseBody
    public String getAppUpdateInfo(int isAble) {
        AppUpdateBean appUpdateInfo = updateMapper.getAppUpdateInfo(isAble);
        if (appUpdateInfo != null) {
            return appUpdateInfo.getAddress();
        } else {
            return "";
        }

    }

}
