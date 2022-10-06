package com.he.pojo;

import lombok.Data;

import java.util.List;

@Data
public class area {
  private  int aid;
  private  String aname;
  private int cid;
  private List<city> cityList;

}
