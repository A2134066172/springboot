package com.he.mapper;

import com.he.pojo.area;
import com.he.pojo.country;

import java.util.List;

public interface countryMapper {
//  查找数据
  List<country> getallcountry();


  //删除数据
  public Boolean deletecountryByid(int aid);
  //插入数据
  Boolean countryinsert(country country);
  //修改数据
  Boolean updatecountry(country country);
  //查询一条数据
  List<area> areaselectById(int cid);

  //分页查询数据
  List<area> findAllUserByPageF(int pageNum,int pageSize);
}
