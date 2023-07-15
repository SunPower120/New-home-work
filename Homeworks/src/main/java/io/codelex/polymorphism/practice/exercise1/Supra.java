package io.codelex.polymorphism.practice.exercise1;

class Supra implements CarWithNitro {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 13;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 13;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 40;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }


}
