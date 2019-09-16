package com.sherry.designpattern.behavior.chainofresponsibility.pattern2;

import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午6:07
 */
@Data
public abstract class Handler {
    //后继者，next
    private Handler successor;

    public Handler setSuccessor(Handler successor) {
        this.successor = successor;
        //注意：这里不是return this;
        return successor;
    }

    public abstract void handleRequest(Param param);
}
