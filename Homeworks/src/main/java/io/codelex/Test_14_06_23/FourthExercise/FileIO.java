package io.codelex.Test_14_06_23.FourthExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {
        try {
            reverseFile("D:\\OneDRIVE_2\\OneDrive\\Privata_Mape\\Programmesana\\JavaKursi\\New-home-work\\Homeworks\\src\\main\\java\\io\\codelex\\Test_14_06_23\\FourthExercise\\test.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void reverseFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        String content = Files.readString(path);
        String reversedContent = new StringBuilder(content).reverse().toString();
        String fileName = path.getFileName().toString();
        String baseName = fileName.contains(".") ? fileName.substring(0, fileName.lastIndexOf(".")) : fileName;
        String reversedFileName = new StringBuilder(baseName).reverse().toString();
        Path directory = path.getParent();
        Files.writeString(Paths.get(directory.toString(), reversedFileName + ".txt"), reversedContent);
    }
}
