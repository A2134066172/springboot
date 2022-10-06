package com.he.controller.vo;

import lombok.Data;

@Data
public class PageVo<T> {
    private  T data;
    private  Long total;

}
