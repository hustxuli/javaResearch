package com.sherry.designpattern.behavior.state.commonpattern.core;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 上午12:27
 */
public interface Handler {

    /** currentStatus在触发Event后的处理
     *
     * @param context 上下文参数，用于在各个状态流转时传递参数
     * @param stateMachine currentStatus在触发Event后的处理，处理的结果决定下一个流转的方向(下一个事件是什么)，用于调用stateMachine.fire(event,context)
     */
    public void handle(Context context, StateMachine stateMachine);
}
