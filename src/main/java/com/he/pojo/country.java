package com.he.pojo;

import lombok.Data;

import java.util.List;

@Data
public class country {

  private  int cid ;
  private  String cname;
  //  多对多
  private List<area> countrygetall;

}
