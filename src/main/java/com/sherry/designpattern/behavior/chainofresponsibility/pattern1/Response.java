package com.sherry.designpattern.behavior.chainofresponsibility.pattern1;

import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午5:01
 */
@Data
public class Response {
    private String responseMsg;

    public Response setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
        return this;
    }
}
