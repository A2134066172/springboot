package com.he.controller.vo;

import lombok.Data;

@Data
public class ResultVo<T> {
    public Integer code;
    public T data;
}
