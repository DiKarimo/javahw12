package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTests {
    PosterManager poster = new PosterManager();

    @BeforeEach
    public void films() {
        poster.addANewFilm("Film1");
        poster.addANewFilm("Film2");
        poster.addANewFilm("Film3");
        poster.addANewFilm("Film4");
        poster.addANewFilm("Film5");
        poster.addANewFilm("Film6");
        poster.addANewFilm("Film7");
        poster.addANewFilm("Film8");
        poster.addANewFilm("Film9");

    }

    @Test
    public void findAllFilms() {
        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7", "Film8", "Film9"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addANewFilm() {
        poster.addANewFilm("Film10");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7", "Film8", "Film9", "Film10"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastFilms() {
        String[] expected = {"Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
