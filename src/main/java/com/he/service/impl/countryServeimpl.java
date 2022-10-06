package com.he.service.impl;

import com.he.mapper.countryMapper;
import com.he.pojo.country;
import com.he.service.countryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class countryServeimpl implements countryService {
  @Autowired
  private countryMapper countryMapper;
  @Override
  public List<country> getallcountry() {
    return countryMapper.getallcountry();
  }

  @Override
  public List<country> deletecountryByid(int aid) {
     return null;
  }

  @Override
  public Boolean countryinsert(country country) {
    return null;
  }

  @Override
  public Boolean updatecountry(country country) {
    return null;
  }

  @Override
  public List<country> areaselectById(int cid) {
    return null;
  }

  @Override
  public List<country> findAllUserByPageF(int pageNum, int pageSize) {
    return null;
  }

}
