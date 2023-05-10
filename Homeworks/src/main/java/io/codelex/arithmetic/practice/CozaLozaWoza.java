package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        String allTogether = "";
        for (int i=1; i<110; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                allTogether += "CozaLoza ";
            } else if (i % 3 == 0) {
                allTogether += "Coza ";
            } else if (i % 5 == 0) {
                allTogether += "Loza ";
            } else if (i % 7 == 0) {
                allTogether += "Woza ";
            } else allTogether += i+" ";

            if (i % 11 == 0) {
                allTogether += "\n";
            }
        }
        System.out.println(allTogether);
    }
}
