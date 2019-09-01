package com.sherry.designpattern.structure.bridge;

import com.sherry.designpattern.structure.bridge.impl.BigPen;
import com.sherry.designpattern.structure.bridge.impl.Red;

/**
 * 桥接模式
 * 场景：假设
 * 实现系统可能有多个角度分类，每一种角度都可能变化，那么把这种多角度分类给分离出来让他们独立变化，减少他们之间耦合。
 * 系统从多个维度分类，桥接模式将各维度独立变化
 *
 * https://www.cnblogs.com/WindSun/p/10260547.html
 *
 * Example：现需要提供大中小3种型号的画笔，能够绘制4种不同颜色，如果使用蜡笔，我们需要准备3*4=12支蜡笔，也就是说必须准备12个具体的蜡笔类。
 * 而如果使用毛笔的话，只需要3种型号的毛笔，外加4个颜料盒，用3+4=7个类就可以实现12支蜡笔的功能。
 *
 * @Author: Sherry
 * @Date: 2018/7/7 下午2:41
 */
public class Bridge {
    public static void main(String [] args){
        Color color = new Red();
        Pen pen = new BigPen();
        PenBridgeColor penBridgeColor = new PenBridgeColor();
        penBridgeColor.setColor(color);
        penBridgeColor.setPen(pen);
        String p = penBridgeColor.buildPen();
        System.out.println(p);
    }
}
