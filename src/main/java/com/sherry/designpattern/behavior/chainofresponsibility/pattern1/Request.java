package com.sherry.designpattern.behavior.chainofresponsibility.pattern1;

import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午5:01
 */
@Data
public class Request {
    private String value;

    public Request setValue(String value) {
        this.value = value;
        return this;
    }
}
