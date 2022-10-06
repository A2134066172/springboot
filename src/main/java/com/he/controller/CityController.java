package com.he.controller;

import com.he.mapper.cityMapper;
import com.he.pojo.city;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "城市数据接口")
@RequestMapping("/city")
public class CityController {

  @Autowired
  private  cityMapper cityMapper;

  @GetMapping("/all")

  public List<city>  citygetAll(){
    List<city> citygetall = cityMapper.citygetall();
    return citygetall;
  }

  @DeleteMapping("/{id}")
  public int deletecityByid(@PathVariable("id") int id){
   return cityMapper.deletecityByid(id);
  }


}
