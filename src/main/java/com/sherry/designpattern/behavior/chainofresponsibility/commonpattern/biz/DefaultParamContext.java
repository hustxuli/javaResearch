package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.biz;

import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.core.ParamContext;
import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午6:52
 */
@Data
public class DefaultParamContext implements ParamContext{
    private boolean flag = true;

    @Override
    public boolean isContinue() {
        return flag;
    }
}
