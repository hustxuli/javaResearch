package com.sherry.designpattern.behavior.event;

import java.util.EventListener;

/**
 *
 * @Author: Sherry
 * @Date: 2019/9/22 下午4:55
 */
public interface Listener<E extends Event> //extends EventListener
{
    public void update(E event,Object arg);
}
