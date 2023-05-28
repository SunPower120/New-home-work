package io.codelex.oop.Exercise5;

public class MeasurementConverter {

    public double getResult(int input, ConversionType conversionType) {
        return input * conversionType.getConversionFactor();
    }

}
