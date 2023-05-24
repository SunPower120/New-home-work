package io.codelex.enums.practice.Exercise1;

public class PrintEnums {

    public static void main(String[] args) {

        System.out.println("With if statement:");
        for (CardinalPoints cardinalPoint : CardinalPoints.values()) {
            System.out.println(cardinalPoint + ":" + cardinalPoint.getDirection() + ":" + cardinalPoint.ordinal());
        }
        System.out.println("With switch:");

        for (CardinalPoints cardinalPoint : CardinalPoints.values()) {
            switch (cardinalPoint) {
                case NORTH, SOUTH, EAST, WEST ->
                        System.out.println(cardinalPoint + ":" + cardinalPoint.getDirection() + ":" + cardinalPoint.ordinal());
                default -> {
                }
            }
        }

        System.out.println("using field inside enum: ");
        CardinalPoints.printAllEnums();

        System.out.println("having abstract method: ");
        CardinalPointsAbstract.printAllEnums();

        System.out.println("mapping the values in EnumMap");
        CardinalPoints.printAllMappedEnums();

    }

}
