package com.he.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户实体类", description = "用户信息描述类")
public class city {
  @ApiModelProperty(value = "城市id")
  private  int cityid;
  @ApiModelProperty(value = "城市名称")
  private  String cityname;
  @ApiModelProperty(value = "城市人口数量")
  private  double citysize;
  private  int aid;
  //一对多关系映射
  private  area area;


}
