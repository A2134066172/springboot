package com.he.mapper;

import com.he.pojo.area;

import java.util.List;


public interface areaMapper {
  public List<area> areagetall();
   //删除数据
  public Boolean deleteareaByid(int aid);
  //插入数据
  Boolean areainsert(area area);
  //修改数据
  Boolean updatearea(area area);
  //查询一条数据
  List<area> areaselectById(int aid);

  //分页查询数据
  List<area> findAllUserByPageF(int pageNum,int pageSize);


}
