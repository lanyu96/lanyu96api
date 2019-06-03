package com.lanyu.lanyu96;

import com.lanyu.lanyu96.bean.AppUpdateBean;
import com.lanyu.lanyu96.mapper.AppUpdateMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Lanyu96ApplicationTests {


    @Autowired
    AppUpdateMapper updateMapper;
    @Test
    public void contextLoads() {
        AppUpdateBean appUpdateInfo = updateMapper.getAppUpdateInfo(1);
        System.out.println("信息：" + appUpdateInfo.getAddress() + appUpdateInfo.getContext());

    }

}
