package model;

import model.Idea;

import java.util.List;

public interface IdeaDAO {
    boolean add(Idea idea);

    List<Idea> findAll();

    Idea findBySlug(String slug);
}