package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        List<Sound> sounds = new ArrayList<>();
        Firework firework = new Firework();
        Parrot parrot = new Parrot();
        Radio radio = new Radio();

        sounds.add(firework);
        sounds.add(parrot);
        sounds.add(radio);

        sounds.forEach(Sound::playSound);

    }
}
