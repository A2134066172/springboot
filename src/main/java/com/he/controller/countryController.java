package com.he.controller;

import com.he.pojo.country;
import com.he.service.countryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "国家数据接口")
@RequestMapping("/country")
public class countryController {
  @Autowired
  private countryService countryService;
  @RequestMapping("/getall")
  public List<country> countrygetall(){

    return countryService.getallcountry();
  }

}
