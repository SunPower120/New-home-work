package io.codelex.oop.Exercise2;

public class Customer extends Person {

    private int purchaseCount;

    public Customer(String firstName, String lastName, String iD, int age, int purchaseCount) {
        super(firstName, lastName, iD, age);
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " " + iD + " " + getPurchaseCount();
    }
}


