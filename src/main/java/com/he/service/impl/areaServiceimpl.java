package com.he.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.he.controller.vo.PageVo;
import com.he.mapper.areaMapper;
import com.he.pojo.area;
import com.he.service.areaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class areaServiceimpl implements areaService {
  @Autowired
  private areaMapper areaMapper;


  @Override
  public List<area> areagetall() {
    return  areaMapper.areagetall();
  }

  @Override
  public Boolean deleteareaByid(int aid) {
    return areaMapper.deleteareaByid(aid);
  }

  @Override
  public Boolean areainsert(area area) {
    return areaMapper.areainsert(area);
  }

  @Override
  public Boolean updatearea(area area) {
    return areaMapper.updatearea(area);
  }

  @Override
  public List<area> areaselectById(int aid) {
    return areaMapper.areaselectById(aid);
  }

  @Override
  public PageInfo<area> findAllUserByPageS(int pageNum, int pageSize) {
    PageHelper.startPage(pageNum, pageSize);
    final List<area> lists = areaMapper.areagetall();
    PageInfo<area> pageInfo = new PageInfo<area>(lists);
    return pageInfo;

  }


}
