package com.sherry.designpattern.structure.bridge;

import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2019/9/1 下午5:40
 */
@Data
public class PenBridgeColor {
    private Color color;
    private Pen pen;

    public String buildPen(){
        return color.draw() + pen.penType();
    }
}
