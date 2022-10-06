package com.he.controller;

import com.github.pagehelper.PageInfo;
import com.he.controller.vo.ResultVo;
import com.he.pojo.area;
import com.he.service.areaService;
import com.he.util.ResultVoutil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/area")
@Api(tags = "地区数据接口")
public class areaController {

  @Autowired
  private areaService areaService;

  @ApiOperation(value = "查询所有区域以及城市", notes = "传入全部的区域获取全部区域的城市")
  @GetMapping("areagetall")
  public ResultVo areagetall(){
    List<area> areagetall =  areaService.areagetall();
    return ResultVoutil.success(areagetall);

  }

  @ApiOperation(value = "删除区域", notes = "根据 id 区域")
  @ApiResponses({
    @ApiResponse(code = 0, message = "删除成功！"),
    @ApiResponse(code = -1, message = "删除失败！")
  })
  @DeleteMapping("/{id}")
  public ResultVo deletecityByid(@PathVariable("id") int id){
    Boolean saveBoolean = areaService.deleteareaByid(id);
    if (!saveBoolean){
      return ResultVoutil.fail();
    }
    else {return ResultVoutil.success(saveBoolean);}
  }

  @ApiOperation(value = "新增一个城市区域", notes = "传入要新增的城市区域")
  @PostMapping("/save")
  public ResultVo areainsert(@RequestBody area area){
    Boolean save = areaService.areainsert(area);
    if (!save){
             return ResultVoutil.fail();
    }else {
      return ResultVoutil.success(save);
    }

  }


  @ApiOperation(value = "修改城市区域", notes = "传入城市信息进行更新修改")
  @PostMapping("/update")
  public ResultVo areupdate(@RequestBody area area){
    Boolean updatearea = areaService.updatearea(area);

    if (!updatearea){
      return ResultVoutil.fail();
    }else {
      return ResultVoutil.success(updatearea);
    }
  }
  @ApiOperation(value ="查询城市", notes = "根据 id 查询城市信息")
  @ApiImplicitParam(paramType = "path", name = "id", value = "用户 id", required = true)
  @GetMapping("/{id}")
  public  ResultVo<area> areaById(@PathVariable("id") int id){
    List<area> areas = areaService.areaselectById(id);
    return ResultVoutil.success(areas);

  }
  @ApiOperation(value ="地区城市信息分页查询", notes = "根据 id 分页查询地区以及城市的信息")
  @GetMapping("/testPageHelper1/{pageNum}/{pageSize}")
  public ResultVo testPageHelper1(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize")int pageSize){
    PageInfo<area> queryResult = areaService.findAllUserByPageS(pageNum,pageSize);
    return ResultVoutil.success(queryResult);
  }


//  @GetMapping("/testPageHelper2")
//  public List<area> testPageHelper2(){
//    List<area> queryResult = areaService.findAllUserByPageF(1, 5);
//    return queryResult;
//  }


  @ApiIgnore
  @GetMapping("/user/test")
  public String test() {
    return "这是一个测试接口，不需要在api文档中显示。";
  }

}



