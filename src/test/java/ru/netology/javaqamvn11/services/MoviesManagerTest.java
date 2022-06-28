package ru.netology.javaqamvn11.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void managerFilmTest() {
        MoviesManager manager = new MoviesManager();

        manager.add("F1");

        String[] actual = manager.findAll();
        String[] expected = {"F1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void managerFilmsTest() {
        MoviesManager manager = new MoviesManager();

        manager.add("F1");
        manager.add("F2");
        manager.add("F3");
        manager.add("F4");

        String[] actual = manager.findAll();
        String[] expected = {"F1", "F2", "F3", "F4"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void managerMaxFilmsTest() {
        MoviesManager manager = new MoviesManager();

        manager.add("F1");
        manager.add("F2");
        manager.add("F3");
        manager.add("F4");
        manager.add("F5");
        manager.add("F6");
        manager.add("F7");
        manager.add("F8");
        manager.add("F9");
        manager.add("F10");

        String[] actual = manager.findLast();
        String[] expected = {"F10","F9", "F8", "F7", "F6", "F5", "F4", "F3", "F2", "F1"};

        Assertions.assertArrayEquals(actual, expected);
    }
}
