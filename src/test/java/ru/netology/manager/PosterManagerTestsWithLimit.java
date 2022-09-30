package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTestsWithLimit {

    @Test
    public void findLastFilms() {
        PosterManager poster = new PosterManager(5);

        poster.addANewFilm("Film1");
        poster.addANewFilm("Film2");
        poster.addANewFilm("Film3");
        poster.addANewFilm("Film4");
        poster.addANewFilm("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsIfTotalFilmsUnderLimit() {
        PosterManager poster = new PosterManager(5);

        poster.addANewFilm("Film1");
        poster.addANewFilm("Film2");
        poster.addANewFilm("Film3");

        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsIfTotalFilmsOverLimit() {
        PosterManager poster = new PosterManager(5);

        poster.addANewFilm("Film1");
        poster.addANewFilm("Film2");
        poster.addANewFilm("Film3");
        poster.addANewFilm("Film4");
        poster.addANewFilm("Film5");
        poster.addANewFilm("Film6");
        poster.addANewFilm("Film7");
        poster.addANewFilm("Film8");

        String[] expected = {"Film8", "Film7", "Film6", "Film5", "Film4"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
