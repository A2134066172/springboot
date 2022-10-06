package com.he.mapper;

import com.he.pojo.area;
import com.he.pojo.city;

import java.util.List;

public interface cityMapper {
  //查询所有
  List<city> citygetall();
  //删除一个元素
  Boolean deletecityByid(int cityid);
  //插入数据
  Boolean cityinsert(city city);
//查询一条数据



}
