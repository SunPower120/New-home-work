package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Geometry {
    public static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal height) {
        return base.multiply(height).divide(new BigDecimal("2"), RoundingMode.HALF_UP);
    }

    public static BigDecimal areaOfCircle(BigDecimal radius) {
        return BigDecimal.valueOf(Math.PI).multiply(radius).multiply(radius);
    }

    public static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width);
    }
}
