package com.he.service;

import com.github.pagehelper.PageInfo;
import com.he.controller.vo.PageVo;
import com.he.pojo.area;

import java.util.List;

public interface areaService {
  List  <area> areagetall();
  Boolean deleteareaByid(int aid);
  Boolean areainsert(area area);
  Boolean updatearea(area area);
  List<area> areaselectById(int aid);
  PageInfo<area> findAllUserByPageS(int pageNum, int pageSize);
}
