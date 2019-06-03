package com.lanyu.lanyu96.mapper;


import com.lanyu.lanyu96.bean.AppUpdateBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AppUpdateMapper {

    @Select("select * from app_update_zhou where isAble = #{isAble}")
    AppUpdateBean getAppUpdateInfo(int isAble);

}
