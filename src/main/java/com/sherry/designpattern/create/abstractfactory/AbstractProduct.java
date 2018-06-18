package com.sherry.designpattern.create.abstractfactory;

import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2018/6/17 下午3:04
 */
@Data
public abstract class AbstractProduct {
    private String productName;
    public abstract String getProductName();

}
