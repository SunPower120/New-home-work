package io.codelex.enums.practice.Exercise1;


public enum CardinalPointsAbstract {

    NORTH {
        public String direction() {
            return "up";
        }
    },

    SOUTH {
        public String direction() {
            return "down";
        }
    },

    EAST {
        public String direction() {
            return "right";
        }
    },

    WEST {
        public String direction() {
            return "left";
        }
    };

    public abstract String direction();

    public static void printAllEnums() {
        for (CardinalPointsAbstract cardinalPoint : values()) {
            System.out.println(cardinalPoint + ":" + cardinalPoint.direction() + ":" + cardinalPoint.ordinal());
        }
    }

}
