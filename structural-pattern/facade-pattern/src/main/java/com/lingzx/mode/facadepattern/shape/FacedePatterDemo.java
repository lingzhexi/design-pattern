package com.lingzx.mode.facadepattern.shape;

/**
 * 外观模式==> 不行就
 */
public class FacedePatterDemo {
    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();

        maker.drawCircle();
        maker.drawRect();
        maker.drawSquare();
    }
}
