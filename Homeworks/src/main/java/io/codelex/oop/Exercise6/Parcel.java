package io.codelex.oop.Exercise6;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;


    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }


    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength <= 300) {
            System.out.println("Dimension sum are within range of 300");
        } else {
            System.out.println("Dimension sum are OVER 300!!!");
            return false;
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("At least one of dimensions are UNDER 30!!!");
            return false;
        } else {
            System.out.println("All dimensions are within range over 30");
        }
        if (!isExpress) {
            if (weight >= 30) {
                System.out.println("Package is overweight");
                return false;
            } else {
                System.out.println("Package is in weight range");
            }
        }
        if (isExpress) {
            if (weight >= 15) {
                System.out.println("Package is overweight");
                return false;
            } else {
                System.out.println("Package is in weight range");
            }
        }
        return true;
    }
}
