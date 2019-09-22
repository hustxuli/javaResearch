package com.sherry.designpattern.behavior.state.commonpattern.core;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文参数传递使用，Object不要用泛型，因为在各个状态间流转的data可能不是一个类型
 * @Author: Sherry
 * @Date: 2019/9/22 下午12:19
 */
public class Context {
    private Map<String, Object> dataMap;

    public Context() {
        this.dataMap = new HashMap<>();
    }

    public Object getData(String key){
        return dataMap.get(key);
    }

    public Object setData(String key,Object value){
        return dataMap.put(key,value);
    }
}
