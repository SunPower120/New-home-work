package io.codelex.oop.summary.LazyBox;

public class LazyBox<T> {

    public interface Creator<T> {
        T create();
    }

    private T instance;
    private final Creator<T> creator;

    public LazyBox(Creator<T> creator) {
        this.creator = creator;
    }

    public T get() {
        if (instance == null) {
            instance = creator.create();
        }
        return instance;
    }
}
