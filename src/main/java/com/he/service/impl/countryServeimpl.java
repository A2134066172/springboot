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

}
