package com.he.util;

import com.he.controller.vo.ResultVo;

public class ResultVoutil {

    public static ResultVo success(Object object){
        ResultVo resultVo =new ResultVo();
        resultVo.setCode(0);//代表成功
        resultVo.setData(object);
        return resultVo;
    }
    public static ResultVo fail(){
        ResultVo resultVo =new ResultVo();
        resultVo.setCode(-1);//代表失败
        return resultVo;
    }
}
