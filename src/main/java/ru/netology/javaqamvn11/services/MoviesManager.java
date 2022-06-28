package ru.netology.javaqamvn11.services;
public class MoviesManager {
    protected String[] movies = new String[0];
    protected int limit;

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public MoviesManager() {
        limit = 10;
    }

    public void add(String film) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int result = 0;
        if (movies.length < limit) {
            result = movies.length;
        } else {
            result = limit;
        }
        String[] track = new String[result];
        for (int i = 0; i < track.length; i++) {
            track[i] = movies[movies.length - 1 - i];
        }
        return track;
    }
}
