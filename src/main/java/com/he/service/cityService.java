package com.he.service;

import com.he.pojo.city;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface cityService {
  List<city> citygetall();
   int deletecityByid(int cityid);
}
