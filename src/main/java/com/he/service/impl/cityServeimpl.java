package com.he.service.impl;

import com.he.mapper.cityMapper;
import com.he.pojo.city;
import com.he.service.cityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class cityServeimpl implements cityService {
  @Autowired
  private cityMapper cityMapper;
  @Override
  public List<city> citygetall() {
    return cityMapper.citygetall();
  }

  @Override
  public int deletecityByid(int cid) {
    return cityMapper.deletecityByid(cid);
  }
}
