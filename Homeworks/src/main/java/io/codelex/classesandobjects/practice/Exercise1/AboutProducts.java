package io.codelex.classesandobjects.practice.Exercise1;

public class AboutProducts {
    public static void main(String[] args) {
        Product pcMouse = new Product("Logitech mouse", 70.00, 14);
        Product mobilePhone = new Product("iPhone 5s", 999.99, 3);
        Product printer = new Product("Epson EB-U05", 440.46, 1);


        printer.printProduct();
        mobilePhone.printProduct();
        pcMouse.printProduct();
        pcMouse.setPriceAtStart(187.78);
        pcMouse.setAmountAtStart(1789);
        pcMouse.printProduct();
    }


}
