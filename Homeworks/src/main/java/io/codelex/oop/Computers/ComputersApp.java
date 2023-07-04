package io.codelex.oop.Computers;

public class ComputersApp {

    public static void main(String[] args) {

        Computers comp1 = new Computers("Intel i7", "16GB", "NVIDIA GTX 1650", "Dell", "Inspiron 5000");
        Computers comp2 = new Computers("AMD Ryzen 7", "32GB", "AMD Radeon RX 5700", "Asus", "ROG Strix");
        Computers comp3 = new Computers("Intel i9", "64GB", "NVIDIA RTX 3080", "Alienware", "Area-51m R2");

        Computers comp4 = new Computers(comp1.getProcessor(), comp2.getRam(), comp3.getGpu(), comp1.getCompany(), comp3.getModel());
        System.out.println(comp4);

        if (comp1.getProcessor().equals(comp4.getProcessor())) {
            comp4.setProcessor(comp2.getProcessor());
            System.out.println(comp4);
        }

        System.out.println(comp2.getProcessor().hashCode());
        System.out.println(comp4.getProcessor().hashCode());

        Laptop laptop1 = new Laptop("AMD Ryzen 7", "16GB", "NVIDIA GTX 1650", "Dell", "Inspiron 5000", "50000mAh");

        System.out.println(laptop1.getProcessor());
        laptop1.setProcessor(comp1.getProcessor());
        System.out.println(laptop1.getProcessor());


    }


}
