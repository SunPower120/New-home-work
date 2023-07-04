package io.codelex.oop.Exercise6;

public class ValidateApp {
    public static void main(String[] args) {


        Parcel parcel1 = new Parcel(100, 100, 200, 10, false);
        System.out.println("Parcel 1 " + parcel1.validate() + "\n");

        Parcel parcel2 = new Parcel(100, 100, 10, 10, false);
        System.out.println("Parcel 2 " + parcel2.validate() + "\n");

        Parcel parcel3 = new Parcel(100, 100, 50, 40, false);
        System.out.println("Parcel 3 " + parcel3.validate() + "\n");

        Parcel parcel4 = new Parcel(100, 100, 50, 25, false);
        System.out.println("Parcel 4 " + parcel4.validate() + "\n");

        Parcel parcel5 = new Parcel(100, 100, 50, 25, true);
        System.out.println("Parcel 5 " + parcel5.validate() + "\n");

        Parcel parcel6 = new Parcel(100, 100, 50, 10, true);
        System.out.println("Parcel 6 " + parcel6.validate() + "\n");
    }
}
