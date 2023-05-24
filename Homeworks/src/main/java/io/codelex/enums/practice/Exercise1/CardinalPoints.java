package io.codelex.enums.practice.Exercise1;

import java.util.EnumMap;
import java.util.Map;

public enum CardinalPoints {

    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String direction;

    CardinalPoints(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public static void printAllEnums() {
        for (CardinalPoints cardinalPoint : values()) {
            System.out.println(cardinalPoint + ":" + cardinalPoint.getDirection() + ":" + cardinalPoint.ordinal());
        }
    }

    public static void printAllMappedEnums() {
        Map<CardinalPoints, String> enumMap = new EnumMap<>(CardinalPoints.class);
        enumMap.put(CardinalPoints.NORTH, CardinalPoints.NORTH.getDirection());
        enumMap.put(CardinalPoints.SOUTH, CardinalPoints.SOUTH.getDirection());
        enumMap.put(CardinalPoints.EAST, CardinalPoints.EAST.getDirection());
        enumMap.put(CardinalPoints.WEST, CardinalPoints.WEST.getDirection());

        for (Map.Entry<CardinalPoints, String> entry : enumMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + ":" + entry.getKey().ordinal());
        }
    }
}
